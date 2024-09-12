package com.sf.effectivejava.item2;

//First then set properties, then use build() of Builder class
public class NutritionFactsWithBuilder {

    //Required properties
    private int servingSize;
    private int servings;

    //Optional properties
    private int calories;
    private int fat;

    private NutritionFactsWithBuilder(Builder builder) {
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
    }

    //TODO implement Builder
    public static class Builder{
        //Required properties
        private int servingSize;
        private int servings;

        //Optional properties
        private int calories;
        private int fat;

        public Builder(int servingSize, int servings){
            this.servings = servings; this.servingSize = servingSize;
        }

        public Builder withCalories(int calories) {
            if(calories >= 500){
                throw new IllegalArgumentException();
            }
            this.calories = calories;
            return this;
        }

        public Builder withFat(int fat) {
            this.fat = fat;
            return this;
        }

        public NutritionFactsWithBuilder build(){
            return new NutritionFactsWithBuilder(this);
        }
    }
    
}
