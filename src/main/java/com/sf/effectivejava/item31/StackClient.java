package com.sf.effectivejava.item31;

import java.util.ArrayList;
import java.util.List;

public class StackClient {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        stack.pushAll(new ArrayList<Integer>());

        List<Object> dest = new ArrayList<>();
        stack.popAll(dest);
    }


}
