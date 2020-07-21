package com.sf.effectivejava.item17;

public class MutableDependent {

    private String name;
    private int x;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
