package com.sf.effectivejava.item26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//This class showcases issues of using generic type
public class GenericsExample<E> {

    //TODO add generic String type to catch issue at compile time
    private static void test1(){
        /*List list = new ArrayList();
        list.add("TEST");
        list.add("TEST");
        list.add("TEST");
        list.add(new Object());

        for(int i=0; i <list.size() ; i++){
            String str = (String) list.get(i);
            System.out.println(str);
        }*/
    }

    //TODO add generic String type to catch issue at compile time
    private static void test2(List list){
        list.add(new Object());
    }

    /**Difference List and List<Object> , List<Object> is type safe
     * No Difference while adding elements , HERE Hierarchy of generic type checked
     * Difference while passing List<String> obj to List or List<Object> Reference, HERE generic type checked
     */
    private void test3(){
        List list = new ArrayList();
        list.add("TEST");
        list.add(new Object());
        list = new ArrayList<String>();

        List<Object> listV2= new ArrayList();
        listV2.add("TEST");
        listV2.add(new Object());
        //listV2 = new ArrayList<String>();
    }

    /**Difference List and List<?> , List<?> is type safe
     * No Difference while adding elements , HERE Hierarchy of generic type checked
     * Difference while passing List<String> obj to List or List<Object> Reference, HERE generic type checked
     */
    private static void test4(){
        List list = new ArrayList();
        list.add("TEST");
        list.add(new Object());
        list = new ArrayList<String>();

        List<?> listV2= new ArrayList();
        //listV2.add("TEST");
        //listV2.add(new Object());
        listV2.add(null);
        listV2 = Arrays.asList("TEST", "TEST");
        listV2.get(0);
    }

    public static void main(String[] args) {
        //test1();

        List<String> list = new ArrayList();
        list.add("TEST");
        list.add("TEST");
        list.add("TEST");
        test2(list);
        for(int i=0; i <list.size() ; i++){
            String str = list.get(i);
            System.out.println(str);
        }

        //test3();
    }
}
