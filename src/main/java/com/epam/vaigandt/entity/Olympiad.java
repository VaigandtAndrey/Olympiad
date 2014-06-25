package com.epam.vaigandt.entity;

import java.util.List;
import java.util.Random;

public class Olympiad {
    private Season season;
    private int year;
    private City city;
    private Discipline disciplines;

    public Olympiad(int year, City city) {
        this.year = year;
        this.city = city;
    }

    public Olympiad() {
    }

    public Discipline getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(Discipline disciplines) {
        this.disciplines = disciplines;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Olympiad{" +
                "season=" + season +
                ", year=" + year +
                ", city='" + city + '\'' +
                "," + disciplines +
                '}';
    }

    public enum Season {
        SummerOlympics, WinterOlympics
    }


    public enum City {
        London, Moscow, Frankfurt, Paris, Florence, Astana, Sochi
    }


}
