package com.sf.effectivejava.item9;

public class TryFinallyExceptionIssue {

    public static void testWithTryFinally() throws Exception {
        Resource r = new Resource();
        try {
            r.doSomething();
        } finally {
            r.close();
        }
    }

    public static void testWithTryResources() throws Exception {
        try(Resource r = new Resource();) {
            r.doSomething();
        }
    }

    public static void main(String[] args) throws Exception {
        //testWithTryFinally();
        testWithTryResources();
    }

    static class Resource implements AutoCloseable{

        public void doSomething(){
            throw new RuntimeException("From doSomething");
        }

        @Override
        public void close() throws Exception {
            throw new RuntimeException("From Close");
        }
    }


}
