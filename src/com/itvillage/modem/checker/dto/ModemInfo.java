/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itvillage.modem.checker.dto;

/**
 *
 * @author monirozzamanroni
 */
public class ModemInfo {

    private String satsus;
    private String deviceModel;
    private String manufacturer;
    private String usedPort;
    private String activeSIM;
    private String checkSms;
    private String checkContracts;
    private String checkUssd;

    public String getCheckSms() {
        return checkSms;
    }

    public void setCheckSms(String checkSms) {
        this.checkSms = checkSms;
    }

    public String getCheckContracts() {
        return checkContracts;
    }

    public void setCheckContracts(String checkContracts) {
        this.checkContracts = checkContracts;
    }

    public String getCheckUssd() {
        return checkUssd;
    }

    public void setCheckUssd(String checkUssd) {
        this.checkUssd = checkUssd;
    }

    public String getSatsus() {
        return satsus;
    }

    public void setSatsus(String satsus) {
        this.satsus = satsus;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getUsedPort() {
        return usedPort;
    }

    public void setUsedPort(String usedPort) {
        this.usedPort = usedPort;
    }

    public String getActiveSIM() {
        return activeSIM;
    }

    public void setActiveSIM(String activeSIM) {
        this.activeSIM = activeSIM;
    }

}
