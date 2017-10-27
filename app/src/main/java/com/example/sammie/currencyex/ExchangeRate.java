package com.example.sammie.currencyex;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by sammie on 10/25/2017.
 */

public class ExchangeRate {
    /**
     * AUD : 1.4884
     * BGN : 1.9558

     */

    private RatesEntity ETH;

    public List<Currency> getCurrencyList(){
        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Currency("BTC", ETH.getBTC()));
        currencyList.add(new Currency("USD", ETH.getUSD()));
        currencyList.add(new Currency("EUR", ETH.getEUR()));
        currencyList.add(new Currency("GBP", ETH.getGBP()));
        currencyList.add(new Currency("NGN", ETH.getNGN()));
        currencyList.add(new Currency("ZAR", ETH.getZAR()));
        currencyList.add(new Currency("SEK", ETH.getSEK()));
        currencyList.add(new Currency("KRW", ETH.getKRW()));
        currencyList.add(new Currency("INR", ETH.getINR()));
        currencyList.add(new Currency("JPY", ETH.getJPY()));
        currencyList.add(new Currency("NOK", ETH.getNOK()));
        currencyList.add(new Currency("AUD", ETH.getAUD()));
        currencyList.add(new Currency("CAD", ETH.getCAD()));
        currencyList.add(new Currency("CNY", ETH.getCNY()));
        currencyList.add(new Currency("GHS", ETH.getGHS()));
        currencyList.add(new Currency("NZD", ETH.getNZD()));
        currencyList.add(new Currency("RUB", ETH.getRUB()));


        return currencyList;
    }


    public RatesEntity getETH() {
        return ETH;
    }

    public void setETH(RatesEntity ETH) {
        this.ETH = ETH;
    }

    public static class RatesEntity {
        private double BTC;
        private double USD;
        private double EUR;
        private double GBP;
        private double NGN;
        private double ZAR;
        private double SEK;
        private double KRW;
        private double INR;
        private double JPY;
        private double NOK;
        private double AUD;
        private double CAD;
        private double CNY;
        private double GHS;
        private double NZD;
        private double RUB;

        public double getBTC() {
            return BTC;
        }

        public void setBTC(double BTC) {
            this.BTC = BTC;
        }

        public double getUSD() {
            return USD;
        }

        public void setUSD(double USD) {
            this.USD = USD;
        }

        public double getEUR() {
            return EUR;
        }

        public void setEUR(double EUR) {
            this.EUR = EUR;
        }

        public double getGBP() {
            return GBP;
        }

        public void setGBP(double GBP) {
            this.GBP = GBP;
        }

        public double getNGN() {
            return NGN;
        }

        public void setNGN(double NGN) {
            this.NGN = NGN;
        }

        public double getZAR() {
            return ZAR;
        }

        public void setZAR(double ZAR) {
            this.ZAR = ZAR;
        }

        public double getSEK() {
            return SEK;
        }

        public void setSEK(double SEK) {
            this.SEK = SEK;
        }

        public double getKRW() {
            return KRW;
        }

        public void setKRW(double KRW) {
            this.KRW = KRW;
        }

        public double getINR() {
            return INR;
        }

        public void setINR(double INR) {
            this.INR = INR;
        }

        public double getJPY() {
            return JPY;
        }

        public void setJPY(double JPY) {
            this.JPY = JPY;
        }

        public double getNOK() {
            return NOK;
        }

        public void setNOK(double NOK) {
            this.NOK = NOK;
        }

        public double getAUD() {
            return AUD;
        }

        public void setAUD(double AUD) {
            this.AUD = AUD;
        }

        public double getCAD() {
            return CAD;
        }

        public void setCAD(double CAD) {
            this.CAD = CAD;
        }

        public double getCNY() {
            return CNY;
        }

        public void setCNY(double CNY) {
            this.CNY = CNY;
        }

        public double getGHS() {
            return GHS;
        }

        public void setGHS(double GHS) {
            this.GHS = GHS;
        }

        public double getNZD() {
            return NZD;
        }

        public void setNZD(double NZD) {
            this.NZD = NZD;
        }

        public double getRUB() {
            return RUB;
        }

        public void setRUB(double RUB) {
            this.RUB = RUB;
        }





    }
}
