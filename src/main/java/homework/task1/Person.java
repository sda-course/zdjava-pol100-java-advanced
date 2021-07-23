package homework.task1;

import java.time.LocalDate;

class Person {
    String name;
    LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person() {
        System.out.println("Hello Worker");
    }

    @Override
    public String toString() {
        return "Osoba " + name + " urodzona w " + birthDate;
    }
}
