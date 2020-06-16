package com.example.code.effective.article52;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

// Classification using method overrriding (Page 239)
public class Overriding {
    public static void main(String[] args) {
        List<Wine> wineList = new ArrayList<>();
        wineList.add(new Wine());
        wineList.add(new SparklingWine());
        wineList.add(new Champagne());

        for (Wine wine : wineList) {
            System.out.println(wine.name());
        }
    }
}
