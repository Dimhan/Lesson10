package com.epamjavaweb.task10class.taskjewelrework.controller.impl;

import com.epamjavaweb.task10class.taskjewelrework.controller.CommandName;
import com.epamjavaweb.task10class.taskjewelrework.controller.CommandSelect;
import com.epamjavaweb.task10class.taskjewelrework.controller.CustomerRequest;
import com.epamjavaweb.task10class.taskjewelrework.controller.ProgramResponse;

public class BadCommand implements CommandSelect {

    @Override
    public ProgramResponse selectlist(CustomerRequest customerRequest) {
        ProgramResponse response = null;
        String commandName = customerRequest.getCommandName();
        response = new ProgramResponse(commandName, CommandName.BAD_COMMAND.name());
        return response;
    }
}
