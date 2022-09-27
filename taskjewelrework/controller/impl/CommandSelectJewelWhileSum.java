package com.epamjavaweb.task10class.taskjewelrework.controller.impl;

import com.epamjavaweb.task10class.taskjewelrework.cave.Jewel;
import com.epamjavaweb.task10class.taskjewelrework.controller.CommandSelect;
import com.epamjavaweb.task10class.taskjewelrework.controller.CustomerRequest;
import com.epamjavaweb.task10class.taskjewelrework.controller.ProgramResponse;
import com.epamjavaweb.task10class.taskjewelrework.logic.SelectJewel;

import java.util.List;

public class CommandSelectJewelWhileSum implements CommandSelect {

    private final SelectJewel selectJewelcom = SelectJewel.getSelectJewel();


    @Override
    public ProgramResponse selectlist(CustomerRequest customerRequest) {
        ProgramResponse response = null;
        int sum = customerRequest.getSumOrder();
        String commandName = customerRequest.getCommandName();
        List<Jewel> listJewel = selectJewelcom.selectJewelWhileSum(sum);
        response = new ProgramResponse(commandName, listJewel);
        return response;
    }
}
