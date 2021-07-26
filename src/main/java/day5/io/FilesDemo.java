package day5.io;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        Path pathToFile = Paths.get("c:\\data\\data.txt");
        System.out.println(pathToFile.getParent());
        System.out.println(pathToFile.getFileName());
        try {
            //kopiowanie pliku z nadpisywanie poprzedniej zawartości
            Files.copy(pathToFile, Paths.get(pathToFile.getParent()+"\\copy_" + pathToFile.getFileName()), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> allLines = Files.readAllLines(pathToFile);
        System.out.println(allLines);
    }
}
