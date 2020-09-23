package POO.exercicios.fixacao.set.application;

import POO.exercicios.fixacao.set.entities.Students;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Students> set = new HashSet<>();

        String[] coursesName = {"A", "B", "C"};

        for (String c : coursesName) {
            System.out.print("How many students for course " + c + "? ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                set.add(new Students(sc.nextInt()));
            }
        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }
}
