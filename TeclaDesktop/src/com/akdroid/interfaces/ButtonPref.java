/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akdroid.interfaces;

import com.akdroid.tecladesk.ComEvent;
import com.akdroid.tecladesk.EventConstant;
import com.akdroid.tecladesk.PreferencesHandler;
import com.akdroid.tecladesk.ShieldButton;
import org.w3c.dom.Element;

/**
 *
 * @author Akhil
 */
public class ButtonPref extends javax.swing.JPanel {

    /**
     * Creates new form ButtonPref
     */
    
    ShieldButton Sbutton;
    PreferencesHandler prefs;
    public ButtonPref(ShieldButton buttonS,PreferencesHandler prefs_) {
        initComponents();
        prefs=prefs_;
        Sbutton=buttonS;
        //System.out.print(buttonS.buttonid);
        updateOnPress(Sbutton.eventlist[ShieldEvent.EVENT_PRESSED]);
        updateOnRelease(Sbutton.eventlist[ShieldEvent.EVENT_RELEASED]);
        updateOnClick(Sbutton.eventlist[ShieldEvent.EVENT_CLICK]);
        updateOnDblClick(Sbutton.eventlist[ShieldEvent.EVENT_DOUBLECLICK]);
        updateOnLongPress(Sbutton.eventlist[ShieldEvent.EVENT_LONGPRESS]);
    }

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edit0 = new javax.swing.JButton();
        edit1 = new javax.swing.JButton();
        edit2 = new javax.swing.JButton();
        edit3 = new javax.swing.JButton();
        edit4 = new javax.swing.JButton();
        DeviceP = new javax.swing.JLabel();
        DeviceR = new javax.swing.JLabel();
        DeviceC = new javax.swing.JLabel();
        DeviceD = new javax.swing.JLabel();
        DeviceL = new javax.swing.JLabel();
        ValueP = new javax.swing.JLabel();
        ValueR = new javax.swing.JLabel();
        ValueC = new javax.swing.JLabel();
        ValueD = new javax.swing.JLabel();
        ValueL = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        OptionP = new javax.swing.JLabel();
        OptionR = new javax.swing.JLabel();
        OptionC = new javax.swing.JLabel();
        OptionD = new javax.swing.JLabel();
        OptionL = new javax.swing.JLabel();

        jLabel1.setText("onPress");

        jLabel2.setText("onRelease");

        jLabel3.setText("onClick");

        jLabel4.setText("onDoubleClick");

        jLabel5.setText("onLongPress");

        jLabel6.setText("ShieldEvents");

        jLabel7.setText("Device");

        jLabel8.setText("Event Value");

