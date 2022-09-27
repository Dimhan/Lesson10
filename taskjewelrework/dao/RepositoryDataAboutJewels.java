package com.epamjavaweb.task10class.taskjewelrework.dao;

import com.epamjavaweb.task10class.taskjewelrework.cave.Cave;
import com.epamjavaweb.task10class.taskjewelrework.cave.UploadJewelsIntoCave;

public class RepositoryDataAboutJewels {
    private static Cave cave = UploadJewelsIntoCave.uploadJewels();

    public static Cave getCave() {
        return cave;
    }

    public static void setCave(Cave cave) {
        RepositoryDataAboutJewels.cave = cave;
    }
}
