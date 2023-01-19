package functional_interface.predicate;

import functional_interface.common.Apple;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Apple redApple = new Apple(1, "red");
        Apple blueApple = new Apple(10, "blue");
        ApplePredicate applePredicate = new ApplePredicate();
        System.out.println("직접구현한 interface red apple test result : " + applePredicate.test(redApple));
        System.out.println("직접구현한 interface blue apple test result : " + applePredicate.test(blueApple));

        System.out.println("직접구현한 interface red apple negate result : " + applePredicate.negate().test(redApple));
        System.out.println("직접구현한 interface blue apple negate result : " + applePredicate.negate().test(blueApple));

        Predicate<Apple> lambdaPredicateApple = apple -> apple.getColor().equals("red");

        System.out.println("lambda로 구현한 red apple test result : " + lambdaPredicateApple.test(redApple));
    }
}
