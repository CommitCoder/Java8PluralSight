package stream.from.data.in.memory;

import java.util.stream.IntStream;

public class SkippingAndLimiting {

    public static void main(String[] args) {
        IntStream.range(0, 30)
                .forEach(index -> System.out.print(index + " "));     // 0-29
        System.out.println("");
        System.out.println("_________");

        IntStream.range(0, 30)
                .skip(10)
                .limit(10)
                .forEach(index-> System.out.print(index + " ")); // 10 11 12 13 14 15 16 17 18 19


        //2:35 finished here


    }

}
