package com.epamjavaweb.task10class.taskjewel.dataselection;

import com.epamjavaweb.task10class.taskjewel.cave.Jewel;

import java.util.List;

public class Selection {
    private CommandSelect reviewNameJewel;
    private CommandSelect costlyJewel;
    private CommandSelect selectJewelWhileSum;

    public Selection() {
    }

    public Selection(CommandSelect reviewNameJewel, CommandSelect costlyJewel, CommandSelect selectJewelWhileSum) {
        this.reviewNameJewel = reviewNameJewel;
        this.costlyJewel = costlyJewel;
        this.selectJewelWhileSum = selectJewelWhileSum;
    }

    public List<Jewel> reviewJewel() {
        return reviewNameJewel.selectlist();
    }

    public List<Jewel> selectCostly() {
        return costlyJewel.selectlist();
    }

    public List<Jewel> SelectionWhileSum() {
        return selectJewelWhileSum.selectlist();
    }
}
