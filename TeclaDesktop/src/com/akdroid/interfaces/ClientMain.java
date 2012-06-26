/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akdroid.interfaces;

import com.akdroid.tecladesk.PreferencesHandler;

/**
 * This is the main window of the TeclaDesktop
 * @author Akhil
 */
public class ClientMain extends javax.swing.JFrame {

    /**
     * Creates new form ClientMain
     */
    ButtonPref b1,b2,b3,b4,b5,b6;
    public ClientMain(PreferencesHandler pref) {
        initComponents();
        //initialize buttonpref panels
        b1=new ButtonPref(pref.getShieldButton(ShieldEvent.ECU1),pref);
        b2=new ButtonPref(pref.getShieldButton(ShieldEvent.ECU2),pref);
        b3=new ButtonPref(pref.getShieldButton(ShieldEvent.ECU3),pref);
        b4=new ButtonPref(pref.getShieldButton(ShieldEvent.ECU4),pref);
        b5=new ButtonPref(pref.getShieldButton(ShieldEvent.E1),pref);
        b6=new ButtonPref(pref.getShieldButton(ShieldEvent.E2),pref);
        //Add button tabs to the panel
        preftab.addTab("ECU UP",b1);
        preftab.addTab("ECU DOWN",b2);
        preftab.addTab("ECU LEFT",b3);
        preftab.addTab("ECU RIGHT",b4);
        preftab.addTab("SWITCH 1",b5);
        preftab.addTab("SWITCH 2",b6);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        preftab = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TeclaClient");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(preftab, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(preftab, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //new ClientMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane preftab;
    // End of variables declaration//GEN-END:variables
}
