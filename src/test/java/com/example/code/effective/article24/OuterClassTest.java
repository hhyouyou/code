package com.example.code.effective.article24;

/**
 * 创建内部类
 */
class OuterClassTest {


    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        OuterClass.StaticMemberInnerClass.test();

        System.out.println(OuterClass.MemberInnerClass.class);
        OuterClass.MemberInnerClass memberInnerClass = outerClass.new MemberInnerClass();
        memberInnerClass.test();

        outerClass.test();

        outerClass.testAnonymousInnerClass();
    }

}