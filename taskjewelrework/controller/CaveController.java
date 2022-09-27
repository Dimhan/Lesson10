package com.epamjavaweb.task10class.taskjewelrework.controller;

public class CaveController {
    private final CommandProvider commandProvider = new CommandProvider();

    public ProgramResponse runMethodSelect (CustomerRequest customerRequest) {
        String commandName = customerRequest.getCommandName();
        CommandSelect commandSelect = commandProvider.getCommandObj(commandName);
        ProgramResponse response = commandSelect.selectlist(customerRequest);
        return response;
    }
}
