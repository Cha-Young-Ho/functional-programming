package functional_interface.predicate;

import functional_interface.common.Apple;

import java.util.function.Predicate;

public class ApplePredicate implements Predicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        if(apple.getColor().equals("red")){
            return true;
        }
        return false;
    }
}
