package com.example.code.effective.article29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

/**
 * @author dong jing xi
 * @date 2020/5/15 17:36
 **/
public class Stack<T> {

    private List<T> elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new ArrayList<>(DEFAULT_INITIAL_CAPACITY);
    }

    public void push(T e) {
        elements.set(size++, e);
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements.get(--size);
        elements.set(size, null); // Eliminate obsolete reference
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
