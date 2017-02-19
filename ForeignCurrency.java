/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfolioapp;

import java.util.LinkedList;

/**
 *
 * @author isabellalee
 */
public class ForeignCurrency extends InvestmentAsset {
    private double exchangeRate;
    private double volume;
    private LinkedList<Double> historicalExchangeRates = new LinkedList<>();

    public LinkedList<Double> getHistoricalExchangeRates() {
        return historicalExchangeRates;
    }

   
    
    
    public ForeignCurrency() {
    }

    public ForeignCurrency(String symbol, String issuer) {
        super(symbol, issuer);
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
        historicalExchangeRates.add(exchangeRate);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
       return "Symbol: " + this.getSymbol() + " Issuer: " +
                this.getIssuer() + " Volume: " + volume + " Exchange Rate: " + exchangeRate ; 
    }
    
    public double calUSD() {
        return volume / exchangeRate;
    }
    
}
