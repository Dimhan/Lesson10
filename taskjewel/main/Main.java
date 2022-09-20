package com.epamjavaweb.task10class.taskjewel.main;

import com.epamjavaweb.task10class.taskjewel.dataselection.*;
import com.epamjavaweb.task10class.taskjewel.outputdata.OutputListJewel;
import com.epamjavaweb.task10class.taskjewel.cave.Cave;
import com.epamjavaweb.task10class.taskjewel.cave.Jewel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        OutputListJewel outputListJewel = new OutputListJewel();
        List<Jewel> heapJewels = new ArrayList<>();
        //Uploaded jewels into the cave
        heapJewels = outputListJewel.initAllJewels(heapJewels);
        outputListJewel.printAllJewels(heapJewels);

        Cave cave = new Cave();
        cave.setHeapJewel(heapJewels);

        SelectJewel selectJewel = new SelectJewel();

        String nameJewel = "bracelet";
        int sumJewel = 2000;
        //Create invoke object
        Selection selection = new Selection(
                new CommandReviewNameJewel(selectJewel, cave, nameJewel),
                new CommandCostlyJewel(selectJewel, cave),
                new CommandSelectJewelWhileSum(selectJewel, cave, sumJewel));

        //Output requests
        outputListJewel.printListJewels(selection.reviewJewel());

        outputListJewel.printListJewels(selection.selectCostly());

        outputListJewel.printListJewels(selection.SelectionWhileSum());

    }
}
