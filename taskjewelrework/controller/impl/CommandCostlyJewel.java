package com.epamjavaweb.task10class.taskjewelrework.controller.impl;

import com.epamjavaweb.task10class.taskjewelrework.cave.Jewel;
import com.epamjavaweb.task10class.taskjewelrework.controller.CommandSelect;
import com.epamjavaweb.task10class.taskjewelrework.controller.CustomerRequest;
import com.epamjavaweb.task10class.taskjewelrework.controller.ProgramResponse;
import com.epamjavaweb.task10class.taskjewelrework.logic.SelectJewel;

import java.util.List;

public class CommandCostlyJewel implements CommandSelect {

    private final SelectJewel selectJewelcom = SelectJewel.getSelectJewel();


    @Override
    public ProgramResponse selectlist(CustomerRequest customerRequest) {
        ProgramResponse programResponse = null;
        List<Jewel> listJewel = selectJewelcom.costlyJewel();
        String commandName = customerRequest.getCommandName();
        programResponse = new ProgramResponse(commandName, listJewel);
        return programResponse;
    }
}
