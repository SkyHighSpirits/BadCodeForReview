package org.example;

public class Main {
import java.util.*;

    class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void speak() {
            System.out.println("Animal speaks something");
        }
    }

    class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        public void bark() {
            System.out.println("Woof woof!");
        }

        public void speak() {
            System.out.println("A dog barks: Woof woof!");
        }
    }

    public class BadCodeExample {
        public static void main(String[] args) {
            ArrayList<Animal> animals = new ArrayList<>();
            animals.add(new Animal("Generic Animal"));
            animals.add(new Dog("Buddy"));

            for (Animal animal : animals) {
                if (animal instanceof Dog) {
                    Dog dog = (Dog) animal;
                    dog.bark();
                } else if (animal instanceof Animal) {
                    animal.speak();
                }
            }

            try {
                int result = 10 / 0;
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}