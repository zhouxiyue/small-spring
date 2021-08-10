package cn.bugstack.springframework.test;

import java.lang.reflect.Constructor;

public class constructorTest {
    public static void main(String args[]){
        Class<constructorTest> constructTestClass = constructorTest.class;
        Constructor[] constructors =  constructTestClass.getDeclaredConstructors();
        for(Constructor constructor:constructors){
            System.out.println(constructor.toString());
        }
        System.out.println();
    }

    public constructorTest(){
        System.out.println("constructor test with no param");
    }

    private constructorTest(String param){
        System.out.println("constructor test with param "+param);
    }
}
