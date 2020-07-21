package com.sf.effectivejava.item14;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

//WHEN Equals and compareTO are not similar
public class BigDecimalCompareExample {

    public static void main(String[] args) {
        BigDecimal x1 = new BigDecimal("1.0");
        BigDecimal x2 = new BigDecimal("1.00");
        System.out.println(x1 == x2);
        System.out.println(x1.compareTo(x2));

        HashSet hashSet = new HashSet();hashSet.add(x1);hashSet.add(x2);
        TreeSet treeSet = new TreeSet<>();treeSet.add(x1);treeSet.add(x2);

        System.out.println("HashSet:" + hashSet);
        System.out.println("TreeSet:" + treeSet);
    }
}
