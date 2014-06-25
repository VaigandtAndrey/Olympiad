package com.epam.vaigandt.main;


import com.epam.vaigandt.entity.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

public class Runner {

    private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Runner.class);
    private static Runner logic;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Random random = new Random();
        logic = new Runner();


        for (int i = 0; i < 5; i++) {

            Olympiad summerOlympiad;

            summerOlympiad = SummerOlympiadFactory.createSummerOlympiadWithRandomDisciplines();
            System.out.println(summerOlympiad);
            log.info("Summer olympiad created " + summerOlympiad);


        }
        for (int i = 0; i < 5; i++) {
            Olympiad winterOlympiad;
            winterOlympiad = WinterOlympiadFactory.createWinterOlympiadWithRandomDisciplines();
            System.out.println(winterOlympiad);
            log.info("Winter olympiad created " + winterOlympiad);
        }
        SportGame[] d = new SportGame[3];
        d[0] = new SportGame();
        d[0].setId(random.nextInt(10));
        d[0].setName("Football");
        d[0].setAmountMedals(11);
        d[0].setPeopleTeam(11);

        d[1] = new SportGame();
        d[1].setId(random.nextInt(10));
        d[1].setName("Hockey");
        d[1].setAmountMedals(6);
        d[1].setPeopleTeam(6);

        d[2] = new SportGame();
        d[2].setId(random.nextInt(10));
        d[2].setName("Volleyball");
        d[2].setAmountMedals(7);
        d[2].setPeopleTeam(7);

        System.out.println("============ no sorted ==============");
        log.info("============ no sorted ==============");
        for (SportGame o : d) {
            System.out.println("Id: " + o.getId() +
                    " Name: " + o.getName() +
                    " Medals: " + o.getAmountMedals() +
                    " People in team: " + o.getPeopleTeam());
            log.info("Id: " + o.getId() +
                    " Name: " + o.getName() +
                    " Medals: " + o.getAmountMedals() +
                    " People in team: " + o.getPeopleTeam());
        }

        System.out.println("========== sorted by people in team===========");
        log.info("========== sorted by people in team===========");
        Arrays.sort(d, new SortByPeopleTeam());

        for (SportGame k : d) {
            System.out.println("Id: " + k.getId() +
                    " Name: " + k.getName() +
                    " Medals: " + k.getAmountMedals() +
                    " People in team: " + k.getPeopleTeam());
            log.info("Id: " + k.getId() +
                    " Name: " + k.getName() +
                    " Medals: " + k.getAmountMedals() +
                    " People in team: " + k.getPeopleTeam());

        }
    }
}


