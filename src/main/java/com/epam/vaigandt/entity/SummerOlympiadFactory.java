package com.epam.vaigandt.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SummerOlympiadFactory {
    public static Random random = new Random();

    public SummerOlympiadFactory() {
    }

    public static Olympiad createSummerOlympiadWithRandomDisciplines() {


        Olympiad summerOlympiad = new Olympiad();


        summerOlympiad.setSeason(Olympiad.Season.SummerOlympics);
        summerOlympiad.setCity(Olympiad.City.London);
        summerOlympiad.setYear(2012);


        switch (random.nextInt(3)) {
            case 0:
                summerOlympiad.setDisciplines(BattleFactory.createRandomBattle());
                return summerOlympiad;
            case 1:
                summerOlympiad.setDisciplines(SummerSportGameFactory.createRandomSummerSportGame());
                return summerOlympiad;
            case 2:
                summerOlympiad.setDisciplines(SummerSportWithTransportFactory.createRandomSummerSportWithTransport());
                return summerOlympiad;
        }


        return summerOlympiad;

    }

}
