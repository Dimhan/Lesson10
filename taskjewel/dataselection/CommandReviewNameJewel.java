package com.epamjavaweb.task10class.taskjewel.dataselection;

import com.epamjavaweb.task10class.taskjewel.cave.Cave;
import com.epamjavaweb.task10class.taskjewel.cave.Jewel;

import java.util.List;

public class CommandReviewNameJewel implements CommandSelect {
    private SelectJewel selectJewel;
    private Cave cave;
    private String nameJewel;

    public CommandReviewNameJewel() {
    }

    public CommandReviewNameJewel(SelectJewel selectJewel, Cave cave, String nameJewel) {
        this.selectJewel = selectJewel;
        this.cave = cave;
        this.nameJewel = nameJewel;
    }

    @Override
    public List<Jewel> selectlist() {
        return selectJewel.reviewNameJewel(cave, nameJewel);
    }
}
