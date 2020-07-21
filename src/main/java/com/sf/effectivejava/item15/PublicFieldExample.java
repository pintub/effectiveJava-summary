package com.sf.effectivejava.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PublicFieldExample {

    //public static final Object[] OBJ_ARRAY = {new Object(), new Object()};

    //TODO Fix above declaration ,which is array of mutable objects
    private static final Object[] OBJ_ARRAY = {new Object(), new Object()};
    public static final List<Object> OBJ_ARRAY_CLONE = Collections.unmodifiableList(Arrays.asList(OBJ_ARRAY));

}
