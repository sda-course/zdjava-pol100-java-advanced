package day5.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputReaderDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("c:\\data\\data.txt")){
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak takiego pliku!");
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku!");
        }
    }
}
