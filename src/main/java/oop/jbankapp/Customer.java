/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.jbankapp;

import java.io.Serializable;

/**
 *
 * @author Zver
 */
public class Customer implements Serializable{
    private final String firstName;
    private final String lastName;
    private final String oib;
    private final Account account;
    
    Customer (String firstName, String lastName, String oib, Account account){
        this.firstName = firstName;
        this.lastName = lastName;
        this.oib = oib;
        this.account = account;
    }
    
    @Override
    public String toString(){
        return "\nCustomer information\n" +
                "First name: " + firstName +
                "Last name: " + lastName +
                "OIB: " + oib + 
                account;
        
    }
    
    public String basicInfo(){
        return "Account Number : " + account.getAccountNumber() + " - " + firstName + lastName;
    }
    
    
    Account geAccount(){
         return account;
     }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOib() {
        return oib;
    }

    public Account getAccount() {
        return account;
    }
    
    
}
