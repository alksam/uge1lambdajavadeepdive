package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PersonsB {

    static int getAgee(Person person) {
        return LocalDate.now().getYear() - LocalDate.parse(person.getBirthday(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();

    }

    static int gennemsnit (Person[] persons) {
        int sum = 0;
        for (Person person : persons) {
            sum += getAgee(person);
        }
        return sum / persons.length;
    }
        /*static int equals (Person[] persons) {
            for (int i = 0; i < persons.length; i++) {
                if (persons[i].getBirthday().equals(searchFor)) {
                    return i;
                }
            }

        }*/



    public static  void  main (String[] args) {
        Person[] persons = {
                new Person("01/01/1970", "John"),
                new Person("01/01/1971", "Mary"),
                new Person("01/01/1972", "Mike"),
                new Person("01/01/1973", "Lisa"),
                new Person("01/01/1974", "Bob"),
                new Person("01/01/1975", "Alice"),
                new Person("01/01/1976", "Joe"),
                new Person("01/01/1977", "Jane"),
                new Person("01/01/1978", "Fred"),
                new Person("01/01/1979", "Karen"),


        };


        LocalDateTime now = LocalDateTime.now();

        // Using predefined formats
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // bergrin af age
        for (Person person : persons) {
            System.out.println(person.getName() + " is " + getAgee(person) + " years old");


        }

        System.out.println("Average age is " + gennemsnit(persons) + " years old");



    }
}
