package com.sf.effectivejava.item7;

import java.util.Arrays;
import java.util.EmptyStackException;

//TODO Fix memory Leak
public class StackMemoryLeak {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackMemoryLeak() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    //Dereference the unnecessary object
    public Object pop() {//6
        if (size == 0)
            throw new EmptyStackException();
        Object poppedObject =   elements[--size];
        elements[size] = null;
        return poppedObject;
    }

    /**
     * Ensure space for at least one more element,
     * roughly
     * doubling the capacity each time the array needs
     * to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
