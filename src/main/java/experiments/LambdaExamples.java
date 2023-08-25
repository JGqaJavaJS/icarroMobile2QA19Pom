package experiments;

import java.util.ArrayList;
import java.util.List;

public class LambdaExamples {

    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(5);
        list.add(7);
        list.add(6);

        list.forEach(c -> System.out.println(c * 3));
        list.forEach(System.out::println); // MyClass with method square 3 -> return 9
        // MyClass::methodName

        for(Integer c: list) {
            System.out.println(c);
        }

        list.forEach(c -> {
            if(c % 2 == 0) {
                System.out.println("even digit");
            } else {
                System.out.println("not zero");
            }
        });

    }

}
