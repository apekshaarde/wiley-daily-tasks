package com.main.pcg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Phone {

    @Autowired
    @Qualifier("jio")
    private Sim sim;

    public Phone(Sim sim) {
        this.sim = sim;
    }

    public Phone() {
        System.out.println("Phone Bean Created");
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public void makeACall() {
        sim.call();
    }

    public void text() {
        sim.text();
    }

    public void browseInternet() {
        sim.browseInternet();
    }
}

