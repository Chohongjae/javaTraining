package com.chongjae.javaTraining.liveStudy.week7;

public class PublicClassTest {
    public void publicMethod() {
        System.out.println("public");
        protectedMethod(); // 같은 클래스 내에서 접근 가능하다.
        defaultMethod();   // 같은 클래스 내에서 접근 가능하다.
        privateMethod();   // 같은 클래스 내에서 접근 가능하다.
    }

    protected void protectedMethod() {
        System.out.println("protected");
    }

    void defaultMethod() {
        System.out.println("default");
    }

    private void privateMethod() {
        System.out.println("private");
    }

    public static void main(String[] args) {
        PublicClassTest publicClassTest = new PublicClassTest();
        publicClassTest.privateMethod();
        publicClassTest.publicMethod();
    }
}
