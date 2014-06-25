package com.epam.vaigandt.entity;

    public class SportGame extends Discipline {
    private int peopleTeam;

    public SportGame(long id, String name, int amountMedals, int peopleTeam) {
        super(id, name, amountMedals);
        this.peopleTeam = peopleTeam;
    }

    public SportGame() {

    }

    public int getPeopleTeam() {
        return peopleTeam;
    }

    public void setPeopleTeam(int peopleTeam) {
        this.peopleTeam = peopleTeam;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amountMedals=" + amountMedals +
                ", peopleTeam=" + peopleTeam +
                '}';
    }
}

