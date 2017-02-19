/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfolioapp;

import java.io.Serializable;

/**
 *
 * @author isabellalee
 */
public class BankAccount implements Serializable{
    
    //Attributes
    private String bankNum;
    private double bankBalance;

    //Constructors
    public BankAccount(){
    }
    
    public BankAccount(String bankNum) {
        this.bankNum = bankNum;
    }

    //Get & Set Methods
    public String getBankNum() {
        return bankNum;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }
   
    //Methods
    public void updateBankBalance(double amount) {
        bankBalance += amount;
    }

  
    

    
  
    
    
    
    
}
