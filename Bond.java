/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfolioapp;

/**
 *
 * @author isabellalee
 */
public class Bond extends InvestmentAsset{

    //attributes
    private double faceValue;
    private double interestRate;
    private int daysToMaturity;
    private int volume;

    //Constructors
    public Bond() {
    }

    public Bond(String symbol, String issuer,double faceValue, double interestRate, int daysToMaturity) {
        super(symbol, issuer);
        this.faceValue = faceValue;
        this.interestRate = interestRate;
        this.daysToMaturity = daysToMaturity;  
    }

    //Get & Set Methods
    public int getDaysToMaturity() {
        return daysToMaturity;
    }

    public double getFaceValue() {
        return faceValue;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String getIssuer() {
        return super.getIssuer(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String getSymbol() {
        return super.getSymbol(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDaysToMaturity(int daysToMaturity) {
        this.daysToMaturity = daysToMaturity;
    }

    public void setFaceValue(double faceValue) {
        this.faceValue = faceValue;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void setIssuer(String issuer) {
        super.setIssuer(issuer); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSymbol(String symbol) {
        super.setSymbol(symbol); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //Methods
    public double calCurrentValue() {  
        double divisor = Math.pow(1 + interestRate, daysToMaturity);
        return faceValue / divisor;
    }
    
    public double calTotal() {
        return calCurrentValue() * volume;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Symbol: " + this.getSymbol() + " Issuer: " + this.getIssuer() + 
                " Volume: " + volume + " Face Value: " + faceValue + " Interest Rate: " + interestRate ; 

    }


    
    

    
    
    

}
