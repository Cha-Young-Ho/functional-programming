# Function

Function은 주어진 파라미터를 다른 형태로 가공하여 리턴을 도와주는 함수형 인터페이스입니다.

Function을 이용하는 방법은 총 2가지가 존재합니다.

* "implements"를 이용한 직접 구현
```java
public class AppleFunction implements Function<Apple, Apple> {
    @Override
    public Apple apply(Apple apple) {
        Apple newApple = new Apple(apple.getWeight() + 100,  apple.getColor());
        return newApple;
    }

}
```

* lambda를 이용한 즉각구현
```java
Function<Apple, Apple> func = apple -> new Apple(apple.getWeight() + 1000, "blue");
```

위와 같이 구현하면 전달받은 Apple에서 무게가 100이 추가된 새로운 Apple이 return됩니다.


# Focus

Function은 "andThen", "compose"를 이용하여 연쇄적으로 사용할 수 있습니다.

다음의 코드를 살펴봅시다.

```java
Function<Apple, Apple> func = apple -> new Apple(apple.getWeight() + 1000, "blue");

Function<Apple, Apple> func2 = apple -> new Apple(apple.getWeight() + 10000, "blue");

System.out.println("andThen을 사용하여 무게 변형을 2번 시킨 Apple의 무게 : " + func2.andThen(func).apply(apple10).getWeight());
        
// 출력값
// andThen을 사용하여 무게 변형을 2번 시킨 Apple의 무게 : 11010
        
```