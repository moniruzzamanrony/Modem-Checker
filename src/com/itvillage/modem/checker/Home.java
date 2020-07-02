/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itvillage.modem.checker;

import com.itvillage.modem.checker.dto.ModemInfo;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author monirozzamanroni
 */
public class Home extends javax.swing.JFrame {

    JDialog jDialog = new JDialog();
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        JPanel ui= new WaitinPanel();
        jDialog.add(ui);
        jDialog.setSize(211, 194);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
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
        statusPanel = new javax.swing.JPanel();
        statusText = new javax.swing.JLabel();
        deviceModelText = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        manufacturerText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        portText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        simText = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        smsText = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        contractText = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ussdText = new javax.swing.JLabel();
        clickCheck = new javax.swing.JButton();
        ckeckStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

        statusPanel.setBackground(new java.awt.Color(204, 204, 255));
        statusPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        statusText.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        statusText.setForeground(new java.awt.Color(51, 153, 0));

        deviceModelText.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        deviceModelText.setForeground(new java.awt.Color(51, 153, 0));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Device Model: ");

        manufacturerText.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        manufacturerText.setForeground(new java.awt.Color(51, 153, 0));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("Manufacturer: ");

        portText.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        portText.setForeground(new java.awt.Color(51, 153, 0));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setText("Used Port: ");

        simText.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        simText.setForeground(new java.awt.Color(51, 153, 0));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setText("Active SIM: ");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel11.setText("SMS: ");

        smsText.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        smsText.setForeground(new java.awt.Color(51, 153, 0));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setText("Contracts: ");

        contractText.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        contractText.setForeground(new java.awt.Color(51, 153, 0));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel13.setText("USSD: ");

