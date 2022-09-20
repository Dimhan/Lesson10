package com.epamjavaweb.task10class.taskjewel.dataselection;

import com.epamjavaweb.task10class.taskjewel.cave.Cave;
import com.epamjavaweb.task10class.taskjewel.cave.Jewel;

import java.util.List;

public class CommandCostlyJewel implements CommandSelect {
    private SelectJewel selectJewel;
    private Cave cave;

    public CommandCostlyJewel() {
    }

    public CommandCostlyJewel(SelectJewel selectJewel, Cave cave) {
        this.selectJewel = selectJewel;
        this.cave = cave;
    }

    @Override
    public List<Jewel> selectlist() {
        return selectJewel.costlyJewel(cave);
    }
}
