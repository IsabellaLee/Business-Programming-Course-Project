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
public abstract class InvestmentAsset {
    private String symbol;
    private String issuer;

    public InvestmentAsset(String symbol, String issuer) {
        this.symbol = symbol;
        this.issuer = issuer;
    }

    public InvestmentAsset() {
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public String toString() {
        return "InvestmentAsset{" + "symbol=" + symbol + ", issuer=" + issuer + '}';
    }
    
}
