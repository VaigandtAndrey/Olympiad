package com.epam.vaigandt.entity;

public class SportGames extends SportType {
   private int peopleTeam;

    public SportGames(long id, String name, int amountMedals, int peopleTeam) {
        super(id, name, amountMedals);
    this.peopleTeam=peopleTeam;
    }

    public int getPeopleTeam() {
        return peopleTeam;
    }


}

