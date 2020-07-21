package com.sf.effectivejava.item13;

public class Dependent {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Dependent(int x, int y){
        this.x =x;this.y = y;
    }

    @Override
    public String toString() {
        return "Dependent{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
