package com.epam.vaigandt.entity;


public abstract class Discipline extends Olympiad {
    long id;
    String name;
    int amountMedals;


    public Discipline(long id, String name, int amountMedals) {
        this.id = id;
        this.name = name;
        this.amountMedals = amountMedals;
    }

    public Discipline() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountMedals() {
        return amountMedals;
    }

    public void setAmountMedals(int amountMedals) {
        this.amountMedals = amountMedals;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amountMedals=" + amountMedals +
                '}';
    }


}
