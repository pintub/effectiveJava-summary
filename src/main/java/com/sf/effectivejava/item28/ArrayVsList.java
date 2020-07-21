package com.sf.effectivejava.item28;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsList<E extends Number> {

    public static void main(String[] args) {
        Object[] objectArray = new Long[1];
        objectArray[0] = "Hi";
        System.out.println(objectArray);

        //List<Object> objectList = new ArrayList<Long>();
    }
}
