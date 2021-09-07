package stream.from.data.in.memory;

import java.util.ArrayList;
import java.util.stream.Stream;

public class DropWhileTakeWhile {


    public static void main(String[] args) {
        Class<?> clzz = ArrayList.class;
        clzz.getSuperclass();

//        Stream.<Class<?>>iterate(clzz, c -> c.getSuperclass())
//            .filter(c -> c != null)                  // generates error
//            .forEach(System.out::println);


        Stream.<Class<?>>iterate(clzz, c -> c.getSuperclass())
                .takeWhile(c -> c != null)
                .forEach(System.out::println);


    }







}