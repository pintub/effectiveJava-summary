package com.sf.effectivejava.item8;

//When non-final class can create partially correct objects,CHECK constructor
public class Vulnerable {

    Integer value = 0;
    Vulnerable(int value) {
        if(value <= 0) {
            throw new IllegalArgumentException("Vulnerable value must be positive");
        }
        this.value = value;
    }
    @Override
    public String toString() {
        return(value.toString());
    }
}
