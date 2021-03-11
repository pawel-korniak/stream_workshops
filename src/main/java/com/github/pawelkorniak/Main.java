package com.github.pawelkorniak;

/**
 * Zadanie :
 * Zaimplementuj instrukcję return w metodach klasy MealsStatistics :
 * <ul>vegetarianOfGeorgia() tak żeby zwróciła listę nazw dań wegetariańskich z Gruzjii</ul>
 * <ul>vegetarianWithoutGeorgian() tak żeby zwróciła listę nazw dań wegetariańskich oprócz Gruzińskich</ul>
 * <ul>countVegeByType() tak żeby zwróciła ilość dań wegetariańskich z każdego typu kuchni</ul>
 * <ul>averageCaloriesByType() tak żeby zwróciła średnią klaoryczność dania z każdego typu kuchni</ul>
 */
public class Main {
    public static void main(String[] args) {
        MealsStatistics stats = new MealsStatistics();
        System.out.println(stats.vegetarianOfGeorgia());
        System.out.println(stats.vegetarianWithoutGeorgian());
        System.out.println(stats.countVegeByType());
        System.out.println(stats.averageCaloriesByType());
    }
}
