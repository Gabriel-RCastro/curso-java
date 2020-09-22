package POO.exemplos;

import java.io.*;
import java.util.Scanner;

public class TesteFile {
    public static void main(String[] args) {

        // FileReader e BufferedReader

        String path1 = "C:\\Users\\User\\Desktop\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path1))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // FileWriter e BufferedWriter

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path2 =  "C:\\Users\\User\\Desktop\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Manipulando pastas com File

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath1 = sc.nextLine();

        File path3 = new File(strPath1);

        File[] folders = path3.listFiles(File::isDirectory);

        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path3.listFiles(File::isFile);

        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath1 + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        // Informações do caminho do arquivo

        System.out.println("Enter a file path: ");
        String strPath2 = sc.nextLine();

        File path4 = new File(strPath2);

        System.out.println("getName: " + path4.getName());
        System.out.println("getParent: " + path4.getParent());
        System.out.println("getPath: " + path4.getPath());

        sc.close();
    }
}
