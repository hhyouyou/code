package com.example.code.effective.article39.one;

/**
 * @author dong jing xi
 * @date 2020/5/21 17:55
 **/
public class SampleTest {

    @Test
    public static void m1() {
    }  // Test should pass

    public static void m2() {
    }

    @Test
    public static void m3() {     // Test should fail

        throw new RuntimeException("Boom");

    }

    public static void m4() {
    }

    @Test
    public void m5() {
    } // INVALID USE: nonstatic method

    public static void m6() {
    }

    @Test
    public static void m7() {    // Test should fail

        throw new RuntimeException("Crash");

    }

    public static void m8() {
    }
}
