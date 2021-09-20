/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.jbankapp;

/**
 *
 * @author Zver
 */
public class Savings extends Account {
    
    private static String accountType = "Savings";
    
    Savings(double initialDeposit){
        this.setBalance(initialDeposit);
        this.checkInterest(0);
        this.setTransactionFee(5);
    }
     
     @Override
     public String toString(){
         return "Account Type : " + accountType + "Account\n" +
                 "Account Number : " + this.getAccountNumber() + "\n" +
                 "Balance: " + this.getBalance() + "\n" + 
                 "Interest Rate : " + (this.getInterest() * 100) + "%\n";
     }

    @Override
    public String getAccountType() {
       return accountType;
    }
    
}
