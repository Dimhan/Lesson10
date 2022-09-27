package com.epamjavaweb.task10class.taskjewelrework.logic;

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

import com.epamjavaweb.task10class.taskjewelrework.cave.Cave;
import com.epamjavaweb.task10class.taskjewelrework.cave.Jewel;
import com.epamjavaweb.task10class.taskjewelrework.dao.RepositoryDataAboutJewels;
import com.epamjavaweb.task10class.taskjewelrework.main.Main;

import java.util.*;

public class SelectJewel {

    private final Cave cave = RepositoryDataAboutJewels.getCave();

    private static final SelectJewel selectJewel = new SelectJewel();


    private  SelectJewel() {
    }

    public static SelectJewel getSelectJewel() {
        return selectJewel;
    }

    //View specified jewels
    public List<Jewel> reviewNameJewel(String nameJewel) {

        List<Jewel> listJewel = new ArrayList<>();
        nameJewel = nameJewel.trim();
        if (nameJewel.isEmpty()) {
            return null;
        }
        for (int i = 0; i < cave.getHeapJewel().size(); i++) {
            if (nameJewel.equalsIgnoreCase(cave.getHeapJewel().get(i).getNameJewel())) {
                listJewel.add(cave.getHeapJewel().get(i));
            }
        }
        return listJewel;
    }

    //The most expensive jewel or jewels
    public List<Jewel> costlyJewel() {

        List<Jewel> sortingJewelsByPrice = cave.getHeapJewel();
        Collections.sort(sortingJewelsByPrice, new Comparator<Jewel>() {
            @Override
            public int compare(Jewel o1, Jewel o2) {
                return o2.getPriceJewel() - o1.getPriceJewel();
            }
        });

        List<Jewel> costlyJewels = new ArrayList<>();
        int i = 0;
        do {
            costlyJewels.add(sortingJewelsByPrice.get(i));
        } while (sortingJewelsByPrice.get(i).getPriceJewel() == sortingJewelsByPrice.get(i + 1).getPriceJewel());

        return costlyJewels;
    }
    //The choice of jewels for a given amount
    public List<Jewel> selectJewelWhileSum(int sum) {
        List<Jewel> listJewelSum = new ArrayList<>();
        int cartJewel = 0;
        int priceJewel;

        for (int i = 0; i < cave.getHeapJewel().size(); i++) {
            if (Main.LIST_ID_SELECTED_BY_USER.contains(cave.getHeapJewel().get(i).getIdJewel())) {
                priceJewel = cave.getHeapJewel().get(i).getPriceJewel();
                if (priceJewel < sum & (cartJewel + priceJewel) < sum) {
                    listJewelSum.add(cave.getHeapJewel().get(i));
                    cartJewel += priceJewel;
                }
            }
        }

        return listJewelSum;
    }

}
