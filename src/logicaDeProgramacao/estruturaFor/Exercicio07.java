package logicaDeProgramacao.estruturaFor;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i < (N+1); i++) {
            System.out.println(i + " " + (int) Math.pow(i,2) + " " + (int) Math.pow(i,3));
        }

        sc.close();
    }
}
