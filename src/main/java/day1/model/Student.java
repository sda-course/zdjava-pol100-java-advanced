package day1.model;

import java.time.LocalDate;

public class Student extends Person{
    int album;
    String course;

    public Student(String firstName, String lastName, LocalDate birthDate, int album, String course) {
        super(firstName, lastName, birthDate);
        this.album = album;
        this.course = course;
    }

    public Student(){
    }


    @Override
    public String toString(){
        return super.toString() +", " + album + ", " + course;
    }
}
