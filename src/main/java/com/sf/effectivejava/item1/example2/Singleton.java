package com.sf.effectivejava.item1.example2;

//Singleton Pattern
//TODO implementation
public class Singleton {
    private static Singleton instance = null;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
