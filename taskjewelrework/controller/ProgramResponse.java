package com.epamjavaweb.task10class.taskjewelrework.controller;

import com.epamjavaweb.task10class.taskjewelrework.cave.Jewel;

import java.util.List;

public class ProgramResponse {
    private List<Jewel> listJewel;
    private String commandName;
    private String errorMessage;

    public ProgramResponse() {

    }

    public ProgramResponse(List<Jewel> listJewel) {
        this.listJewel = listJewel;
    }

    public ProgramResponse(String commandName, List<Jewel> listJewel) {
        this.listJewel = listJewel;
        this.commandName = commandName;
    }

    public ProgramResponse(String commandName, String errorMessage) {
        this.commandName = commandName;
        this.errorMessage = errorMessage;
    }

    public List<Jewel> getListJewel() {
        return listJewel;
    }

    public void setListJewel(List<Jewel> listJewel) {
        this.listJewel = listJewel;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
