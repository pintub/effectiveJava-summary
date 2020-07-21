package com.sf.effectivejava.item31;

import java.util.Collection;

public class Stack<E> {
    public Stack(){}
    public void push(E e){}
    public E pop(){
        return null;
    }
    public boolean isEmpty(){
        return false;
    }

    //TODO used PECS formula instead of using unbounded wildcard
    public void pushAll(Collection<? extends E> src) {
        //Implementation
    }

    //TODO used PECS formula instead of using unbounded wildcard
    public void popAll(Collection<? super E> dest) {
        //Implementation
    }
}
