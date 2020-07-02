package com.itvillage.modem.checker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
       List<String> a=Modem.getActiveModemsPorts();
       a.remove("COM156");
        System.err.println(a);
        List<String> selectedActivePortsList = new ArrayList<>();
        List<String> activePortsList = new ArrayList<>();
        for(String port:a) {
            Modem.connect(port);
            if(Modem.sendATCommand("AT").replaceAll("\\s+OK\\s+", "").replaceAll("\n", ",").replaceAll("\r", "").replaceAll(",","").equals("OK")) {
                activePortsList.add(port);
               // System.err.println(port+"--------------------------------------------------------------------------------"+Modem.sendATCommand("AT+CGSN").replaceAll("\\s+OK\\s+", "").replaceAll("\n", ",").replaceAll("\r", "").replaceAll(",",""));
                Modem.disconnect();
            }
            else {
                System.err.println("Inactive Port");
                Modem.disconnect();
            }
        }

        System.out.println(activePortsList);
        return activePortsList;
    }

}
