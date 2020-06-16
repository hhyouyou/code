package com.example.code.effective.article46;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author dong jing xi
 * @date 2020/6/2 0:25
 **/
public class Test {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("1");
        words.add("2");
        words.add("3");
        words.add("4");

        Map<String, Long> collect = words.stream()
                .collect(groupingBy(String::toLowerCase, counting()));
        System.out.println(collect.toString());
        String collect1 = String.join("|", words);
        System.out.println(collect1);
        String collect2 = words.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(collect2);
    }


}
