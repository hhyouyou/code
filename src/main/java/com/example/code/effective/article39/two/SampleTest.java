package com.example.code.effective.article39.two;

import com.example.code.effective.article39.one.Test;

/**
 * @author dong jing xi
 * @date 2020/5/21 17:55
 **/
public class SampleTest {

    @ExceptionTest(ArithmeticException.class)
    public static void m1() {  // Test should pass
        int i = 0;
        i = i / i;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m2() {  // Should fail (wrong exception)
        int[] a = new int[0];
        int i = a[1];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m3() {     // Test should fail (no exception)
    }

}
