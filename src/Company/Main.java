package Company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        task1();
        task2();
        System.out.println(factorial(5));
        System.out.println(sumOddNumbersBetween(1,7));

    }

    private static void task1() {
        IntStream intStream1 = IntStream.of(1,3,15,35,45, 13, 77, 75);
        IntStream intStream2 = IntStream.of(2,4,30, 34, 60,90,120, 64, 18);
        IntStream intStream = IntStream.concat(intStream1,intStream2);
        intStream
                .filter(i -> i % 3 == 0)
                .filter(i -> i%5 == 0)
                .sorted()
                .skip(2)
                .forEach(System.out::println);
    }

    private static void task2() {
        List<String> badWords = Arrays.asList("два", "три", "пять", "семь", "стопятьсот");
        String text = "раз два три четыре пять вышел зайчик погулять";
        Stream<String> newStream = Stream.of(text.split(" ", 0));

        newStream
                .filter(word->badWords.contains(word))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static long factorial(long number) throws Exception {
        return LongStream.rangeClosed(2, number)
                .reduce((long a, long b) -> a * b)
                .orElseThrow(() -> new Exception("Check the number!"));
    }

    public static int sumOddNumbersBetween(int a, int b) {
        return IntStream.rangeClosed(a,b)
                .filter(n->n%2==1)
                .reduce(0, (int n1, int n2) -> n1 + n2);
        //      .reduce(0, Integer::sum);
    }

}

