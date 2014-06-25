package com.epam.vaigandt.entity;

import java.util.Random;

public class WinterOlympiadFactory {

    public static Random random = new Random();

    public WinterOlympiadFactory() {
    }

    public static Olympiad createWinterOlympiadWithRandomDisciplines() {


        Olympiad winterOlympiad = new Olympiad();


        winterOlympiad.setSeason(Olympiad.Season.WinterOlympics);
        winterOlympiad.setCity(Olympiad.City.Sochi);
        winterOlympiad.setYear(2014);

        switch (random.nextInt(2)) {
            case 0:
                winterOlympiad.setDisciplines(WinterSportGameFactory.createRandomWinterSportGame());
                return winterOlympiad;
            case 1:
                winterOlympiad.setDisciplines(WinterSportWithTransportFactory.createRandomWinterSportWithTransport());
                return winterOlympiad;

        }


        return winterOlympiad;


    }

}
