package POO.exercicios.fixacao.exercicio3.application;

import POO.exercicios.fixacao.exercicio3.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();
        System.out.print("Nota 1: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n", student.finalGrade());

        if (student.finalGrade() > 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        }

        sc.close();
    }
}
