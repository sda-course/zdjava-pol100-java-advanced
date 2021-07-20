package day1.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Worker extends Person{
    BigDecimal salary;
    String position;

    public Worker(String firstName, String lastName, LocalDate birthDate, BigDecimal salary, String position) {
        super(firstName, lastName, birthDate);
        this.salary = salary;
        this.position = position;
    }

    public Worker() {
    }

    @Override
    public String toString(){
        return super.toString() + ", " + salary +", " + position;
    }
}
