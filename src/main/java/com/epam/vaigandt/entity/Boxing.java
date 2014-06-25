package com.epam.vaigandt.entity;

import java.util.ArrayList;
import java.util.Set;

public class Boxing extends Battle {
    private BoxCategory boxCategory;

    public Boxing(long id, String name, int amountMedals, String battleDiscipline, String BoxCategory) {
        super(id, name, amountMedals, battleDiscipline);

    }

    public Boxing() {

    }

    public BoxCategory getBoxCategory() {
        return boxCategory;
    }

    public void setBoxCategory(BoxCategory boxCategory) {
        this.boxCategory = boxCategory;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "id=" + id +
                ", battleDiscipline=" + battleDiscipline +
                ", name='" + name + '\'' +
                ", boxCategory=" + boxCategory +
                ", amountMedals=" + amountMedals + '}';
    }

    public enum BoxCategory {
        Flyweight, Bantamweight, Featherweight, Lightweight, Welterweight, Middleweight, lightHeavyweight, heavyweight;

        BoxCategory() {
        }
    }

}
