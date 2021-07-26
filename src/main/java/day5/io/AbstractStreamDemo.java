package day5.io;

import javax.security.sasl.SaslClient;
import java.io.*;
import java.util.Scanner;

public class AbstractStreamDemo {
    public static void main(String[] args) throws IOException {
        InputStream console = System.in;
        InputStream fileStream = new FileInputStream("c:\\data\\data.txt");
        System.out.println("Wpisz dowolny znak:");
        int ascii = console.read();
        System.out.println("Kod ascii znaku: " + ascii);
        System.out.println("Znak: " + (char) ascii);
        System.out.println("Odczyt liczb z pliku data.txt i obliczenie sumy.");
        Scanner scanner = new Scanner(fileStream);
        int sum = 0;
        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
        }
        System.out.println("Suma liczb w pliku: " + sum);
        System.out.println("Zapisanie sumy do pliku result.txt.");
        OutputStream outputStream = new FileOutputStream("c:\\data\\result.txt");
        outputStream.write(Integer.toString(sum).getBytes());
        //Zapisz dane w pliku poprzez opróżnienie wewnętrznego bufora
        outputStream.flush();
        fileStream.close();
        outputStream.close();
    }
}
