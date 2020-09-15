package com.example.java8.functionalinterface;

import java.util.function.*;

public class Foo2 {

    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        System.out.println(plus10.apply(1));

        UnaryOperator<Integer> multiply2 = (i -> i * 2);
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(2)); // 2*2+10
        System.out.println(plus10.andThen(multiply2).apply(2)); // (2+10)*2

        Consumer<Integer> printT = integer -> System.out.println(integer);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        Predicate<String> startsWithY = (s) -> s.startsWith("y");
        Predicate<String> startsWithCapitalY = (s) -> s.startsWith("Y");
        System.out.println(startsWithY.or(startsWithCapitalY).test("yoo ts"));
        System.out.println(startsWithCapitalY.test("yoo ts"));
        Predicate<Integer> isOdd = integer -> integer % 2 == 1;


    }
}
