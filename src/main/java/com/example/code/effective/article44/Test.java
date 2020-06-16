package com.example.code.effective.article44;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * @author dong jing xi
 * @date 2020/5/22 16:55
 **/
public class Test {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > 3;
            }
        };

        linkedHashMap.put("1", 1);
        linkedHashMap.put("2", 2);
        linkedHashMap.put("3", 3);
        linkedHashMap.put("4", 4);
        linkedHashMap.put("5", 5);
        linkedHashMap.put("6", 6);
        linkedHashMap.put("7", 7);
        System.out.println(linkedHashMap.toString());

    }


    public void test(){
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
    }
}
