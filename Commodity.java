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
public class Commodity extends InvestmentAsset{
    private String category;
    private double unitPrice;
    private int volume;
    private LinkedList<Double> historicalPrices = new LinkedList<>();

    public Commodity() {
    }

    public Commodity(String category, String symbol, String issuer) {
        super(symbol, issuer);
        this.category = category;
       
    }

    public LinkedList<Double> getHistoricalPrices() {
        return historicalPrices;
    }
    

    public String getCategory() {
        return category;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getVolume() {
        return volume;
    }


    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        historicalPrices.add(unitPrice);
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    @Override
    public String toString() {
        return "Symbol: " + this.getSymbol() + " Issuer: " +
                this.getIssuer() + " Volume: " + volume + " Unit Price: " + unitPrice ; 
    }
    
    public double calTotal() {
        return unitPrice * volume;
    }
    
}
