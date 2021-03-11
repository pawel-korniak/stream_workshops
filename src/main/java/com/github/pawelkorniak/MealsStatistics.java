package com.github.pawelkorniak;

import com.github.pawelkorniak.data.Data;
import com.github.pawelkorniak.data.Meal;
import com.github.pawelkorniak.data.TypKuchni;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class MealsStatistics {
    Data data = new Data();
    List<Meal> mealList = data.getMeals();

    Predicate<Meal> isVege = Meal::isVegetarian;
    Predicate<Meal> isGeorgian = meal -> meal.getTyp().equals(TypKuchni.GRUZINSKA);

    List<Meal> vegetarianOfGeorgia() {
        return mealList.stream()
                .filter(isVege.and(isGeorgian))
                .collect(Collectors.toList());
    }

    List<Meal> vegetarianWithoutGeorgian() {
        return mealList.stream()
                .filter(isVege.and(isGeorgian.negate()))
                .collect(Collectors.toList());
    }

    Map<TypKuchni, Long> countVegeByType() {
        return mealList.stream()
                .filter(isVege)
                .collect(Collectors.groupingBy(Meal::getTyp,Collectors.counting()));
    }

    Map<TypKuchni, Double> averageCaloriesByType() {
        return mealList.stream()
                .collect(Collectors.groupingBy(Meal::getTyp,Collectors.averagingInt(Meal::getCalPerPortion)));
    }
}
