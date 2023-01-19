package functional_interface.function;

import functional_interface.common.Apple;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Apple apple10 = new Apple(10, "red");
        AppleFunction appleFunction = new AppleFunction();

        System.out.println("직접 구현을 통하여 무게 변형을 시킨 Apple의 무게 : " + appleFunction.apply(apple10).getWeight());

        Function<Apple, Apple> func = apple -> new Apple(apple.getWeight() + 1000, "blue");
        System.out.println("람다를 이용하여 무게 변형을 시킨 Apple의 무게 : " + func.apply(apple10).getWeight());

        Function<Apple, Apple> func2 = apple -> new Apple(apple.getWeight() + 10000, "blue");
        System.out.println("andThen을 사용하여 무게 변형을 2번 시킨 Apple의 무게 : " + func2.andThen(func).apply(apple10).getWeight());
    }
}
