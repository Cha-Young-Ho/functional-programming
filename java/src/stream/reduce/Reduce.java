package stream.reduce;

import java.util.ArrayList;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(i + 1);
        }


        System.out.println(array.stream().reduce(0, (a, b) -> a+ b));
        System.out.println(array.parallelStream().reduce(0, (a,b) -> {
            System.out.println(Thread.currentThread().getName());
            return a+b;
        }));

    }
}
