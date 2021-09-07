package stream.from.data.in.memory;

import filter.reduce.Person;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromArray {
    public static void main(String[] args) {

        Person p1 = new Person("Paul", 30);
        Person p2 = new Person("Sarah", 42);
        Person p3 = new Person("Dom", 17);
        Person p4 = new Person("Nash", 31);
        Person p5 = new Person("Brad", 33);
        Person p6 = new Person("Elan", 25);
        Person p7 = new Person("Meg", 23);
        Person p8 = new Person("Josh", 21);
        Person p9 = new Person("", 44);

        Person[] people = {p1,p2,p3,p4,p5,p6,p7,p8,p9};

        //1
        long count = Stream.of(people).count();
        System.out.println(count);
        System.out.println("______");

        //2
        Arrays.stream(people).forEach(System.out::println);


    }


}
