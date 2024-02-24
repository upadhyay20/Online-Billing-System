/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.*;
import java.awt.print.*;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import javafx.print.Printer;
import javax.swing.JTextField;

/**
 *
 * @author SHIVAM
 */
public class Billing extends javax.swing.JFrame {
String itax, isubTotal ,itotal;
double [] itemcost = new double[20];

    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Tea = new javax.swing.JCheckBox();
        Coffee = new javax.swing.JCheckBox();
        Pizza = new javax.swing.JCheckBox();
        Burger = new javax.swing.JCheckBox();
        Pastry = new javax.swing.JCheckBox();
        Cookies = new javax.swing.JCheckBox();
        Cake = new javax.swing.JCheckBox();
        Pasta = new javax.swing.JCheckBox();
        Sandwich = new javax.swing.JCheckBox();
        Icecream = new javax.swing.JCheckBox();
        txttea = new javax.swing.JTextField();
        txtcoffee = new javax.swing.JTextField();
        txtpizza = new javax.swing.JTextField();
        txtburger = new javax.swing.JTextField();
        txtpastry = new javax.swing.JTextField();
        txtcookies = new javax.swing.JTextField();
        txtcake = new javax.swing.JTextField();
        txtpasta = new javax.swing.JTextField();
        txtsandwich = new javax.swing.JTextField();
        txticecream = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtReceipt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        SurName = new javax.swing.JTextField();
        PhoneNo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        iTax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        iSubTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        iTotal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(32750, 32750));

        Tea.setText("TEA");
        Tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeaActionPerformed(evt);
            }
        });

        Coffee.setText("COFFEE");
        Coffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoffeeActionPerformed(evt);
            }
        });

        Pizza.setText("PIZZA");
        Pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PizzaActionPerformed(evt);
            }
        });

        Burger.setText("BURGER");
        Burger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurgerActionPerformed(evt);
            }
        });

        Pastry.setText("PASTRY");
        Pastry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastryActionPerformed(evt);
            }
        });

        Cookies.setText("COOKIES");
        Cookies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CookiesActionPerformed(evt);
            }
        });

        Cake.setText("CAKE");
        Cake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CakeActionPerformed(evt);
            }
        });

        Pasta.setText("PASTA");
        Pasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastaActionPerformed(evt);
            }
        });

        Sandwich.setText("SANDWICH");
        Sandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SandwichActionPerformed(evt);
            }
        });

        Icecream.setText("ICE CREAM");
        Icecream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcecreamActionPerformed(evt);
            }
        });

        txttea.setText("0");

        txtcoffee.setText("0");

        txtpizza.setText("0");

        txtburger.setText("0");

        txtpastry.setText("0");

        txtcookies.setText("0");

        txtcake.setText("0");

        txtpasta.setText("0");

        txtsandwich.setText("0");

        txticecream.setText("0");

        jtxtReceipt.setColumns(20);
        jtxtReceipt.setRows(5);
        jScrollPane1.setViewportView(jtxtReceipt);

        jLabel1.setText("FIRST NAME");

        jLabel2.setText("SURNAME");

        jLabel3.setText("PHONE NO");

        jButton1.setText("TOTAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("TAX");

        jLabel5.setText("SUB  TOTAL");

        iSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iSubTotalActionPerformed(evt);
            }
        });

        jLabel6.setText("TOTAL");

        jButton3.setText("SALE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Pasta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cake, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cookies, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                        .addComponent(Pastry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pizza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Coffee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Burger, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sandwich, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Icecream, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(208, 208, 208)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txttea, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpizza, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtburger, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpastry, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcookies, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcake, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpasta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txticecream, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(241, 241, 241)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1)
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SurName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(243, 243, 243))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(iTax, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(iSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(iTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tea))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Coffee))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pizza))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(Burger))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(txtburger)
                                .addGap(13, 13, 13))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(SurName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pastry)
                            .addComponent(txtpastry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cookies)
                            .addComponent(txtcookies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cake)
                            .addComponent(txtcake, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pasta)
                            .addComponent(txtpasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Sandwich)
                            .addComponent(txtsandwich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Icecream)
                            .addComponent(txticecream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iTax, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(181, 181, 181))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoffeeActionPerformed
        // TODO add your handling code here:
            if (Coffee.isSelected())
        {
            txtcoffee.setEnabled(true);
            txtcoffee.setText("");
            txtcoffee.requestFocus();
        } 
        else
        {
            txtcoffee.setEnabled(false);
            txtcoffee.setText("0");
        }
    }//GEN-LAST:event_CoffeeActionPerformed

    private void PizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PizzaActionPerformed
        // TODO add your handling code here:
            if (Pizza.isSelected())
        {
            txtpizza.setEnabled(true);
            txtpizza.setText("");
            txtpizza.requestFocus();
        } 
        else
        {
            txtpizza.setEnabled(false);
            txtpizza.setText("0");
        }
    }//GEN-LAST:event_PizzaActionPerformed

    private void BurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurgerActionPerformed
        // TODO add your handling code here:
            if (Burger.isSelected())
        {
            txtburger.setEnabled(true);
            txtburger.setText("");
            txtburger.requestFocus();
        } 
        else
        {
            txtburger.setEnabled(false);
            txtburger.setText("0");
        }
    }//GEN-LAST:event_BurgerActionPerformed

    private void PastryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastryActionPerformed
        // TODO add your handling code here:
            if (Pastry.isSelected())
        {
            txtpastry.setEnabled(true);
            txtpastry.setText("");
            txtpastry.requestFocus();
        } 
        else
        {
            txtpastry.setEnabled(false);
            txtpastry.setText("0");
        }
    }//GEN-LAST:event_PastryActionPerformed

    private void SandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SandwichActionPerformed
        // TODO add your handling code here:
            if (Sandwich.isSelected())
        {
            txtsandwich.setEnabled(true);
            txtsandwich.setText("");
            txtsandwich.requestFocus();
        } 
        else
        {
            txtsandwich.setEnabled(false);
            txtsandwich.setText("0");
        }
    }//GEN-LAST:event_SandwichActionPerformed

    private void IcecreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcecreamActionPerformed
        // TODO add your handling code here:
            if (Icecream.isSelected())
        {
            txticecream.setEnabled(true);
            txticecream.setText("");
            txticecream.requestFocus();
        } 
        else
        {
            txticecream.setEnabled(false);
            txticecream.setText("0");
        }
    }//GEN-LAST:event_IcecreamActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        txttea.setEnabled(false);
        txtcoffee.setEnabled(false);
        txtpizza.setEnabled(false);
        txtburger.setEnabled(false);
        txtpastry.setEnabled(false);
        txtcookies.setEnabled(false);
        txtcake.setEnabled(false);
        txtpasta.setEnabled(false);
        txtsandwich.setEnabled(false);
        txticecream.setEnabled(false);
    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            jtxtReceipt.print();
        }
        catch (java.awt.print.PrinterException e) {
            System.err.format("No Printer found", e.getMessage());
            
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeaActionPerformed
        // TODO add your handling code here:
        if (Tea.isSelected())
        {
            txttea.setEnabled(true);
            txttea.setText("");
            Tea.requestFocus();
        } 
        else
        {
            txttea.setEnabled(false);
            txttea.setText("0");
            
        }
    }//GEN-LAST:event_TeaActionPerformed

    private void CookiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CookiesActionPerformed
        // TODO add your handling code here:
            if (Cookies.isSelected())
        {
            txtcookies.setEnabled(true);
            txtcookies.setText("");
            txtcookies.requestFocus();
        } 
        else
        {
            txtcookies.setEnabled(false);
            txtcookies.setText("0");
        }
    }//GEN-LAST:event_CookiesActionPerformed

    private void CakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CakeActionPerformed
        // TODO add your handling code here:
            if (Cake.isSelected())
        {
            txtcake.setEnabled(true);
            txtcake.setText("");
            txtcake.requestFocus();
        } 
        else
        {
            txtcake.setEnabled(false);
            txtcake.setText("0");
        }
    }//GEN-LAST:event_CakeActionPerformed

    private void PastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastaActionPerformed
        // TODO add your handling code here:
            if (Pasta.isSelected())
        {
            txtpasta.setEnabled(true);
            txtpasta.setText("");
            txtpasta.requestFocus();
        } 
        else
        {
            txtpasta.setEnabled(false);
            txtpasta.setText("0");
        }
    }//GEN-LAST:event_PastaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(FirstName.getText().trim().length()==0){
          JOptionPane.showMessageDialog(null, "First Name Field Should not be Null..!!","Please Check",JOptionPane.WARNING_MESSAGE);
          FirstName.requestFocus();
          return;
        }
        if(SurName.getText().trim().length()==0){
          JOptionPane.showMessageDialog(null, "SurName Field should not be null..!!","Please Check",JOptionPane.WARNING_MESSAGE);
          SurName.requestFocus();
          return;
        }
         if(PhoneNo.getText().length()<10){
          JOptionPane.showMessageDialog(null, "Enter 10 digit number..!!","Please Check",JOptionPane.WARNING_MESSAGE);
          {PhoneNo.requestFocus();
          return;
        }
        }
          
        itemcost[0] = Double.parseDouble(txttea.getText()) * 50;
        itemcost[1] = Double.parseDouble(txtcoffee.getText()) * 100;
        itemcost[2] = Double.parseDouble(txtpizza.getText()) * 300;
        itemcost[3] = Double.parseDouble(txtburger.getText()) * 150;
        itemcost[4] = Double.parseDouble(txtpastry.getText()) * 85;
        itemcost[5] = Double.parseDouble(txtcookies.getText()) * 000;
        itemcost[6] = Double.parseDouble(txtcake.getText()) * 500;
        itemcost[7] = Double.parseDouble(txtpasta.getText()) * 220;
        itemcost[8] = Double.parseDouble(txtsandwich.getText()) * 110;
        itemcost[9] = Double.parseDouble(txticecream.getText()) * 180;
        
        itemcost[10] =  itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5] + itemcost[6] + itemcost[7];
       
         itemcost[11] =  itemcost[8] + itemcost[9] ;
         itemcost[12] =  itemcost[10] + itemcost[11] ;
         
        itax = String.format("Rs %.2f", itemcost[12]/100);
        isubTotal = String.format("Rs %.2f", itemcost[12]);
        itotal = String.format("Rs %.2f", itemcost[12] + (itemcost[12]/100));     
        
        iTax.setText(itax);
        iSubTotal.setText(isubTotal);
        iTotal.setText(itotal);
       
        jtxtReceipt.setEnabled(true);
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
        Tdate.format(timer.getTime());
        
        jtxtReceipt.append("\tCustomer billing System\n" +
                "\n=======================================================\t " +
                "\n========================================================\t " +
                "\nFirstName:\t\t\t" +FirstName.getText() +
                "\nSurName:\t\t\t" + SurName.getText() +
                "\nPhone no:\t\t\t" + PhoneNo.getText() +
                "\n==========================================================\t " +
                "\nTea:\t\t\t" +txttea.getText() +
                "\nCoffee:\t\t\t" +txtcoffee.getText() +
                "\nPizza:\t\t\t" +txtpizza.getText() +
                "\nBurger:\t\t\t" +txtburger.getText() +
                "\nPastry:\t\t\t" +txtpastry.getText() +
                "\nCookies:\t\t\t" +txtcookies.getText() +
                "\nCake:\t\t\t" + txtcake.getText() +
                "\nPasta:\t\t\t" + txtpasta.getText() +
                "\nSandwich:\t\t\t" + txtsandwich.getText() +
                "\nIceCream:\t\t\t" +txticecream.getText() +
              "\n==============================================================\t " +
                "\nTax:\t\t\t"+ itax +
                "\nSub Total:\t\t\t" +isubTotal  +
                "\nTotal:\t\t\t" +itotal  +
                "\n=============================================================\t " +
                "\nDate: "+Tdate.format(timer.getTime()) +
                 "\t\tTime: " + tTime.format(timer.getTime()) +
                  "\n\n\t        Thank you        \n");
                
             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
            
           setVisible(false);
         new Totalsale().setVisible(true);
            
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void iSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iSubTotalActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Burger;
    private javax.swing.JCheckBox Cake;
    private javax.swing.JCheckBox Coffee;
    private javax.swing.JCheckBox Cookies;
    private javax.swing.JTextField FirstName;
    private javax.swing.JCheckBox Icecream;
    private javax.swing.JCheckBox Pasta;
    private javax.swing.JCheckBox Pastry;
    private javax.swing.JTextField PhoneNo;
    private javax.swing.JCheckBox Pizza;
    private javax.swing.JCheckBox Sandwich;
    private javax.swing.JTextField SurName;
    private javax.swing.JCheckBox Tea;
    private javax.swing.JTextField iSubTotal;
    private javax.swing.JTextField iTax;
    private javax.swing.JTextField iTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtxtReceipt;
    private javax.swing.JTextField txtburger;
    private javax.swing.JTextField txtcake;
    private javax.swing.JTextField txtcoffee;
    private javax.swing.JTextField txtcookies;
    private javax.swing.JTextField txticecream;
    private javax.swing.JTextField txtpasta;
    private javax.swing.JTextField txtpastry;
    private javax.swing.JTextField txtpizza;
    private javax.swing.JTextField txtsandwich;
    private javax.swing.JTextField txttea;
    // End of variables declaration//GEN-END:variables
}
