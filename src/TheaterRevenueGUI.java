/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class TheaterRevenueGUI extends javax.swing.JFrame {

    /**
     * Creates new form TheaterRevenueGUI
     */
    public TheaterRevenueGUI() {
        initComponents();
    }
    private double kidPrice = 0;
    private int kidSold = 0;
    
    private double adultPrice = 0;
    private int adultSold = 0;
    
    private double netRate = 0.20;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kidPriceTextbox = new javax.swing.JTextField();
        adultPriceTextbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kidSoldTextbox = new javax.swing.JTextField();
        adultSoldTextbox = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputBox = new javax.swing.JTextArea();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Price per child ticket:");

        jLabel2.setText("Price per adult ticket:");

        kidPriceTextbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                kidPriceTextboxFocusLost(evt);
            }
        });
        kidPriceTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidPriceTextboxActionPerformed(evt);
            }
        });

        adultPriceTextbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                adultPriceTextboxFocusLost(evt);
            }
        });
        adultPriceTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultPriceTextboxActionPerformed(evt);
            }
        });

        jLabel3.setText("Number of childern's tickets sold:");

        jLabel4.setText("Number of adult tickets sold:");

        kidSoldTextbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                kidSoldTextboxFocusLost(evt);
            }
        });
        kidSoldTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidSoldTextboxActionPerformed(evt);
            }
        });

        adultSoldTextbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                adultSoldTextboxFocusLost(evt);
            }
        });
        adultSoldTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultSoldTextboxActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        outputBox.setColumns(20);
        outputBox.setRows(5);
        outputBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                outputBoxFocusLost(evt);
            }
        });
        outputBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                outputBoxKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                outputBoxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outputBoxKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(outputBox);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adultPriceTextbox, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(kidPriceTextbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(adultSoldTextbox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kidSoldTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(submitButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kidPriceTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(kidSoldTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(adultPriceTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(adultSoldTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kidSoldTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidSoldTextboxActionPerformed
        // TODO add your handling code here:
        kidSold = checkForInt(kidSoldTextbox);
    }//GEN-LAST:event_kidSoldTextboxActionPerformed

    private void adultPriceTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultPriceTextboxActionPerformed
        // TODO add your handling code here:
        adultPrice = checkForDouble(adultPriceTextbox);
    }//GEN-LAST:event_adultPriceTextboxActionPerformed

    private void kidPriceTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidPriceTextboxActionPerformed
        // TODO add your handling code here:
        kidPrice = checkForDouble(kidPriceTextbox);
    }//GEN-LAST:event_kidPriceTextboxActionPerformed

    private void kidPriceTextboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kidPriceTextboxFocusLost
        // TODO add your handling code here:
        kidPrice = checkForDouble(kidPriceTextbox);
    }//GEN-LAST:event_kidPriceTextboxFocusLost

    private void adultPriceTextboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adultPriceTextboxFocusLost
        // TODO add your handling code here:
        adultPrice = checkForDouble(adultPriceTextbox);
    }//GEN-LAST:event_adultPriceTextboxFocusLost

    private void kidSoldTextboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kidSoldTextboxFocusLost
        // TODO add your handling code here:
        kidSold = checkForInt(kidSoldTextbox);
    }//GEN-LAST:event_kidSoldTextboxFocusLost

    private void adultSoldTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultSoldTextboxActionPerformed
        // TODO add your handling code here:
        adultSold = checkForInt(adultSoldTextbox);
    }//GEN-LAST:event_adultSoldTextboxActionPerformed

    private void adultSoldTextboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adultSoldTextboxFocusLost
        // TODO add your handling code here:
        adultSold = checkForInt(adultSoldTextbox);
    }//GEN-LAST:event_adultSoldTextboxFocusLost

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        generateOutput(outputBox);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void outputBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_outputBoxFocusLost
        // TODO add your handling code here:
        generateOutput(outputBox);
    }//GEN-LAST:event_outputBoxFocusLost

    private void outputBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outputBoxKeyTyped
        // TODO add your handling code here:
        generateOutput(outputBox);
    }//GEN-LAST:event_outputBoxKeyTyped

    private void outputBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outputBoxKeyPressed
        // TODO add your handling code here:
        generateOutput(outputBox);
    }//GEN-LAST:event_outputBoxKeyPressed

    private void outputBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outputBoxKeyReleased
        // TODO add your handling code here:
        generateOutput(outputBox);                            
    }//GEN-LAST:event_outputBoxKeyReleased

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed
    
    private int checkForInt(javax.swing.JTextField textbox)
    {
        try 
        { 
            return Integer.parseInt((textbox.getText()));
        }
        catch (NumberFormatException e)  
        {
            textbox.setText("NOT A INT");
            return 0;
        }
    }
    
    private double checkForDouble(javax.swing.JTextField textbox)
    {
        try 
        { 
            double newNum = Double.parseDouble((textbox.getText()));
            newNum = Math.round(newNum * 100);
            newNum = newNum/100;
            textbox.setText(newNum+ "");
            return newNum;
        }
        catch (NumberFormatException e)  
        {
            textbox.setText("NOT A DOUBLE");
            return 0;
        }
    }
    
    private void generateOutput(javax.swing.JTextArea text)
    {
        String grossAdultString = "Gross revenue for adult tickets sold: $" + (adultSold * adultPrice);
        String netAdultString = "Net revenue for adult tickets sold: $" + (adultSold * adultPrice * netRate);
        String grossKidString = "Gross revenue for kid tickets sold: $" + (kidSold * kidPrice);
        String netKidString = "Net revenue for kid tickets sold: $" + (kidSold * kidPrice * netRate);
        String grossTotalString = "Gross revenue for kid tickets sold: $" + (adultSold * adultPrice + kidSold * kidPrice);
        String netTotalString = "Net revenue for kid tickets sold: $" + String.format("%.2f",(adultSold * adultPrice + kidSold * kidPrice)*netRate);
        text.setText(grossAdultString +" \r\n"
                + netAdultString +" \r\n"
                + grossKidString +" \r\n"
                + netKidString +" \r\n"
                + grossTotalString +" \r\n"
                + netTotalString
                );
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
            java.util.logging.Logger.getLogger(TheaterRevenueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheaterRevenueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheaterRevenueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheaterRevenueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheaterRevenueGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adultPriceTextbox;
    private javax.swing.JTextField adultSoldTextbox;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kidPriceTextbox;
    private javax.swing.JTextField kidSoldTextbox;
    private javax.swing.JTextArea outputBox;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
