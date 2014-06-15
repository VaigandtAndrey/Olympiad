package com.epam.vaigandt.entity;


public abstract class SportType extends Olympiad {
    public long id;
    public String name;
    public int amountMedals;

    protected SportType(long id, String name, int amountMedals) {
        id = id;
        name = name;
        this.amountMedals = amountMedals;
    }


    protected SportType() {
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
}
