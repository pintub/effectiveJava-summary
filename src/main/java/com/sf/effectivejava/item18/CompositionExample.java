package com.sf.effectivejava.item18;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CompositionExample<E> {

    //Composition
    private Set<E> set ;
    private int count = 0;

    public CompositionExample(Set<E> set){
        this.set = set;
    }

    //Forwarding method or Decorator Pattern
    public void addElement(E o){
        count++;
        set.add(o);
    }

    public void addElements(Collection<E> collection){
        count+= collection.size();
        set.addAll(collection);
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        CompositionExample<Object> compositionExample = new CompositionExample<>(new HashSet<>());
        Object[] objArray = {new Object(), new Object()};
        compositionExample.addElements(Arrays.asList(objArray));
        System.out.println(compositionExample.getCount());
    }
}
