package com.sf.effectivejava.item13;

import com.google.gson.Gson;

import java.util.Arrays;

public class CloneExample implements Cloneable{

    private int x;
    private int y;
    private Dependent dependent;

    public CloneExample(int x, int y, Dependent dependent){
        this.x = x; this.y = y;this.dependent = dependent;
    }

    //TODO implement Deep copying using Cloneable
    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneExample dest = (CloneExample)super.clone();
        dest.dependent = new Dependent(this.dependent.getX(), this.dependent.getY());
        return dest;
    }

    //TODO implement copy Constructor
    public CloneExample(CloneExample src){
        this.x = src.x;
        this.y = src.y;
        this.dependent = new Dependent(src.dependent.getX(), src.dependent.getY());
    }

    //TODO implement static factory method
    public static CloneExample from(CloneExample src){
        return new CloneExample(src.x, src.y, new Dependent(src.dependent.getX(), src.dependent.getY()));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        //Clone() method Client
        Dependent dependent = new Dependent(3, 4);
        CloneExample src = new CloneExample(1, 2, dependent);
        CloneExample dest = (CloneExample) src.clone();
        System.out.println(dest);
        System.out.println(dest.dependent == src.dependent);
        //Copy Constructor Client
        CloneExample dest2 = new CloneExample(src);
        System.out.println(dest2);
        System.out.println(dest2.dependent == src.dependent);

        //Cloning using Google json lib
        Gson gson = new Gson();
        CloneExample dest3 = gson.fromJson(gson.toJson(src), CloneExample.class);
        System.out.println(dest3);
        System.out.println(dest3.dependent == src.dependent);
    }

    @Override
    public String toString() {
        return "CloneExample{" +
                "x=" + x +
                ", y=" + y +
                ", dependent=" + dependent +
                '}';
    }
}