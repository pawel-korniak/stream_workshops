package com.github.pawelkorniak;

import com.github.pawelkorniak.data.Meal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Meal> result;
        MealsStatistics stats = new MealsStatistics();
        result = stats.vegetarianOfGeorgia();
        result = stats.vegetarianWithoutGeorgian();
        //result = stats.
    }


}
