/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.jbankapp;

import javax.naming.InsufficientResourcesException;

/**
 *
 * @author Zver
 */
public abstract class Account {
    
    private double balance = 0;
    private double interest = 0.02;
    private int accountNumber;
    private static int numberOfAccount = 1;
    private double transactionFee;
    
    Account(){
        accountNumber = numberOfAccount ++;
    }
    
    public abstract String getAccountType();
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
   
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount +  transactionFee > balance){
            throw new InsufficientFundsException();
        }
        balance -= amount + transactionFee;
        checkInterest(0);
        }
    
    public void deposit(double amount) throws InsufficientAmountException{
        if(amount <= 0){
           throw new InsufficientAmountException();
        }
        checkInterest(amount);
        amount = amount + amount * interest;
        balance += amount;
    }
    
    public void checkInterest(double amount){
        if(balance + amount > 10000){
            interest = 0.05;
        }
        else {
            interest = 0.02;
        }
    }

    public double getTransactionFee() {
        return transactionFee;
    }
    
    public void setTransactionFee(double fee) {
        this.transactionFee = fee;
    }
}

