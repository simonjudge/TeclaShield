/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akdroid.tecladesk;

/**
 *
 * @author akhil
 */
public class EventConstant {
    public static final int NOT_APPLICABLE = -1;
    public static final int NONE = 0;
    public static final int MOUSE = 1;
    public static final int KEYBOARD = 2;
    public static final int MOUSEMOVE = 0;
    public static final int MOUSECLICK = 1;
    public static final int DBLCLICK = 2;
    public static final int RIGHTCLICK = 3;
    public static final int SCROLL = 4;
    
    public static final String[] ShieldEventNames={
                                                "onPress",
                                                "onRelease",
                                                "onClick",
                                                "onDoubleClick",
                                                "onLongPress"                                                
                                            }; 
    
    public static final String[] mouseevents={
                                                    "MouseMove",
                                                    "MouseClick",
                                                    "DoubleClick",
                                                    "RightClick",
                                                    "Scroll"
                                              };
    
    public static final String[] Shieldbuttons={
                                                    "ECU1_UP",
                                                    "ECU2_DOWN",
                                                    "ECU3_LEFT",
                                                    "ECU4_RIGHT",
                                                    "E1_SWITCH1",
                                                    "E2_SWITCH2"
                                                }; 
   public static final String[] Devices={
                                            "None",
                                            "Mouse",
                                            "Keyboard"
                                        } ;
    
}
