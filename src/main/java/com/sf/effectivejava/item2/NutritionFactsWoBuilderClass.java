package com.sf.effectivejava.item2;

//First create object, then set properties
public class NutritionFactsWoBuilderClass {

    //Required properties
    private int servingSize;
    private int servings;

    //Optional properties
    private int calories;
    private int fat;

    public NutritionFactsWoBuilderClass(int servingSize, int servings){
        this.servingSize = servingSize;
        this.servings = servings;
    }

    public NutritionFactsWoBuilderClass withCalories(int calories) {
        this.calories = calories;
        return this;
    }

    public NutritionFactsWoBuilderClass withFat(int fat) {
        this.fat = fat;
        return this;
    }
}
