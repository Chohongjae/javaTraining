package com.chongjae.javaTraining.liveStudy.week7;

public class AccessModifierTest {
    public void test() {
        PublicClassTest publicClassTest = new PublicClassTest();
        publicClassTest.publicMethod();    // public 메소드는 어디서나 접근이 가능하다.
        publicClassTest.protectedMethod(); // 같은 패키지에 있으므로 default 메소드 접근이 가능하다.
        publicClassTest.defaultMethod();   // 같은 패키지에 있으므로 default 메소드 접근이 가능하다.
//        publicClassTest.privateMethod();   // private 메소드는 같은 클래스에서만 접근이 가능하므로 접근이 불가하다.
    }

    public void test2() {
        DefaultClassTest defaultClassTest = new DefaultClassTest(); // 같은 패키지에 있으므로 default 클래스 접근이 가능하다.
        defaultClassTest.publicMethod();
        defaultClassTest.protectedMethod();
        defaultClassTest.defaultMethod();
    }
}
