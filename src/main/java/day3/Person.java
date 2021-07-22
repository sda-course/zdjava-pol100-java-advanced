package day3;

import java.time.LocalDate;

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
