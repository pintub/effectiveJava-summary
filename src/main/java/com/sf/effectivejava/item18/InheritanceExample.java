package com.sf.effectivejava.item18;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class InheritanceExample<E> extends HashSet<E> {

    // The number of attempted element insertions
    private int addCount = 0;

    public InheritanceExample() {
    }

    public InheritanceExample(int initCap, float
        loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends
                E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        InheritanceExample<Object> obj = new InheritanceExample<>();
        Object[] objArray = {new Object(), new Object()};
        obj.addAll(Arrays.asList(objArray));
        System.out.println(obj.getAddCount());
    }
}
