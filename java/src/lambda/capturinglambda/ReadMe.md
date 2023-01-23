# Capturing Lambda

Lambda 내부에서 지역 변수를 사용하는 다양한 케이스

# Case
comfileErrorCase
* Lambda 내부에서 지역 변수를 사용 후 해당 변수 값을 변경하는 경우 컴파일 에러가 발생한다.

noErrorCase
* Lambda 내부에서 지역 변수를 사용 후 해당 변수 값을 변경하지 않으면 컴파일 에러가 발생하지 않는다.

finalCase
* Lambda 내부에서 final 지역 변수를 사용하여 변수 값이 변경되지 않음을 보장하여 컴파일 에러가 발생하지 않는다.

effectivelyFinalCase
* Lambda 내부에서 사용할 지역 변수를 새로운 지역 변수에 값을 저장하여 사용하고 변수 값이 Lambda에서 사용하지 않는 변수 값만 변경하여 컴파일 에러가 발생하지 않는다.

# Why
Capturing Lambda
* Lambda에서는 외부 지역 변수를 캡처하여 사용할 수 있다.
* 해당 지역 변수는 값이 변경되지 않아야 한다.

이유
* 지역 변수는 stack 영역에 저장된다.
* Lambda로 생성한 Runnable Instance는 동적으로 생성되어 heap 영역에 저장된다.
* 해당 스레드가 종료되면 Lambda에서 사용하는 지역 변수가 속한 stack에 접근할 수 없게 된다.
* 이때 heap에 저장된 Runnable Instance의 run이 실행되면 Lambda에서 사용하는 지역 변수가 필요하다.