        ussdText.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        ussdText.setForeground(new java.awt.Color(51, 153, 0));

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statusPanelLayout.createSequentialGroup()
                        .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(statusPanelLayout.createSequentialGroup()
                                .addComponent(contractText, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addComponent(smsText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(statusPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ussdText, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(statusPanelLayout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(simText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(statusPanelLayout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(portText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(statusPanelLayout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(manufacturerText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(statusPanelLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deviceModelText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(statusPanelLayout.createSequentialGroup()
                            .addGap(161, 161, 161)
                            .addComponent(statusText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(deviceModelText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(manufacturerText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(portText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(simText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(smsText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(contractText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ussdText))
                .addGap(40, 40, 40))
        );

        clickCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/check_now.png"))); // NOI18N
        clickCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clickCheckMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clickCheckMouseReleased(evt);
            }
        });
        clickCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickCheckActionPerformed(evt);
            }
        });

        ckeckStatus.setBackground(new java.awt.Color(102, 102, 0));
        ckeckStatus.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        ckeckStatus.setForeground(new java.awt.Color(102, 102, 0));
        ckeckStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ckeckStatus.setText("Check now !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ckeckStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(clickCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(clickCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckeckStatus)
                .addGap(18, 18, 18)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clickCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickCheckActionPerformed
        checkModem();
    }//GEN-LAST:event_clickCheckActionPerformed

    private void clickCheckMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickCheckMousePressed
        System.err.println("fdg");
        ckeckStatus.setText("Checking...");
        ckeckStatus.setForeground(Color.red);
        jDialog.setVisible(true);
    }//GEN-LAST:event_clickCheckMousePressed

    private void clickCheckMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickCheckMouseReleased
        jDialog.setVisible(false);
    }//GEN-LAST:event_clickCheckMouseReleased

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home home= new Home();
                home.setVisible(true);
                Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");    
                home.setIconImage(icon); 
                home.setTitle("Modem Chacker");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ckeckStatus;
    private javax.swing.JButton clickCheck;
    private javax.swing.JLabel contractText;
    private javax.swing.JLabel deviceModelText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel manufacturerText;
    private javax.swing.JLabel portText;
    private javax.swing.JLabel simText;
    private javax.swing.JLabel smsText;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JLabel statusText;
    private javax.swing.JLabel ussdText;
    // End of variables declaration//GEN-END:variables

    private void checkModem() {
        ckeckStatus.setText("Please Wait...");
        ckeckStatus.setForeground(Color.red);
        getSIMOperatorInfo();

    }

    private void getSIMOperatorInfo() {
        if (Modem.getActivePortsList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Modem Not Found", "Failure", JOptionPane.ERROR_MESSAGE);

        } else {

            getModemInfo(Modem.getActivePortsList());

        }
    }

    private void getModemInfo(List<String> ports) {
        ModemInfo modemInfo = new ModemInfo();
        String ussdStatus = null;
        String contractsStatus = null;
        String smsStatus = null;
        int errorCount =0;
        for (String port : ports) {
            Modem.connect(port);
            modemInfo.setActiveSIM(Modem.sendATCommand("AT+COPS?").replaceAll(",", "")
                    .replaceAll("OK", "").replaceAll("COPS:", "").replaceAll("\"", "").replaceAll("\\d", "").replaceAll("\\W", ""));
            modemInfo.setUsedPort(port);
            modemInfo.setDeviceModel(Modem.sendATCommand("AT+CGMM").split(",")[1]);
            modemInfo.setManufacturer(Modem.sendATCommand("AT+CGMI").split(",")[1]);
            String simName = Modem.sendATCommand("AT+COPS?").replaceAll(",", "")
                    .replaceAll("OK", "").replaceAll("COPS:", "").replaceAll("\"", "").replaceAll("\\d", "").replaceAll("\\W", "");
            modemInfo.setActiveSIM(simName);
            wait(1000);
            String[] values;
            String value;
            switch (simName.toLowerCase()) {
                case "banglalink":
                    value = Modem.dialUSSDCode("AT+CUSD=1,\"*124#\",15");
                    if (value.contains("")) {
                        values = value.split(",");
                        if (values.length == 3) {
                            ussdStatus = "Supported";
                        } else {
                            ussdStatus = "Not Supported";
                            errorCount++;

                        }
                    } else {
                        ussdStatus = "Not Supported";
                        errorCount++;
                    }
                    break;

                case "gp":
                    value = Modem.dialUSSDCode("AT+CUSD=1,\"*566#\",15");
                    if (value.contains("")) {
                        values = value.split(",");
                        if (values.length == 3) {
                            ussdStatus = "Supported";
                        } else {
                            ussdStatus = "Not Supported";
                            errorCount++;

                        }
                    } else {
                        ussdStatus = "Not Supported";
                        errorCount++;
                    }
                    break;
                case "grameenphone":
                    value = Modem.dialUSSDCode("AT+CUSD=1,\"*566#\",15");
                    if (value.contains("")) {
                        values = value.split(",");
                        if (values.length == 3) {
                            ussdStatus = "Supported";
                        } else {
                            ussdStatus = "Not Supported";
                            errorCount++;

                        }
                    } else {
                        ussdStatus = "Not Supported";
                        errorCount++;
                    }
                    break;
                case "robi":
                    value = Modem.dialUSSDCode("AT+CUSD=1,\"*222#\",15");
                    if (value.contains("")) {
                        values = value.split(",");
                        if (values.length == 3) {
                            ussdStatus = "Supported";
                        } else {
                            ussdStatus = "Not Supported";
                            errorCount++;

                        }
                    } else {
                        ussdStatus = "Not Supported";
                        errorCount++;
                    }
                    break;
                case "airtel":
                    value = Modem.dialUSSDCode("AT+CUSD=1,\"*778#\",15");
                    if (value.contains("")) {
                        values = value.split(",");
                        if (values.length == 3) {
                            ussdStatus = "Supported";
                        } else {
                            ussdStatus = "Not Supported";
                            errorCount++;

                        }
                    } else {
                        ussdStatus = "Not Supported";
                        errorCount++;
                    }
                    break;
                case "teletalk ":
                    value = Modem.dialUSSDCode("AT+CUSD=1,\"*152#\",15");
                    if (value.contains("")) {
                        values = value.split(",");
                        if (values.length == 3) {
                            ussdStatus = "Supported";
                        } else {
                            ussdStatus = "Not Supported";
                            errorCount++;

                        }
                    } else {
                        ussdStatus = "Not Supported";
                        errorCount++;
                    }
                    break;
                default:
                    ussdStatus = "SIM Not Found";
                    errorCount++;
                    break;

            }
            modemInfo.setCheckUssd(ussdStatus);

            if (Modem.sendATCommand("AT+CPBR=1,99").contains("OK")) {
                contractsStatus = "Supported";
            } else {
                contractsStatus = "Not Supported";
                errorCount++;
            }
            modemInfo.setCheckContracts(contractsStatus);

            Modem.sendATCommand("AT+CMGF=1");
            wait(500);
            Modem.sendATCommand("AT+CMGF=?");
            wait(500);
            Modem.sendATCommand("AT+CPMS=\"SM\"");
            wait(500);
            if (Modem.sendATCommand("AT+CMGL=\"ALL\"").contains("OK")) {
                smsStatus = "Supported";
            } else {
                smsStatus = "Not Supported";
                errorCount++;
            }
            modemInfo.setCheckSms(smsStatus);
            Modem.disconnect();
        }
        if(errorCount == 0){
            deviceModelText.setText(modemInfo.getDeviceModel());
            deviceModelText.setForeground(Color.green);
            manufacturerText.setText(modemInfo.getManufacturer());
            manufacturerText.setForeground(Color.green);
            portText.setText(modemInfo.getUsedPort());
            portText.setForeground(Color.green);
            simText.setText(modemInfo.getActiveSIM());
            simText.setForeground(Color.green);
            smsText.setText(modemInfo.getCheckSms());
            smsText.setForeground(Color.green);
            contractText.setText(modemInfo.getCheckContracts());
            contractText.setForeground(Color.green);
            ussdText.setText(modemInfo.getCheckUssd());
            ussdText.setForeground(Color.green);
            statusPanel.setBackground(new Color(204,255,204));          
            ckeckStatus.setText("Modem supported");
            ckeckStatus.setForeground(Color.green);
        }
        else
        {
            deviceModelText.setText("Not Supported");
            deviceModelText.setForeground(Color.red);
            manufacturerText.setText("Not Supported");
            manufacturerText.setForeground(Color.red);
            portText.setText("Not Supported");
            portText.setForeground(Color.red);
            simText.setText("Not Supported");
            simText.setForeground(Color.red);
            smsText.setText("Not Supported");
            smsText.setForeground(Color.red);
            contractText.setText("Not Supported");
            contractText.setForeground(Color.red);
            ussdText.setText("Not Supported");
            ussdText.setForeground(Color.red);
            statusPanel.setBackground(new Color(255,204,204));
            ckeckStatus.setText("Modem not supported");
            ckeckStatus.setForeground(Color.red);
        }
    }

    public void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
