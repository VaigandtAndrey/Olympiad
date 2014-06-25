package com.epam.vaigandt.entity;

public class Wrestling extends Battle {
    private WrestlingCategory wrestlingCategory;

    public Wrestling(long id, String name, int amountMedals, String battleDiscipline, String WrestlingCategory) {
        super(id, name, amountMedals, battleDiscipline);
    }

    public Wrestling() {

    }

    public WrestlingCategory getWrestlingCategory() {
        return wrestlingCategory;
    }

    public void setWrestlingCategory(WrestlingCategory wrestlingCategory) {
        this.wrestlingCategory = wrestlingCategory;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "id=" + id +
                ", battleDiscipline=" + battleDiscipline +
                ", name='" + name + '\'' +
                ", wrestlingCategory=" + wrestlingCategory +
                ", amountMedals=" + amountMedals + '}';
    }

    public enum WrestlingCategory {
        Kg54, Kg58, Kg63, Kg69, Kg76, Kg85, Kg97, Kg130
    }


}
