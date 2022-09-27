package com.epamjavaweb.task10class.taskjewelrework.controller;

public class CustomerRequest {
    private String commandName;
    private int sumOrder;
    private String nameJewel;

    public CustomerRequest() {

    }

    public CustomerRequest(String commandName) {
        this.commandName = commandName;
    }

    public CustomerRequest(String commandName, int sumOrder) {
        this.commandName = commandName;
        this.sumOrder = sumOrder;
    }

    public CustomerRequest(String commandName, String nameJewel) {
        this.commandName = commandName;
        this.nameJewel = nameJewel;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public int getSumOrder() {
        return sumOrder;
    }

    public void setSumOrder(int sumOrder) {
        this.sumOrder = sumOrder;
    }

    public String getNameJewel() {
        return nameJewel;
    }

    public void setNameJewel(String nameJewel) {
        this.nameJewel = nameJewel;
    }
}
