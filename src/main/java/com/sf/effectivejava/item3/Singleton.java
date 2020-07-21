package com.sf.effectivejava.item3;

import java.io.Serializable;

//Singleton Pattern
public class Singleton implements Serializable {
    private static Singleton instance = null;

    private Singleton(){
        if(instance != null){
            throw new IllegalStateException();
        }
    }

    public static Singleton getInstance(){//Prevent multi-threading issue
        if(instance == null){
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //TODO Handle SingleTon attack - Reflection & Serialization
    protected Object readResolve() {//Called after readObject()
        return instance;
    }

}
