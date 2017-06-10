import java.util.LinkedList;
import java.util.function.Predicate;

class Person {
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void dump()
    {
        System.out.printf("%s %d\n", name, age);
    }
}

class P {
    static void select(LinkedList<Person> persons, Predicate<Person> predicate)
    {
        for (Person person: persons) {
            if (predicate.test(person))
                person.dump();
        }
    }

    static boolean function(Person person)
    {
        return person.age < 10;
    }

    public static void main(String[] args)
    {
        LinkedList<Person> persons = new LinkedList();
        persons.add(new Person("tom", 8));
        persons.add(new Person("jerry", 9));
        persons.add(new Person("mike", 11));
        persons.add(new Person("jordn", 12));
        select(persons, (person) -> person.age > 10);
        select(persons, function);
    }
}
