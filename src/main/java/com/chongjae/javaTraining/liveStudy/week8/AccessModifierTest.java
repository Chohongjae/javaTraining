package com.chongjae.javaTraining.liveStudy.week8;


//import com.chongjae.javaTraining.liveStudy.week7.DefaultClassTest;
import com.chongjae.javaTraining.liveStudy.week7.PublicClassTest;


public class AccessModifierTest {
    public void test() {
        PublicClassTest publicClassTest = new PublicClassTest();
        publicClassTest.publicMethod(); // 패키지가 다르기 때문에 public 메소드만 접근 가능하다.
    }
}

class AccessModifierTest2 extends PublicClassTest {
    public void test() {
        super.publicMethod();    // public 이기때문에 당연히 접근 가능하다.
        super.protectedMethod(); // 패키지가 달라도 상속받은 자식 클래스이기 때문에 protected 메소드 접근이 가능하다.
//        super.privateMethod(); // private 메소드는 접근이 불가하다.
    }

    public void test2() {
//        DefaultClassTest defaultClassTest = new DefaultClassTest(); // 다른 패키지에 있으므로 default 클래스에 접근이 불가하다.
    }
}
