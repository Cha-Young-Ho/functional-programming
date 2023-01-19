# Predicate

Predicate는 파라미터의 값이 특별한 로직에 따라 true인지 혹은 false인지 판단을 도와주는 함수형 인터페이스입니다.

위에서의 예시코드를 살펴보면,

Predicate를 사용하는 방법은 총 2가지가 존재합니다.

* 직접 "implements"로 구현
```java
public class ApplePredicate implements Predicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        if(apple.getColor().equals("red")){
            return true;
        }
        return false;
    }
}
```

* lambda를 이용하여 즉각 구현
```java
Predicate<Apple> lambdaPredicateApple = apple -> apple.getColor().equals("red");
```


위의 로직대로 살펴보면, 전달받은 "Apple" 객체의 color가 "red"일 경우 true를 리턴합니다.