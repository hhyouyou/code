package com.example.code.effective.article39.three;

import java.util.ArrayList;

/**
 * @author dong jing xi
 * @date 2020/5/21 17:55
 **/
public class SampleTest {

    @ExceptionTest({IndexOutOfBoundsException.class,
            NullPointerException.class})
    public static void doublyBad() {

        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add(5, null);
        // 空指针+数组下标越界
    }


}
