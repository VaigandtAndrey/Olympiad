package com.epam.vaigandt.entity;


public class WithTransport extends SportType {
    protected String transportKind;


    public WithTransport(long id, String name, int amountMedals, String transportKind) {
        super(id, name, amountMedals);
        this.transportKind = transportKind;
    }

    public String getTransportKind() {
        return transportKind;
    }


    public WithTransport() {

    }


}
