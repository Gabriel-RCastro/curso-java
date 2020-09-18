package POO.exemplos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteFileAndScanner {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\Desktop\\in.txt");

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
