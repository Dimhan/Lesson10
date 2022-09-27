package com.epamjavaweb.task10class.taskjewelrework.outputdata;

import com.epamjavaweb.task10class.taskjewelrework.cave.Cave;
import com.epamjavaweb.task10class.taskjewelrework.cave.Jewel;
import com.epamjavaweb.task10class.taskjewelrework.controller.ProgramResponse;
import com.epamjavaweb.task10class.taskjewelrework.dao.RepositoryDataAboutJewels;

import java.util.List;

public class OutputListJewel {

    private static final OutputListJewel output = new OutputListJewel();
    private final Cave cave = RepositoryDataAboutJewels.getCave();

    private OutputListJewel() {

    }

    public static OutputListJewel getOutput() {
        return output;
    }

    public void printAllJewels() {
        List<Jewel> jewelsInCave = cave.getHeapJewel();

        for (Jewel jewel : jewelsInCave) {
            System.out.println(jewel);
        }
        System.out.println();

    }

    public void printListJewels(List<Jewel> listJewels) {

        for (int i = 0; i < listJewels.size(); i++) {
            System.out.printf("ID of the jewel: %4d || Name of the jewel: %s || Price of the jewel: %5d\n",
                    listJewels.get(i).getIdJewel(), listJewels.get(i).getNameJewel(), listJewels.get(i).getPriceJewel());
        }
        System.out.println();
    }

    public void printBadCommand(ProgramResponse response) {
        System.out.println(response.getCommandName() + "---> ERROR!!!");
    }
}
