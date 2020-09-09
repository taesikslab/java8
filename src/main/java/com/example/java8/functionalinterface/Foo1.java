package com.example.java8.functionalinterface;

public class Foo1 {

    public static void main(String[] args) {
        // 기존의 익명 내부 클래스
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hi");
            }
        };
        runSomething.doIt();

        RunSomething runLambda = () -> System.out.println("Hello, Lambda!");
        runLambda.doIt();

        RunSomething runSeveralLines = () -> {
            System.out.println("Hello");
            System.out.println("Lambda");
        };
        runSeveralLines.doIt();
    }
}
