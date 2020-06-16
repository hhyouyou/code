package com.example.code.effective.article42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import static java.util.Comparator.*;

/**
 * @author dong jing xi
 * @date 2020/5/21 23:23
 **/
public class Test {

    public static void main(String[] args) {

        double apply = Operation.DIVIDE.apply(1, 2);

        HashMap<String, Integer> map = new HashMap<>(8);

        String key1 = "key1";
        map.merge(key1, 1, (i1, i2) -> i1 + i2);
        map.merge(key1, 1, Integer::sum);
        map.merge(key1, 1, Integer::sum);

        System.out.println(map.toString());
    }


    public void testAnonymous() {
        ArrayList<String> list = new ArrayList<>();

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        Collections.sort(list, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        Collections.sort(list, comparingInt(String::length));

        list.sort(comparingInt(String::length));

    }

}