        edit0.setText("Edit");
        edit0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit0MouseClicked(evt);
            }
        });

        edit1.setText("Edit");
        edit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit1MouseClicked(evt);
            }
        });

        edit2.setText("Edit");
        edit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit2MouseClicked(evt);
            }
        });
        edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit2ActionPerformed(evt);
            }
        });

        edit3.setText("Edit");
        edit3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit3MouseClicked(evt);
            }
        });

        edit4.setText("Edit");
        edit4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit4MouseClicked(evt);
            }
        });

        DeviceP.setText("jLabel9");

        DeviceR.setText("jLabel10");

        DeviceC.setText("jLabel11");

        DeviceD.setText("jLabel12");

        DeviceL.setText("jLabel13");

        ValueP.setText("jLabel14");

        ValueR.setText("jLabel15");

        ValueC.setText("jLabel16");

        ValueD.setText("jLabel17");

        ValueL.setText("jLabel18");

        jLabel19.setText("Options");

        OptionP.setText("jLabel20");

        OptionR.setText("jLabel21");

        OptionC.setText("jLabel22");

        OptionD.setText("jLabel23");

        OptionL.setText("jLabel24");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeviceL)
                            .addComponent(DeviceD)
                            .addComponent(DeviceC)
                            .addComponent(DeviceR)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(DeviceP)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ValueP)
                    .addComponent(ValueL)
                    .addComponent(ValueR)
                    .addComponent(ValueD)
                    .addComponent(ValueC)
                    .addComponent(jLabel8))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OptionR)
                    .addComponent(OptionC)
                    .addComponent(OptionD)
                    .addComponent(OptionL)
                    .addComponent(OptionP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit4)
                    .addComponent(edit2)
                    .addComponent(edit3)
                    .addComponent(edit0)
                    .addComponent(edit1))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {OptionC, OptionD, OptionL, OptionP, OptionR, jLabel19});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ValueC, ValueD, ValueL, ValueP, ValueR, jLabel8});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit0)
                    .addComponent(DeviceP)
                    .addComponent(ValueP)
                    .addComponent(OptionP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit1)
                    .addComponent(DeviceR)
                    .addComponent(ValueR)
                    .addComponent(OptionR))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edit2)
                    .addComponent(DeviceC)
                    .addComponent(ValueC)
                    .addComponent(OptionC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit3)
                    .addComponent(DeviceD)
                    .addComponent(ValueD)
                    .addComponent(OptionD))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit4)
                    .addComponent(DeviceL)
                    .addComponent(ValueL)
                    .addComponent(OptionL))
                .addGap(65, 65, 65))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {OptionC, OptionD, OptionL, OptionP, OptionR, jLabel19});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ValueC, ValueD, ValueL, ValueP, ValueR, jLabel8});

    }// </editor-fold>//GEN-END:initComponents

    private void edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit2ActionPerformed

    private void edit0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit0MouseClicked
        // TODO add your handling code here:
        ValueSetter val=new ValueSetter(Sbutton.eventlist[0],Sbutton.buttonid,this);
        val.setVisible(true);
       // while(val.block);
       //System.out.println("executed");
       // updateOnPress(Sbutton.eventlist[ShieldEvent.EVENT_PRESSED]);
    }//GEN-LAST:event_edit0MouseClicked

    private void edit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseClicked
        // TODO add your handling code here:
        ValueSetter val=new ValueSetter(Sbutton.eventlist[1],Sbutton.buttonid,this);
        val.setVisible(true);
       // updateOnRelease(Sbutton.eventlist[ShieldEvent.EVENT_RELEASED]);
    }//GEN-LAST:event_edit1MouseClicked

    private void edit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit2MouseClicked
        // TODO add your handling code here:
        ValueSetter val=new ValueSetter(Sbutton.eventlist[2],Sbutton.buttonid,this);
        val.setVisible(true);
        //updateOnClick(Sbutton.eventlist[ShieldEvent.EVENT_CLICK]);
    }//GEN-LAST:event_edit2MouseClicked

    private void edit3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit3MouseClicked
        // TODO add your handling code here:
        ValueSetter val=new ValueSetter(Sbutton.eventlist[3],Sbutton.buttonid,this);
        val.setVisible(true);
        //(Sbutton.eventlist[ShieldEvent.EVENT_DOUBLECLICK]);
    }//GEN-LAST:event_edit3MouseClicked

    private void edit4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit4MouseClicked
        // TODO add your handling code here:
        ValueSetter val=new ValueSetter(Sbutton.eventlist[4],Sbutton.buttonid,this);
        val.setVisible(true);
        //updateOnLongPress(Sbutton.eventlist[ShieldEvent.EVENT_LONGPRESS]);
    }//GEN-LAST:event_edit4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeviceC;
    private javax.swing.JLabel DeviceD;
    private javax.swing.JLabel DeviceL;
    private javax.swing.JLabel DeviceP;
    private javax.swing.JLabel DeviceR;
    private javax.swing.JLabel OptionC;
    private javax.swing.JLabel OptionD;
    private javax.swing.JLabel OptionL;
    private javax.swing.JLabel OptionP;
    private javax.swing.JLabel OptionR;
    private javax.swing.JLabel ValueC;
    private javax.swing.JLabel ValueD;
    private javax.swing.JLabel ValueL;
    private javax.swing.JLabel ValueP;
    private javax.swing.JLabel ValueR;
    private javax.swing.JButton edit0;
    private javax.swing.JButton edit1;
    private javax.swing.JButton edit2;
    private javax.swing.JButton edit3;
    private javax.swing.JButton edit4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
    public void updateOnPress(ComEvent ev){
        DeviceP.setText(EventConstant.Devices[ev.device]);
        String ev_value="Not applicable";
        switch(ev.device){
            case EventConstant.NONE:
                ev_value="Not applicable";
                break;
            case EventConstant.MOUSE:
                ev_value=EventConstant.mouseevents[ev.values.get(0)];
                break;
            case EventConstant.KEYBOARD:
                ev_value=ValueSetter.getKeyCombination(ev.values);
                break;                
        }
       ValueP.setText(ev_value);
       if(ev.device==EventConstant.MOUSE){
           if(ev.values.get(0)==EventConstant.SCROLL){
               OptionP.setText("Scroll = "+ev.dx+" units");
           }
           else if(ev.values.get(0)==EventConstant.MOUSEMOVE){
               OptionP.setText("dX= "+ev.dx+" units " + "dY = " + ev.dy+ " units");
           }
           else
               OptionP.setText("Not Applicable");
       }
       else
           OptionP.setText("Not Applicable");
    }
    public void updateOnRelease(ComEvent ev){
        
        DeviceR.setText(EventConstant.Devices[ev.device]);
        String ev_value="Not applicable";
        switch(ev.device){
            case EventConstant.NONE:
                ev_value="Not applicable";
                break;
            case EventConstant.MOUSE:
                ev_value=EventConstant.mouseevents[ev.values.get(0)];
                break;
            case EventConstant.KEYBOARD:
                ev_value=ValueSetter.getKeyCombination(ev.values);
                break;                
        }
       ValueR.setText(ev_value);
       if(ev.device==EventConstant.MOUSE){
           if(ev.values.get(0)==EventConstant.SCROLL){
               OptionR.setText("Scroll = "+ev.dx+" units");
           }
           else if(ev.values.get(0)==EventConstant.MOUSEMOVE){
               OptionR.setText("dX= "+ev.dx+" units " + "dY = " + ev.dy+ " units");
           }
           else
               OptionR.setText("Not Applicable");
       }
       else
           OptionR.setText("Not Applicable");
    }
    public void updateOnClick(ComEvent ev){
        DeviceC.setText(EventConstant.Devices[ev.device]);
        String ev_value="Not applicable";
        switch(ev.device){
            case EventConstant.NONE:
                ev_value="Not applicable";
                break;
            case EventConstant.MOUSE:
                ev_value=EventConstant.mouseevents[ev.values.get(0)];
                break;
            case EventConstant.KEYBOARD:
                ev_value=ValueSetter.getKeyCombination(ev.values);
                break;                
        }
       ValueC.setText(ev_value);
       if(ev.device==EventConstant.MOUSE){
           if(ev.values.get(0)==EventConstant.SCROLL){
               OptionC.setText("Scroll = "+ev.dx+" units");
           }
           else if(ev.values.get(0)==EventConstant.MOUSEMOVE){
               OptionC.setText("dX= "+ev.dx+" units " + "dY = " + ev.dy+ " units");
           }
           else
               OptionC.setText("Not Applicable");
       }
       else
           OptionC.setText("Not Applicable");
    }
    public void updateOnDblClick(ComEvent ev){
        DeviceD.setText(EventConstant.Devices[ev.device]);
        String ev_value="Not applicable";
        switch(ev.device){
            case EventConstant.NONE:
                ev_value="Not applicable";
                break;
            case EventConstant.MOUSE:
                ev_value=EventConstant.mouseevents[ev.values.get(0)];
                break;
            case EventConstant.KEYBOARD:
                ev_value=ValueSetter.getKeyCombination(ev.values);
                break;                
        }
       ValueD.setText(ev_value);
       if(ev.device==EventConstant.MOUSE){
           if(ev.values.get(0)==EventConstant.SCROLL){
               OptionD.setText("Scroll = "+ev.dx+" units");
           }
           else if(ev.values.get(0)==EventConstant.MOUSEMOVE){
               OptionD.setText("dX= "+ev.dx+" units " + "dY = " + ev.dy+ " units");
           }
           else
               OptionD.setText("Not Applicable");
       }
       else
           OptionD.setText("Not Applicable");
    }
    public void updateOnLongPress(ComEvent ev){
        DeviceL.setText(EventConstant.Devices[ev.device]);
        String ev_value="Not applicable";
        switch(ev.device){
            case EventConstant.NONE:
                ev_value="Not applicable";
                break;
            case EventConstant.MOUSE:
                ev_value=EventConstant.mouseevents[ev.values.get(0)];
                break;
            case EventConstant.KEYBOARD:
                ev_value=ValueSetter.getKeyCombination(ev.values);
                break;                
        }
       ValueL.setText(ev_value);
       if(ev.device==EventConstant.MOUSE){
           if(ev.values.get(0)==EventConstant.SCROLL){
               OptionL.setText("Scroll = "+ev.dx+" units");
           }
           else if(ev.values.get(0)==EventConstant.MOUSEMOVE){
               OptionL.setText("dX= "+ev.dx+" units " + "dY = " + ev.dy+ " units");
           }
           else
               OptionL.setText("Not Applicable");
       }
       else
           OptionL.setText("Not Applicable");
    }
    public void setComEvent(ComEvent e){
        Sbutton.eventlist[e.eventno]=e;
        writeConfig(Sbutton.buttonid,e);

    }
    public void writeConfig(int button ,ComEvent e) {
      //  System.out.println(button);
        Element event=prefs.getShieldEvent(prefs.getButton(button), e.eventno);
      //  System.out.println("1");
        event.setAttribute("eventid", "" + e.eventno);
      //  System.out.println("2");
        event.setAttribute("device", "" + e.device);
      //  System.out.println("3");
        event.setAttribute("options", "" + e.dx+","+e.dy);
      //  System.out.println("4");
        String eventvalues="";
        for(int i=0;i<e.values.size();i++){
            eventvalues=eventvalues.concat(""+e.values.get(i)+",");
        }
     //   System.out.println("5");
        event.setAttribute("value", "" + eventvalues);
     //   System.out.println("6");
        prefs.commitchanges(prefs.doc);
     //   System.out.println("7");


    }
}