package com.itvillage.modem.checker;

import java.util.ArrayList;
import java.util.List;

public class Modem {
   static ModemUtils modemUtils;
    public static String dialUSSDCode(String command) {
        System.out.println("Started...");
        return modemUtils.USSDCodeDial(command);
    }
    public static String sendATCommand(String command) {
        System.out.println("Started...");
        return modemUtils.ussdDial(command);
    }
     public static String connect(String portName)
     {
         System.out.println("Connecting...");
         modemUtils=new ModemUtils();
         try {
            return  modemUtils.connect(portName, 9600);
         } catch (Exception e) {
             e.printStackTrace();
             return "Error";
         }
     }

    public static List<String> getActiveModemsPorts() {
        System.out.println("Searching....");
        modemUtils=new ModemUtils();
        return modemUtils.getActivePorts();
    }

    public static String disconnect() {
        return modemUtils.disconnect();
    }

    public static List<String> getActivePortsList() {
        return getActiveModemsPorts();
    }

}
