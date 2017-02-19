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
public class Stock extends InvestmentAsset{
    private double closingPrice;
    private int volume;
    private LinkedList<Double> historicalPrices = new LinkedList<Double>();
    

    public Stock() {
    }

    public Stock(String symbol, String issuer) {
        super(symbol, issuer);
        volume = 0;
    }

    public LinkedList<Double> getHistoricalPrices() {
        return historicalPrices;
    }
    

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
        historicalPrices.add(closingPrice);
    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return this.getSymbol() + " Issuer: " + this.getIssuer() + " " + "Volume: " + 
                volume + " LastClosingPrice: " + closingPrice;  
    }
    
    public double calTotal() {
        return volume * closingPrice;
    }
    

}
