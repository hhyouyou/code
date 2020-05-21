package com.example.code.effective.article39.four;

import java.lang.annotation.*;

/**
 * @author dongjingxi
 */
@Repeatable(ExceptionTestContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface ExceptionTest {
    Class<? extends Exception> value();
}
