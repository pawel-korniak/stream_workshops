package com.github.pawelkorniak;

public class Main {
    public static void main(String[] args) {
        MealsStatistics stats = new MealsStatistics();
        System.out.println(stats.vegetarianOfGeorgia());
        System.out.println(stats.vegetarianWithoutGeorgian());
        System.out.println(stats.countVegeByType());
        System.out.println(stats.averageCaloriesByType());
    }
}
