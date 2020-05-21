package com.example.code.effective.article24;

import org.omg.CORBA.INTERNAL;

/**
 * @author dong jing xi
 * @date 2020/5/14 22:56
 **/
public class OuterClass {

    private String privateField = "privateField";
    private static String privateStaticField = "privateStaticField";
    public String publicField = "publicField";

    /**
     * 内部类可以分为：
     * 静态内部类和非静态内部类
     * 非静态内部类又可以分为： 成员内部类、方法内部类、匿名内部类
     *
     * ---effective java
     * 划分四种嵌套类
     * 静态成员类、非静态成员类、匿名类、局部类
     * 只有后三种才称之为，内部类
     */

    /**
     * 静态成员类
     */
    public static class StaticMemberInnerClass {
        //  静态成员类，可以持有静态变量
        private static int test = 1;

        public static void test() {
            System.out.println("静态成员内部类");
            System.out.println(privateStaticField);
            // 无法访问非静态变量，此时该变量还为实例化
            // System.out.println(privateField);
        }

    }

    public class MemberInnerClass {
        // 非静态成员类，无法持有静态变量，因为要依赖具体的实例
        // private static int test = 1;

        private int test = 1;

        public void test() {
            System.out.println("非静态成员内部类，需要实例化对象");
            System.out.println(privateStaticField);
            // 可以方位外部非静态变量
            System.out.println(privateField);

            System.out.println(test);
        }
    }

    int test1 = 1;

    /**
     * 局部内部类、局部类
     */
    public void test() {
        int test = 1;
        /**
         * 1. 无法使用 public private protected修饰
         * 2. 局部类对外完全隐藏，除了创建这个类的方法可以访问它其他的地方是不允许访问的
         * 3. 局部内部类与成员内部类不同之处是他可以引用成员变量，但该成员必须声明为 final，并内部不允许修改该变量的值。（这句话并不准确，因为如果不是基本数据类型的时候，只是不允许修改引用指向的对象，而对象本身是可以被就修改的）
         * 第三点是贴过来的，啥意思
         */
        class FieldInnerClass {
            public void test() {
                System.out.println("方法内部类中的方法");
                System.out.println(privateField);
                System.out.println(privateStaticField);
                System.out.println(publicField);
                System.out.println(test);
                // 局部类只能引用final，不可变的成员变量
                // test++;
            }
        }

        FieldInnerClass fieldInnerClass = new FieldInnerClass();
        fieldInnerClass.test();
    }

    public void testAnonymousInnerClass() {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass() {
            @Override
            public int compareTo(Object o) {
                System.out.println("匿名内部类被重写");
                return 1;
            }
        };

        int i = anonymousInnerClass.compareTo(1);
        System.out.println(i);
    }


    static class AnonymousInnerClass implements Comparable {

        @Override
        public int compareTo(Object o) {
            System.out.println("匿名内部类");
            return 0;
        }
    }
}

