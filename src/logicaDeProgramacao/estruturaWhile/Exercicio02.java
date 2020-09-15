package logicaDeProgramacao.estruturaWhile;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double X = sc.nextDouble();
        double Y = sc.nextDouble();

        while (X != 0 && Y != 0) {
            if (X > 0 && Y > 0) System.out.println("primeiro");
            else if (X < 0 && Y > 0) System.out.println("segundo");
            else if (X < 0 && Y < 0) System.out.println("terceiro");
            else System.out.println("quarto");
            X = sc.nextDouble();
            Y = sc.nextDouble();
        }

        sc.close();
    }
}