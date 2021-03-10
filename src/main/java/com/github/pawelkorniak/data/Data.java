package com.github.pawelkorniak.data;

import java.util.List;

public class Data {
    private List<Meal> lista;

    public Data() {
        lista = List.of(
                new Meal("Spaghetti",8,30,20, TypKuchni.WLOSKA,false,233),
                new Meal("Pierogi ruskie",7,40,15,TypKuchni.POLSKA,true, 321),
                new Meal("Chaczapuri",5,45,10,TypKuchni.GRUZINSKA,true, 422),
                new Meal("Kurczak słodko-kwaśny",9,37,19,TypKuchni.CHINSKA,false, 376),
                new Meal("Risotto",7,42,13,TypKuchni.WLOSKA,true, 411),
                new Meal("Khinkali",11,27,26,TypKuchni.GRUZINSKA,false, 457),
                new Meal("Pizza",8,32,17,TypKuchni.WLOSKA,true, 249),
                new Meal("Kurczak Tso",6,21,24,TypKuchni.CHINSKA,false, 385),
                new Meal("Gulasz",9,17,31,TypKuchni.POLSKA,false, 463),
                new Meal("Sushi",5,21,27,TypKuchni.JAPONSKA,false, 322)
        );
    }

    public List<Meal> getMeals() {
        return lista;
    }
}
