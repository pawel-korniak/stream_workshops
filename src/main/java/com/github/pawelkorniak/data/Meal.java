package com.github.pawelkorniak.data;

import com.github.pawelkorniak.data.TypKuchni;

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

    @Override
    public String toString() {
        return name +
                " : tłuszcze=" + fat +
                ", węglowodany=" + carb +
                ", białka=" + protein +
                ", typ=" + typ.name()
                ;
    }

    public String getName() {
        return name;
    }

    public int getFat() {
        return fat;
    }

    public int getCarb() {
        return carb;
    }

    public int getProtein() {
        return protein;
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
