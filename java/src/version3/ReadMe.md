# Version 3️⃣
인터페이스를 활용한 Version입니다.

# Focus
구현이 되지않은 인터페이스를 파라미터로 넘기도록 구성하였습니다.

```java
customerServiceV3.searchCustomers(new SearchFilter() {
            @Override
            public boolean isMatched(Customer customer) {

                if(customer.getGender().equals(Gender.MALE)){
                    return true;
                }
                return false;
            }
        });
```

파라미터를 넘겨주면서 구체적인 구현 내용을 설정한 부분입니다.

# Precaution

위의 구현내용을 보면, 코드의 양이 방대해져서 코드가 지저분해지는 결과가 생깁니다.

다음 Version에서는 자바 8부터 제공되는 "lambda"를 이용하여 코드를 좀 더 클린하게 구성하도록 합니다.