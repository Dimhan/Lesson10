package com.epamjavaweb.task10class.taskjewel.cave;
/*
Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. Реализовать возможность
просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
В качестве хранилища сокровищ можно использовать массив или коллекцию.
Требования:
• Для реализации структуры приложения применить паттерн MVC.
• Выбор сокровищ реализовать с помощью паттерна Command.
• Ввод информации от пользователя разрешен как hard coding, но только в слое View(Вид).
• Код должен быть документирован (javadoc), документация сгенерирована.
• При написании приложения следует использовать Java Code Convention.
Важно:
• Приложение должно быть объектно-, а не процедурно-ориентированным!
 */

import java.io.Serializable;
import java.util.Objects;

public class Jewel implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idJewel;
    private String nameJewel;
    private int priceJewel;
    private String metalJewel;
    private int weightJewel;
    private String stoneJewel;

    public Jewel() {

    }

    public Jewel(int idJewel, String nameJewel, int priceJewel, String metalJewel, int weightJewel, String stoneJewel) {
        this.idJewel = idJewel;
        this.nameJewel = nameJewel;
        this.priceJewel = priceJewel;
        this.metalJewel = metalJewel;
        this.weightJewel = weightJewel;
        this.stoneJewel = stoneJewel;
    }

    public int getIdJewel() {
        return idJewel;
    }

    public void setIdJewel(int idJewel) {
        this.idJewel = idJewel;
    }

    public String getNameJewel() {
        return nameJewel;
    }

    public void setNameJewel(String nameJewel) {
        this.nameJewel = nameJewel;
    }

    public int getPriceJewel() {
        return priceJewel;
    }

    public void setPriceJewel(int priceJewel) {
        this.priceJewel = priceJewel;
    }

    public String getMetalJewel() {
        return metalJewel;
    }

    public void setMetalJewel(String metalJewel) {
        this.metalJewel = metalJewel;
    }

    public int getWeightJewel() {
        return weightJewel;
    }

    public void setWeightJewel(int weightJewel) {
        this.weightJewel = weightJewel;
    }

    public String getStoneJewel() {
        return stoneJewel;
    }

    public void setStoneJewel(String stoneJewel) {
        this.stoneJewel = stoneJewel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jewel jewel = (Jewel) o;
        return idJewel == jewel.idJewel && priceJewel == jewel.priceJewel
                && weightJewel == jewel.weightJewel && nameJewel.equals(jewel.nameJewel)
                && metalJewel.equals(jewel.metalJewel) && stoneJewel.equals(jewel.stoneJewel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJewel, nameJewel, priceJewel, metalJewel, weightJewel, stoneJewel);
    }

    @Override
    public String toString() {
        return "Jewel{" +
                "idJewel=" + idJewel +
                ", nameJewel='" + nameJewel + '\'' +
                ", priceJewel=" + priceJewel +
                ", metalJewel='" + metalJewel + '\'' +
                ", weightJewel=" + weightJewel +
                ", stoneJewel='" + stoneJewel + '\'' +
                '}';
    }
}
