package com.github.pawelkorniak;

import com.github.pawelkorniak.data.TypKuchni;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class Testy {

    @Test
    public void test_vegetarianOfGeorgia(){
    //given
    MealsStatistics stat = new MealsStatistics();
    //when
        List<String> list = stat.vegetarianOfGeorgia();
    //then
    assertEquals(list.toString(),"[Chaczapuri]");
    }

    @Test
    public void test_vegetarianWithoutGeorgian(){
    //given
    MealsStatistics stat = new MealsStatistics();
    //when
        List<String> list = stat.vegetarianWithoutGeorgian();
    //then
    assertEquals(list.toString(),"[Pierogi ruskie, Risotto, Pizza]");
    }

    @Test
    public void test_countVegeByType(){
        //given
        MealsStatistics stat = new MealsStatistics();
        //when
        Map<TypKuchni, Long> map = stat.countVegeByType();
        //then
        assertEquals(map.get(TypKuchni.WLOSKA),2);
        assertEquals(map.get(TypKuchni.POLSKA),1);
        assertEquals(map.get(TypKuchni.GRUZINSKA),1);
    }

    @Test
    void test_averageCaloriesByType(){
        //given
        MealsStatistics stat = new MealsStatistics();
        //when
        Map<TypKuchni, Double> map = stat.averageCaloriesByType();
        //then
        assertEquals(map.get(TypKuchni.GRUZINSKA),439.5);
        assertEquals(map.get(TypKuchni.CHINSKA),380.5);
        assertEquals(map.get(TypKuchni.JAPONSKA),322.0);
        assertEquals(map.get(TypKuchni.WLOSKA),297.6666666666667);
        assertEquals(map.get(TypKuchni.POLSKA),392.0);
    }
}