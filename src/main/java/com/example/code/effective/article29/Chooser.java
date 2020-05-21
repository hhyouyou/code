package com.example.code.effective.article29;

import lombok.Data;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author dong jing xi
 * @date 2020/5/15 17:18
 **/
@Data
public class Chooser<T> {

    private final List<T> choiceList;

    public Chooser(List<T> choiceList) {
        this.choiceList = choiceList;
    }

    public T choose() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        return choiceList.get(current.nextInt(choiceList.size()));
    }

}
