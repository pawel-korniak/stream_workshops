package com.github.pawelkorniak;

import com.github.pawelkorniak.data.Data;
import com.github.pawelkorniak.data.Meal;
import com.github.pawelkorniak.data.TypKuchni;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class MealsStatistics {
    Data data = new Data();
    List<Meal> mealList = data.getMeals();

    List<Meal> vegetarianOfGeorgia() {

        Predicate<Meal> isVege = Meal::isVegetarian;
        Predicate<Meal> isGeorgian = meal -> meal.getTyp().equals(TypKuchni.GRUZINSKA);

        return mealList.stream()
                .filter(isVege.and(isGeorgian))
                .collect(Collectors.toList());
    }


    List<Meal> vegetarianWithoutGeorgian() {

        Predicate<Meal> isVege = Meal::isVegetarian;
        Predicate<Meal> isGeorgian = meal -> meal.getTyp().equals(TypKuchni.GRUZINSKA);

        return mealList.stream()
                .filter(isVege.and(isGeorgian.negate()))
                .collect(Collectors.toList());
    }


}
