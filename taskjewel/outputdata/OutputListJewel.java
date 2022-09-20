package com.epamjavaweb.task10class.taskjewel.outputdata;

import com.epamjavaweb.task10class.taskjewel.cave.Jewel;

import java.util.List;
import java.util.Random;

public class OutputListJewel {

    public OutputListJewel() {

    }

    public List<Jewel> initAllJewels(List<Jewel> jewelsInCave) {
        Random rndm = new Random();
        String[] nameJewel = {"ring", "bracelet", "chainlet", "earrings", "riviere"};
        String[] metalJewel = {"gold", "platinum", "silver"};
        for (int i = 0; i < 100; i++) {
            jewelsInCave.add(new Jewel());
            jewelsInCave.get(i).setIdJewel(i + 1);
            jewelsInCave.get(i).setNameJewel(nameJewel[rndm.nextInt(0, 5)]);
            jewelsInCave.get(i).setPriceJewel(rndm.nextInt(100, 1000) + 10);
            jewelsInCave.get(i).setWeightJewel(rndm.nextInt(10, 40));
            jewelsInCave.get(i).setMetalJewel(metalJewel[rndm.nextInt(0, 3)]);
        }

        return jewelsInCave;
    }

    public void printAllJewels(List<Jewel> jewelsInCave) {

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
}
