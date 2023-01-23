package lambda.localvariable;

public class LocalVariable {
    public static void main(String[] args) {
        /**
         * 지역 변수를 변경하는 경우
         */
        int portNumber1 = 1337;

        Runnable comfileErrorCase = () -> System.out.println(portNumber1);
        portNumber1 = 31337;

        /**
         * 지역 변수를 변경하지 않는 경우
         */
        int portNumber2 = 1337;

        Runnable noErrorCase = () -> System.out.println(portNumber2);

        /**
         * 지역 변수를 final로 사용
         */
        final int portNumber3 = 1337;

        Runnable finalCase = () -> System.out.println(portNumber3);

        /**
         * 지역 변수 값을 다른 지역 변수에 담아서 사용
         */
        int portNumber4 = 1337;

        int finalPortNumber = portNumber4;
        Runnable effectivelyFinalCase = () -> System.out.println(finalPortNumber);
        portNumber4 = 31337;
    }
}
