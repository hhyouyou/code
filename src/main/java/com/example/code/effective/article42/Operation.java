package com.example.code.effective.article42;

import java.util.function.DoubleBinaryOperator;

/**
 * @author dong jing xi
 * @date 2020/5/21 23:47
 **/
public enum Operation {
    /**
     * 加
     */
    PLUS("+", (x, y) -> x + y),

    MINUS("-", (x, y) -> x - y),

    TIMES("*", (x, y) -> x * y),

    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;

    private final DoubleBinaryOperator op;

    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }
}
