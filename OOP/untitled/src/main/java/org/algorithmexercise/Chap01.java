package org.algorithmexercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Chap01 {


    private static class PhoneNumber {
        public final String phoneNumber;

        public PhoneNumber(String rawPhoneNumber) {
            this.phoneNumber = rawPhoneNumber.replaceAll("[^0-9]", "");

        }

        @Override
        public String toString() {
            return "PhoneNumber{" +
                    "phonNumber='" + phoneNumber + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof PhoneNumber)) return false;
            return phoneNumber.equals(((PhoneNumber)obj).phoneNumber);
        }
    }

    public static class Person {
        public final String name;
        private final List<PhoneNumber> numbers;

        public Person(String name) {
            this.name = name;
            numbers = new ArrayList< >();
        }

        public void addPhoneNumber(PhoneNumber number) {
            numbers.add(number);
        }



        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", numbers=" + numbers +
                    '}';
        }


        public boolean hasPhoneNumber(PhoneNumber number) {
            return numbers.contains(number);
        }
    }

    private static class PhoneBook{
        private final Set<Person> people;

        private PhoneBook() {
            people = new HashSet<>();
        }

        public void addPerson(Person person) {
            people.add(person);
        }

        @Override
        public String toString() {
            return "PhoneBook{" +
                    "people=" + people +
                    '}';
        }

        public Person search(PhoneNumber number) {
            return people.stream().filter(p -> p.hasPhoneNumber(number))
                    .findFirst().orElse(null);
        }

    }


    public static void main(String[] args) {
        Person person1 = new Person("g1");
        person1.addPhoneNumber(new PhoneNumber("010-1234-5678"));
        person1.addPhoneNumber(new PhoneNumber("010-2234-5678"));

        Person person2 = new Person("g2");
        person2.addPhoneNumber(new PhoneNumber("010-3234-5678"));

        Person person3 = new Person("g3");
        person3.addPhoneNumber(new PhoneNumber("010-4234-5678"));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson(person1);
        phoneBook.addPerson(person2);
        phoneBook.addPerson(person3);

        System.out.println(phoneBook.search(new PhoneNumber("01012345678")));
    }


}
