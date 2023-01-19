package functional_interface.function;

import functional_interface.common.Apple;

import java.util.function.Function;

public class AppleFunction implements Function<Apple, Apple> {
    @Override
    public Apple apply(Apple apple) {
        Apple newApple = new Apple(apple.getWeight() + 100,  apple.getColor());
        return newApple;
    }

}
