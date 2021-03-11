package com.github.pawelkorniak;

import com.github.pawelkorniak.data.Data;
import com.github.pawelkorniak.data.Meal;
import com.github.pawelkorniak.data.TypKuchni;
import java.util.List;
import java.util.Map;

class MealsStatistics {
    Data data = new Data();
    List<Meal> mealList = data.getMeals();

    // dodaj pola jeśli potrzebujesz

    List<String> vegetarianOfGeorgia() {
        // spróbuj użyć tylko jednej operacji filter na strumieniu
        return mealList.stream();
    }

    List<String> vegetarianWithoutGeorgian() {
        // spróbuj użyć tylko jednej operacji filter na strumieniu
        return mealList.stream();
    }

    Map<TypKuchni, Long> countVegeByType() {
        return mealList.stream();
    }

    Map<TypKuchni, Double> averageCaloriesByType() {
        return mealList.stream();
    }
}
