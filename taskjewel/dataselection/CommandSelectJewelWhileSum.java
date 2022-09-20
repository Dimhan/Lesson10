package com.epamjavaweb.task10class.taskjewel.dataselection;

import com.epamjavaweb.task10class.taskjewel.cave.Cave;
import com.epamjavaweb.task10class.taskjewel.cave.Jewel;

import java.util.List;

public class CommandSelectJewelWhileSum implements CommandSelect {
    private SelectJewel selectJewel;
    private Cave cave;
    private int sum;

    public CommandSelectJewelWhileSum() {
    }

    public CommandSelectJewelWhileSum(SelectJewel selectJewel, Cave cave, int sum) {
        this.selectJewel = selectJewel;
        this.cave = cave;
        this.sum = sum;
    }


    @Override
    public List<Jewel> selectlist() {
        return selectJewel.selectJewelWhileSum(cave, sum, SelectJewel.LIST_ID_SELECTED_BY_USER);
    }
}
