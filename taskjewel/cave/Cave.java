package com.epamjavaweb.task10class.taskjewel.cave;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Cave implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Jewel> heapJewel;

    public Cave() {

    }

    public List<Jewel> getHeapJewel() {
        return heapJewel;
    }

    public void setHeapJewel(List<Jewel> heapJewel) {
        this.heapJewel = heapJewel;
    }

    public void addJewel(Jewel jewel) {
        this.heapJewel.add(jewel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cave cave = (Cave) o;
        return heapJewel.equals(cave.heapJewel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heapJewel);
    }

    @Override
    public String toString() {
        return "Cave{" +
                "heapJewel=" + heapJewel +
                '}';
    }
}
