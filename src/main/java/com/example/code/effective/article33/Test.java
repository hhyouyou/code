package com.example.code.effective.article33;


import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author dong jing xi
 * @date 2020/5/19 21:27
 **/
public class Test {
    public static void main(String[] args) {
//
//        Favorites f = new Favorites();
//
//        f.putFavorite(String.class, "Java");
//
//        f.putFavorite(Integer.class, 0xcafebabe);
//
//        f.putFavorite(Class.class, Favorites.class);
//
//        String favoriteString = f.getFavorite(String.class);
//
//        int favoriteInteger = f.getFavorite(Integer.class);
//
//        Class<?> favoriteClass = f.getFavorite(Class.class);
//
//        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());

        BigDecimal t1 = new BigDecimal(10);
        BigDecimal t2 = new BigDecimal(0);

        BigDecimal bigDecimal = t1.compareTo(BigDecimal.ZERO) <= 0 ? BigDecimal.ZERO :
                t2.divide(t1, 6, BigDecimal.ROUND_HALF_UP);

        System.out.println(bigDecimal.toString());
    }
}
