package day3;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private double weight;
    private LocalDate birthDate;

    public Person(String name, double weight, LocalDate birthDate) {
        this.name = name;
        this.weight = weight;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.weight, weight) == 0 && Objects.equals(name, person.name) && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode");
        return Objects.hash(name, weight, birthDate);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
