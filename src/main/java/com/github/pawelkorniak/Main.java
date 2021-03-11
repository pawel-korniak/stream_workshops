package com.github.pawelkorniak;

import com.github.pawelkorniak.data.Meal;
import com.github.pawelkorniak.data.TypKuchni;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<Meal> result;
        MealsStatistics stats = new MealsStatistics();
        result = stats.vegetarianOfGeorgia();
        result = stats.vegetarianWithoutGeorgian();
        Map<TypKuchni, Long> res = stats.countVegeByType();
        Map<TypKuchni, Double> res2 = stats.averageCaloriesByType();
        for (Map.Entry e : res2.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }


}
