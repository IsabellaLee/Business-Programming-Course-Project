/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfolioapp;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author isabellalee
 */
public class BrokerageAccount implements Serializable{
    
    //Attributes
    private String brokerageNum;
    private double settlement;
    private double deposit;
    private LinkedList<InvestmentAsset> investmentAssetList = new LinkedList<>();
    private LinkedList<Stock> stockList = new LinkedList<>();
    private LinkedList<Bond> bondList = new LinkedList<>();
    private LinkedList<ForeignCurrency> foreignCurrencyList = new LinkedList<>();
    private LinkedList<Commodity> commodityList = new LinkedList<>();

    //Constructors
    public BrokerageAccount() {
    }
    
    public BrokerageAccount(String brokerageNum) {
       this.brokerageNum = brokerageNum;
       deposit = 1000;
    
    }

    //Get & Set Methods
    public LinkedList<InvestmentAsset> getInvestmentAssetList() {
        return investmentAssetList;
    }

    public void setInvestmentAssetList(LinkedList<InvestmentAsset> investmentAssetList) {
        this.investmentAssetList = investmentAssetList;
    }
    
    public String getBrokerageNum() {
        return brokerageNum;
    }
    
    public void setBrokerageNum(String brokerageNum) {
        this.brokerageNum = brokerageNum;
    }

    public double getSettlement() {
        return settlement;
    }

    public void setSettlement(double settlement) {
        this.settlement = settlement;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public LinkedList<Stock> getStockList() {
        return stockList;
    }

    public LinkedList<Bond> getBondList() {
        return bondList;
    }

    public LinkedList<Commodity> getCommodityList() {
        return commodityList;
    }

    public void setBondList(LinkedList<Bond> bondList) {
        this.bondList = bondList;
    }

    public void setCommodityList(LinkedList<Commodity> commodityList) {
        this.commodityList = commodityList;
    }

    public void setForeignCurrencyList(LinkedList<ForeignCurrency> foreignCurrencyList) {
        this.foreignCurrencyList = foreignCurrencyList;
    }

    public void setStockList(LinkedList<Stock> stockList) {
        this.stockList = stockList;
    }

    public LinkedList<ForeignCurrency> getForeignCurrencyList() {
        return foreignCurrencyList;
    }

    //Methods
    public double getStockTotal() {
        double stockValue = 0;
        for (int i = 0; i < stockList.size(); i++) {
            stockValue += stockList.get(i).calTotal();
        }
        return stockValue;
    }
    public double getBondTotal() {
        double bondValue = 0;
        for (int i = 0; i < bondList.size(); i++) {
            bondValue += bondList.get(i).calTotal();
        }
        return bondValue;
    }
    public double getForeignCurrencyTotal() {
        double currencyValue = 0;
        for (int i = 0; i < foreignCurrencyList.size(); i++) {
            currencyValue += foreignCurrencyList.get(i).calUSD();
        }
        return currencyValue;
    }
    public double getCommodityTotal() {
        double commodityValue = 0;
        for (int i = 0; i < commodityList.size(); i++) {
            commodityValue += commodityList.get(i).calTotal();
        }
        return commodityValue;
    }
 
    public double getPortfolioValue() {         
        return (getBondTotal() + getStockTotal() + getForeignCurrencyTotal() + getCommodityTotal());
    }

    //ToString
    @Override
    public String toString() {
        return "BrokerageAccount{" + "settlementAmount=" + settlement + ", deposit=" + deposit + ", stockList=" + stockList + ", bondList=" + bondList + ", foreignCurrencyList=" + foreignCurrencyList + ", commodityList=" + commodityList + '}';
    }
    
    
    
    
}
