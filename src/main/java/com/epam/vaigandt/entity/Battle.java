package com.epam.vaigandt.entity;


public abstract class Battle extends Discipline {
    BattleDiscipline battleDiscipline;

    public Battle() {
        super();

    }

    public Battle(long id, String name, int amountMedals, String BattleDiscipline) {
        super(id, name, amountMedals);

    }

    public BattleDiscipline getBattleDiscipline() {
        return battleDiscipline;
    }

    public void setBattleDiscipline(BattleDiscipline battleDiscipline) {
        this.battleDiscipline = battleDiscipline;
    }

    @Override
    public String toString() {
        return "Battle{" +
                "battleDiscipline=" + battleDiscipline +
                '}';
    }

    public enum BattleDiscipline {
        Kick, Contact

    }
}
