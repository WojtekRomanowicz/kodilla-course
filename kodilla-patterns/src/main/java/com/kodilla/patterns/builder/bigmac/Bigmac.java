package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    String bun;
    int burgers;
    String sauce;
    List<String> ingredients = new ArrayList<>();

    public static class BigmacBuildier {
        String bun;
        int burgers;
        String sauce;
        List<String> ingredients = new ArrayList<>();

        public  BigmacBuildier bun(String bun) {
            this.bun = bun;
            return this;
        }

        public  BigmacBuildier burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public  BigmacBuildier sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public  BigmacBuildier ingredient(String ingredients) {
            this.ingredients.add(ingredients);
            return this;
        }

        public Bigmac build(){
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
