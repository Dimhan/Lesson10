package com.epamjavaweb.task10class.taskjewelrework.controller.impl;

import com.epamjavaweb.task10class.taskjewelrework.cave.Jewel;
import com.epamjavaweb.task10class.taskjewelrework.controller.CommandSelect;
import com.epamjavaweb.task10class.taskjewelrework.controller.CustomerRequest;
import com.epamjavaweb.task10class.taskjewelrework.controller.ProgramResponse;
import com.epamjavaweb.task10class.taskjewelrework.logic.SelectJewel;

import java.util.List;

public class CommandReviewNameJewel implements CommandSelect {

    private final SelectJewel selectJewelcom = SelectJewel.getSelectJewel();

    @Override
    public ProgramResponse selectlist(CustomerRequest customerRequest) {
        ProgramResponse response = null;
        String commandName = customerRequest.getCommandName();
        String nameJewel = customerRequest.getNameJewel();
        List<Jewel> listJewel = selectJewelcom.reviewNameJewel(nameJewel);
        response = new ProgramResponse(commandName, listJewel);
        return response;
    }
}
