# Functional Interface

자바에서는 많은 함수형 인터페이스를 제공해줍니다.

대표적인 함수형 인터페이스만 살펴보겠습니다.

1. **Predicate<T>**

내부적으로 "test"라는 함수가 1개 존재합니다.

Predicate는 로직을 수행하고 "true", "false"를 응답하는 함수형 인터페이스입니다.

Predicate의 사전적 의미는 "~가 사실이라고 단정하다" 라는 뜻입니다.

특정 로직을 수행하여 어떠한 값이 어떠한 상황에 사실인지 거짓인지 판단하는 함수형 인터페이스입니다.

2. **Consumer<T>**

내부적으로 "accept"라는 함수가 1개 존재합니다.

Spring 진영의 WebFlux에서 적극적으로 사용되는 함수형 인터페이스입니다.

Consumer는 미리 설정해준 특정 로직을 수행하는 함수형 인터페이스입니다.

예시 코드로 살펴보면 다음과 같습니다.

```java
list.stream().forEach(str -> System.out.println(str));
```
위의 부분에서 "str -> System.out.println(str)" 부분이 Consumer 부분입니다.

보통 Publisher <-> Consuer 구조를 가지고 있습니다.

3. **Function<T,R>**

내부적으로 "apply"라는 함수가 1개 존재합니다.

Function은 어떠한 파라미터를 받아서 다른 값으로 변형하여 리턴하는 함수형 인터페이스입니다.

4. **Supplier<T>**

내부적으로 "get"라는 함수가 1개 존재합니다.

특정한 값을 리턴하는 함수형 인터페이스입니다.








