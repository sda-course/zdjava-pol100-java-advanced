package day1.model;

import java.time.LocalDate;

public class Person {
    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Person() {
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public final String asPersonString(){
        return firstName + ", " + lastName + ", " + birthDate;
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName + ", " + birthDate;
    }
}
