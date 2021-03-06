/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.jbankapp;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

/**
 *
 * @author Zver
 */
public class AddAccountMenu extends javax.swing.JDialog {

    private Bank bank;
    private Customer customer;

    /**
     * Creates new form AddAccountMenu
     */
    public AddAccountMenu(java.awt.Frame parent, boolean modal, Bank bank) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.bank = bank;
        customer = null;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        oibLabel = new javax.swing.JLabel();
        oibField = new javax.swing.JTextField();
        depositLabel = new javax.swing.JLabel();
        depositField = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        typeField = new javax.swing.JComboBox<>();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Account Menu");
        getContentPane().setLayout(new java.awt.GridLayout(6, 2, 5, 5));

        firstNameLabel.setText("First Name:");
        getContentPane().add(firstNameLabel);
        getContentPane().add(firstNameField);

        lastNameLabel.setText("Last Name:");
        getContentPane().add(lastNameLabel);
        getContentPane().add(lastNameField);

        oibLabel.setText("OIB :");
        getContentPane().add(oibLabel);
        getContentPane().add(oibField);

        depositLabel.setText("Initial Deposit :");
        getContentPane().add(depositLabel);
        getContentPane().add(depositField);

        typeLabel.setText("Account type:");
        getContentPane().add(typeLabel);

        typeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Checking", "Savings" }));
        typeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeFieldActionPerformed(evt);
            }
        });
        getContentPane().add(typeField);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
       this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void typeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeFieldActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        StringBuilder warnings = new StringBuilder();
        String firstName = "", lastName = "", oib = "", depositString = "";
        double amount = 0;
        
        if(firstNameField.getText().isEmpty()){
            warnings.append("First name must not be empty.\n");
        }
        else{
            firstName = firstNameField.getText();
        }
        
        if(lastNameField.getText().isEmpty()){
            warnings.append("Last name must not be empty.\n");
        }
        else{
            lastName = lastNameField.getText();
        }
        
        if(oibField.getText().length() != 11 || oibField.getText().matches("[a-zA-Z]+")){
            warnings.append("Invalid OIB.\n");
        }
        else{
            oib = oibField.getText();
        }
        
        if(depositField.getText().isEmpty()){
            warnings.append("Enter the deposit: ");
        }
        else{
            try{
                amount = Bank.round(Double.parseDouble(depositField.getText()), 2);
            }catch(NumberFormatException ex) {
                warnings.append("Deposit must be a number");
            }   
        }
        
    if (warnings.length() > 0 ) {
            JOptionPane.showMessageDialog(this, warnings.toString(), "Input Warnings", JOptionPane.WARNING_MESSAGE);
        } else {
            Account account = null;
            if(typeField.getSelectedItem().toString() == "Checking" ){
                if(amount >= 100){
                account = new Checking(amount);
                }
                else{
                    warnings.append("Initial deposit of 100 needed");
                }
            }
            else if (typeField.getSelectedItem().toString() == "Savings"){
                if(amount >= 50){
                account = new Savings(amount);
                }
                else{
                    warnings.append("Initial deposit of 50 needed");
                }
            }
            if(account != null){
            customer = new Customer(firstName, lastName, oib, account);
            bank.addCustomer(customer);
            this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, warnings.toString(), "Input warnings", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_okButtonActionPerformed
 
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField depositField;
    private javax.swing.JLabel depositLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField oibField;
    private javax.swing.JLabel oibLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox<String> typeField;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables

    Customer getCustomer() {
        return customer;
    }
}


