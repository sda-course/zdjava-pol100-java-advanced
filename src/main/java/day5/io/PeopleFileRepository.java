package day5.io;

import day3.Person;

import java.io.*;
import java.util.List;

public class PeopleFileRepository {
    private List<Person> people;
    private final String fileName;

    public PeopleFileRepository(List<Person> people, String fileName) {
        this.people = people;
        this.fileName = fileName;
    }

    public void save() throws IOException {
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream outputStream = new ObjectOutputStream(file);
        outputStream.writeObject(people);
        outputStream.close();
        file.close();
    }

    public List<Person> load() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream inputStream = new ObjectInputStream(file);
        people = (List<Person>) inputStream.readObject();
        file.close();
        inputStream.close();
        return people;
    }

    public List<Person> getPeople() {
        return people;
    }

    public String getFileName() {
        return fileName;
    }
}
