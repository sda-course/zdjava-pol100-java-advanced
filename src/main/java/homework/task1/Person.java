package homework.task1;

import java.time.LocalDate;

class Person {
    String name;
    LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        System.out.println("Hello Worker!");
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Osoba " + name + " urodzona w " + birthDate;
    }
}
