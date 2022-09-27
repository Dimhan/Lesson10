package com.epamjavaweb.task10class.taskjewelrework.controller;

import com.epamjavaweb.task10class.taskjewelrework.controller.impl.BadCommand;
import com.epamjavaweb.task10class.taskjewelrework.controller.impl.CommandCostlyJewel;
import com.epamjavaweb.task10class.taskjewelrework.controller.impl.CommandReviewNameJewel;
import com.epamjavaweb.task10class.taskjewelrework.controller.impl.CommandSelectJewelWhileSum;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private Map<CommandName, CommandSelect> mapCommand = new HashMap<>();

    public CommandProvider() {
        mapCommand.put(CommandName.REVIEW_JEWELS, new CommandReviewNameJewel());
        mapCommand.put(CommandName.COSTLY_JEWEL, new CommandCostlyJewel());
        mapCommand.put(CommandName.WHILE_ENOUGH_SUM, new CommandSelectJewelWhileSum());
        mapCommand.put(CommandName.BAD_COMMAND, new BadCommand());
    }

    public CommandSelect getCommandObj(String commandName) {
        CommandSelect command;
        CommandName commandNameEnum;
        try {
            commandNameEnum = CommandName.valueOf(commandName);
            command = mapCommand.get(commandNameEnum);
            if (command == null) {
                command = mapCommand.get(CommandName.BAD_COMMAND);
            }
        } catch (Exception e) {
            command = mapCommand.get(CommandName.BAD_COMMAND);
        }
        return command;
    }
}
