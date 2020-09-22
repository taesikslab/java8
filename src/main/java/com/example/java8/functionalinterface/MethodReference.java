package com.example.java8.functionalinterface;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReference {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(greeting.hello("yoo ts"));

        // 아래 두 메서드 레퍼런스는 다른 생성자를 참고한다.
        Function<String, Greeting> myGreeting = Greeting::new;
        Greeting greetingEx1 = myGreeting.apply("taesik");
        System.out.println(greetingEx1.getName());

        Supplier<Greeting> greetingSupplier = Greeting::new;
        greetingSupplier.get();

        // 임의 객체의 인스턴스 메서드 참조
        String[] names = {"a", "c", "b"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

    }
}
