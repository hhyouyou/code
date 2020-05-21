package com.example.code.effective.article39.one;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author dong jing xi
 * @date 2020/5/21 18:04
 **/
public class RunTests {

    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;

        Class<?> testClass = Class.forName("com.example.code.effective.article39.one.SampleTest");
        for (Method m : testClass.getDeclaredMethods()) {

            if (m.isAnnotationPresent(Test.class)) {
                tests++;

                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable cause = wrappedExc.getCause();
                    System.out.println(m + "failed :" + cause);

                } catch (Exception e) {
                    System.out.println("Invalid  @Test:" + m);
                }


            }
        }

        System.out.printf("Passed: %d, Failed:%d%n", passed, tests - passed);

    }
}
