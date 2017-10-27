package com.example.sammie.currencyex;

/**
 * Created by sammie on 10/25/2017.
 */

public class Currency {

    private double ETH;
    private String name;

    public Currency(String name,double ETH) {

        this.ETH = ETH;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getETH() {
        return ETH;
    }
}

