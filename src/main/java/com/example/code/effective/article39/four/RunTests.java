package com.example.code.effective.article39.four;


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

        Class<?> testClass = Class.forName("com.example.code.effective.article39.four.SampleTest");
        for (Method m : testClass.getDeclaredMethods()) {

            if (m.isAnnotationPresent(ExceptionTest.class) || m.isAnnotationPresent(ExceptionTestContainer.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Tests %s failed: no exception%n", m);
                } catch (InvocationTargetException wrappedExc) {
                    Throwable cause = wrappedExc.getCause();
                    int oldPassed = passed;
                    ExceptionTest[] exceptions = m.getAnnotationsByType(ExceptionTest.class);
                    for (ExceptionTest exception : exceptions) {
                        if (exception.value().isInstance(cause)) {
                            passed++;
                            break;
                        }
                    }
                    if (oldPassed == passed) {
                        System.out.printf("Tests %s failed:  %s %n", m, cause);
                    }
                } catch (Exception e) {
                    System.out.println("Invalid  @Test:" + m);
                }


            }
        }

        System.out.printf("Passed: %d, Failed:%d%n", passed, tests - passed);

    }
}
