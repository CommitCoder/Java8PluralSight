import filter.reduce.City;
import filter.reduce.Person;

import java.util.List;

public class FlatMapping {

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

        City newYork = new City("New York", p1,p2,p3);
        City paris = new City("Paris", p1,p2,p3);
        City london = new City("London", p1,p2,p3);

        List<City> cities = List.of(newYork, paris, london);

        //1
        long count = cities.stream()
                .flatMap(city -> city.getPeople().stream())
                .count();

        System.out.println(count);
        System.out.println("_____");

        //2
        cities.stream()
                .flatMap(city ->city.getPeople().stream())
                .forEach(p -> System.out.println(p));

        //3
        System.out.println("______3");
        cities.stream()
                .flatMap(city -> city.getPeople().stream())
                .map(p->p.getName())
                .forEach(name -> System.out.println(name));

    }

}
