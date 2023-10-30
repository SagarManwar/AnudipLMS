package CollectionAssignment;

import java.util.ArrayList;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [Name: " + name + ", Age: " + age + "]";
    }
}

public class CollectionAssignment3 {
    public static void main(String[] args) {
        // Create an ArrayList of Person objects
        ArrayList<Person> peopleList = new ArrayList<>();

        // Add 10 Person objects to the ArrayList
        peopleList.add(new Person("Alice", 25));
        peopleList.add(new Person("Bob", 30));
        peopleList.add(new Person("Charlie", 28));
        peopleList.add(new Person("David", 35));
        peopleList.add(new Person("Eve", 22));
        peopleList.add(new Person("Frank", 40));
        peopleList.add(new Person("Grace", 27));
        peopleList.add(new Person("Helen", 33));
        peopleList.add(new Person("Ivy", 29));
        peopleList.add(new Person("Jack", 24));

        // Iterate through the ArrayList and print each Person using a foreach loop
        for (Person person : peopleList) {
            System.out.println(person);
        }
    }
}

