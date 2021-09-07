package filter.reduce;

import filter.reduce.Person;

import java.util.List;
import java.util.stream.Stream;

public class FirstStreams {


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


        List<Person> people = List.of(p1,p2,p3,p4,p5,p6,p7,p8,p9);
        Stream<Person> stream = people.stream();
        Stream<String> nameStream = stream.map(p -> p.getName()); // nameStream and any other stream can't be used twice
        Stream<String> emptyNames = nameStream.filter(name -> name.isEmpty());
        long countOfEmpty = emptyNames.count();
        System.out.println(countOfEmpty);

        Stream<Person> stream2 = people.stream();
        Stream<String> nameStream2 = stream2.map(p -> p.getName());
        Stream<String> nonEmptyNames = nameStream2.filter(name -> !name.isEmpty());
        long countOfNonEmpty = nonEmptyNames.count();
        System.out.println(countOfNonEmpty);

        long countEmptyNames2 =
                people.stream()
                    .map(p -> p.getName())
                    .filter(name -> name.isEmpty())
                    .count();
        System.out.println(countEmptyNames2);



        // example of not using twice   (stream has already been operated upon or closed)
//        Stream<String> nonEmptyNames = nameStream.filter(name -> !name.isEmpty());
//        long countOfNonEmpty = nonEmptyNames.count();
//        System.out.println(countOfNonEmpty);









    }




}
