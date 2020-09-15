package logicaDeProgramacao.estruturaFor;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), fatorial = 1;

        if (N > 2) {
            fatorial = N;
            for (int i = 1; i < N; i++) {
                fatorial = fatorial * (N - i);
            }
        }

        System.out.println(fatorial);

        sc.close();
    }
}