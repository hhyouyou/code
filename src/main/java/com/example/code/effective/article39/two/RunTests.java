package com.example.code.effective.article39.two;


import com.example.code.effective.article39.one.Test;

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

        Class<?> testClass = Class.forName("com.example.code.effective.article39.two.SampleTest");
        for (Method m : testClass.getDeclaredMethods()) {

            if (m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Tests %s failed: no exception%n", m);
                } catch (InvocationTargetException wrappedExc) {
                    Throwable cause = wrappedExc.getCause();
                    Class<? extends Throwable> value = m.getAnnotation(ExceptionTest.class).value();
                    if (value.isInstance(cause)) {
                        passed++;
                    } else {
                        System.out.printf("Tests %s failed: excepted %s, got %s%n", m, value.getName(), cause);
                    }
                } catch (Exception e) {
                    System.out.println("Invalid  @Test:" + m);
                }


            }
        }

        System.out.printf("Passed: %d, Failed:%d%n", passed, tests - passed);

    }
}
