package com.github.pawelkorniak.data;

public class Meal {
    private String name;
    private int fat;
    private int carb;
    private int protein;
    private TypKuchni typ;
    private boolean isVegetarian;
    private int calPerPortion;

    public Meal(String name, int fat, int carb, int protein, TypKuchni typ, boolean isVegetarian, int calPerPortion) {
        this.name = name;
        this.fat = fat;
        this.carb = carb;
        this.protein = protein;
        this.typ = typ;
        this.isVegetarian = isVegetarian;
        this.calPerPortion = calPerPortion;
    }

    public String getName() {
        return name;
    }

    public TypKuchni getTyp() {
        return typ;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public int getCalPerPortion() {
        return calPerPortion;
    }
}
