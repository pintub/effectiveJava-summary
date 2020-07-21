package com.sf.effectivejava.item2;

public class NutritionFactsWoBuilderClassClient {

    public static void main(String[] args) {
        new NutritionFactsWoBuilderClass(130, 140).withCalories(14).withFat(10);
    }
}
