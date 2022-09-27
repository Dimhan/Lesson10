package com.epamjavaweb.task10class.taskjewelrework.cave;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UploadJewelsIntoCave {
    public static Cave uploadJewels() {
        Cave cave = new Cave();
        List<Jewel> heapList = new ArrayList<>();
        Random rndm = new Random();
        String[] nameJewel = {"ring", "bracelet", "chainlet", "earrings", "riviere"};
        String[] metalJewel = {"gold", "platinum", "silver"};
        for (int i = 0; i < 100; i++) {
            heapList.add(new Jewel());
            heapList.get(i).setIdJewel(i + 1);
            heapList.get(i).setNameJewel(nameJewel[rndm.nextInt(0, 5)]);
            heapList.get(i).setPriceJewel(rndm.nextInt(100, 1000) + 10);
            heapList.get(i).setWeightJewel(rndm.nextInt(10, 40));
            heapList.get(i).setMetalJewel(metalJewel[rndm.nextInt(0, 3)]);
        }
        cave.setHeapJewel(heapList);
        return cave;


    }
}
