/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.jbankapp;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zver
 */
public class MainMenu extends javax.swing.JFrame {
    private Bank bank;
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setLocationRelativeTo(null);
        bank = new Bank();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        addAccountButton = new javax.swing.JButton();
        removeAccountButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountTable = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JBank");

        addAccountButton.setText("Add Account");
        addAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAccountButtonActionPerformed(evt);
            }
        });

        removeAccountButton.setText("Remove account");
        removeAccountButton.setEnabled(false);
        removeAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAccountButtonActionPerformed(evt);
            }
        });

        depositButton.setText("Deposit");
        depositButton.setEnabled(false);
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        withdrawButton.setText("Withdraw");
        withdrawButton.setEnabled(false);
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addComponent(addAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(removeAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(depositButton)
                .addGap(18, 18, 18)
                .addComponent(withdrawButton))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAccountButton)
                    .addComponent(removeAccountButton)
                    .addComponent(depositButton)
                    .addComponent(withdrawButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        accountTable.setAutoCreateRowSorter(true);
        accountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Account Number", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        accountTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        accountTable.getTableHeader().setReorderingAllowed(false);
        accountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(accountTable);
        if (accountTable.getColumnModel().getColumnCount() > 0) {
            accountTable.getColumnModel().getColumn(0).setResizable(false);
            accountTable.getColumnModel().getColumn(1).setResizable(false);
            accountTable.getColumnModel().getColumn(2).setResizable(false);
            accountTable.getColumnModel().getColumn(3).setResizable(false);
        }

        fileMenu.setText("File");

        jMenuItem2.setText("jMenuItem2");
        fileMenu.add(jMenuItem2);

        jMenuItem1.setText("jMenuItem1");
        fileMenu.add(jMenuItem1);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void addAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAccountButtonActionPerformed
        AddAccountMenu menu = new AddAccountMenu(this, true, bank);
        menu.setVisible(true);
        if(menu.getCustomer() != null){
            addCustomerToTable(menu.getCustomer());
        }
    }//GEN-LAST:event_addAccountButtonActionPerformed

    private void removeAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAccountButtonActionPerformed
        int selectedRow = accountTable.getSelectedRow();
        if(selectedRow >= 0){
            Customer customer = getSelectedCustomer(selectedRow);
            if(customer != null){
                bank.removeCustomer(customer);
                removeCustomerFromTable(selectedRow);
                }
            }
    }//GEN-LAST:event_removeAccountButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        int selectedRow = accountTable.getSelectedRow();
        Customer customer = getSelectedCustomer(selectedRow);
        if(customer != null){
            DepositMenu menu = new DepositMenu(this, true, customer);
            menu.setVisible(true);
            reloadCustomerRowData(selectedRow, customer);
        }
    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
       int selectedRow = accountTable.getSelectedRow();
        Customer customer = getSelectedCustomer(selectedRow);
        if(customer != null){
            WithdrawalMenu menu = new WithdrawalMenu(this, true, customer);
            menu.setVisible(true);
            reloadCustomerRowData(selectedRow, customer);
        }
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void accountTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountTableMouseClicked
        setAccountButtonsActive(true);
        
        if(evt.getClickCount() == 2){
            int selectedRow = accountTable.getSelectedRow();
            Customer customer = getSelectedCustomer(selectedRow);
            if(customer != null){
                AccountDetailsPage menu = new AccountDetailsPage(this, true, customer);
                menu.setVisible(true);
                reloadCustomerRowData(selectedRow, customer);
            }
        }
    }//GEN-LAST:event_accountTableMouseClicked

    private Customer getSelectedCustomer(int selectedRow){
        Customer customer = null;
        if(selectedRow >= 0 ) {
            int accountNumber = (int) accountTable.getValueAt(selectedRow, 2);
            customer = bank.getCustomerByAccountNumber(accountNumber);
            }
        return customer;
    }
    private void addCustomerToTable(Customer customer){
        DefaultTableModel model = (DefaultTableModel) accountTable.getModel();
        model.addRow(new Object[]{});
        reloadCustomerRowData(model.getRowCount() - 1, customer);
    }
    
    private void removeCustomerFromTable(int row){
        DefaultTableModel model = (DefaultTableModel) accountTable.getModel();
        model.removeRow(row);
    }
    
    private void reloadCustomerRowData(int selectedRow, Customer customer) {
        DefaultTableModel model = (DefaultTableModel) accountTable.getModel();
        model.setValueAt(customer.getFirstName(), selectedRow, 0);
        model.setValueAt(customer.getLastName(), selectedRow, 1);
        model.setValueAt(customer.getAccount().getAccountNumber(), selectedRow, 2);
        model.setValueAt(String.format("%.2f",customer.getAccount().getBalance()), selectedRow, 3);
    }
    
    private void reloadtable(){
    
    }
    
    private void setAccountButtonsActive(boolean active){
        depositButton.setEnabled(active);
        withdrawButton.setEnabled(active);
        removeAccountButton.setEnabled(active);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountTable;
    private javax.swing.JButton addAccountButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton depositButton;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton removeAccountButton;
    private javax.swing.JButton withdrawButton;
    // End of variables declaration//GEN-END:variables

   
}
