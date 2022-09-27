package com.epamjavaweb.task10class.taskjewelrework.main;

import com.epamjavaweb.task10class.taskjewelrework.controller.CaveController;
import com.epamjavaweb.task10class.taskjewelrework.controller.CommandName;
import com.epamjavaweb.task10class.taskjewelrework.controller.CustomerRequest;
import com.epamjavaweb.task10class.taskjewelrework.controller.ProgramResponse;
import com.epamjavaweb.task10class.taskjewelrework.outputdata.OutputListJewel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static final List<Integer> LIST_ID_SELECTED_BY_USER = new ArrayList<>(Arrays.asList(2, 4, 5, 8, 1));

    public static void main(String[] args) {

        CaveController controller = new CaveController();
        OutputListJewel print = OutputListJewel.getOutput();

        print.printAllJewels();

        //Output information about jewels for the selected category
        String commandName1 = "REVIEW_JEWELS";
        String nameJewel = "bracelet";
        CustomerRequest request1 = new CustomerRequest(commandName1, nameJewel);
        ProgramResponse response1 = controller.runMethodSelect(request1);
        print.printListJewels(response1.getListJewel());

        //Output information about the most expensive treasure
        String commandName2 = "COSTLY_JEWEL";
        CustomerRequest request2 = new CustomerRequest(commandName2);
        ProgramResponse response2 = controller.runMethodSelect(request2);
        print.printListJewels(response2.getListJewel());

        //Output information about the jewels of the selected for a certain sum
        int sumJewel = 2000;
        String commandName3 = "WHILE_ENOUGH_SUM";
        CustomerRequest request3 = new CustomerRequest(commandName3, sumJewel);
        ProgramResponse response3 = controller.runMethodSelect(request3);
        print.printListJewels(response3.getListJewel());

        //Output message if bad command
        String commandName4 = "BAD";
        CustomerRequest request4 = new CustomerRequest(commandName4, CommandName.BAD_COMMAND.name());
        ProgramResponse response4 = controller.runMethodSelect(request4);
        print.printBadCommand(response4);

    }
}
