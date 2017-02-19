/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfolioapp;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author isabellalee
 */
public class User implements Serializable, Comparator<User>, Comparable<User>{
    
    //Attributes
    private String firstName;
    private String lastName;
    private String riskPreference;
    private String password;
    private BankAccount bank;
    private BrokerageAccount brokerage;

    //Constructors
    public User() {
    }

    public User(String firstName, String lastName, String riskPreference, String bankNum, String brokerageNum, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.riskPreference = riskPreference;
        BankAccount bank = new BankAccount(bankNum);
        BrokerageAccount brokerage = new BrokerageAccount(brokerageNum);
        this.bank = bank;
        this.brokerage = brokerage;
        this.password = password;
    }

    //Get & Set Methods
    public BankAccount getBank() {
        return bank;
    }

    public BrokerageAccount getBrokerage() {
        return brokerage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getNumRisk() {
        if(riskPreference.equals("High")) return 2;
        else if(riskPreference.equals("Medium")) return 1;
        else return 0;
        
    }

    public String getPassword() {
        return password;
    }

    public String getRiskPreference() {
        return riskPreference;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public void setRiskPreference(String riskPreference) {
        this.riskPreference = riskPreference;
    }

    //ToString Methods
    @Override
    public String toString()
    {
        return firstName + ", " + lastName + ", " + "Risk Preference: " + riskPreference + 
               ", " + "Bank Account: " + bank.getBankNum() + ", " + "Brokerage Account: " +
               brokerage.getBrokerageNum() + ", " + "Password: " + password;
    } 

    @Override
    public int compare(User o1, User o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }

    @Override
    public int compareTo(User o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }
    
}

class SortByRisk implements Comparator<User>{  
    @Override
    public int compare(User o1, User o2) {
      int u1 = o1.getNumRisk();
      int u2 = o2.getNumRisk();
        
      return u1 - u2;
    }
}
