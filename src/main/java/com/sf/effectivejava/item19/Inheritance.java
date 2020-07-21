package com.sf.effectivejava.item19;

import java.time.Instant;

public class Inheritance {

    // Broken - constructor invokes an overridable method
    public Inheritance() {
        overrideMe();
    }

    public void overrideMe() {
    }
}

final class Sub extends Inheritance {

    // Blank final, set by constructor
    private final Instant instant;

    Sub() {
        instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
