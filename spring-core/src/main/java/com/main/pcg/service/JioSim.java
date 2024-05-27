package com.main.pcg.service;

import org.springframework.stereotype.Component;

@Component("jio")
public class JioSim implements Sim{

    public JioSim(){
        System.out.println("Jio Sim");
    }

    @Override
    public void call() {
        System.out.println("call from jio sim");
    }

    @Override
    public void text() {
        System.out.println("text from jio sim");
    }

    @Override
    public void browseInternet() {
        System.out.println("browsing using jio sim");
    }
}
