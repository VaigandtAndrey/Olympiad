package com.epam.vaigandt.entity;


public class SportWithTransport extends Discipline {
    private String transportKind;

    public SportWithTransport(long id, String name, int amountMedals, String transportKind) {
        super(id, name, amountMedals);
        this.transportKind = transportKind;
    }

    public SportWithTransport() {

    }

    public String getTransportKind() {
        return transportKind;
    }

    public void setTransportKind(String transportKind) {
        this.transportKind = transportKind;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amountMedals=" + amountMedals +
                ", transportKind='" + transportKind + '\'' +
                '}';
    }
}
