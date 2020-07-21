package com.sf.effectivejava.item2;

//First then set properties, then use build() of Builder class
public class NutritionFactsWithBuilderClient {

    public static void main(String[] args) {
        NutritionFactsWithBuilder obj = new NutritionFactsWithBuilder.Builder(140 ,130).withCalories(130).withFat(12).build();
    }
}
