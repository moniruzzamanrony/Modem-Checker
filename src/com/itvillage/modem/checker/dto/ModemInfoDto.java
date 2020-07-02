package com.moniruzzaman.dto;

public class ModemInfoDto {

    private String modemName;
    private String ModemModel;
    private String activeOperatorName;
    private String signalLevel;

    public ModemInfoDto(String modemName, String modemModel, String activeOperatorName, String signalLevel) {
        this.modemName = modemName;
        ModemModel = modemModel;
        this.activeOperatorName = activeOperatorName;
        this.signalLevel = signalLevel;
    }

    public String getModemName() {
        return modemName;
    }

    public String getModemModel() {
        return ModemModel;
    }

    public String getActiveOperatorName() {
        return activeOperatorName;
    }

    public String getSignalLevel() {
        return signalLevel;
    }
}
