package POO.exercicios.fixacao.exercicioArrays.application;

import POO.exercicios.fixacao.exercicioArrays.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vectRooms = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int quantityRooms = sc.nextInt();

        for (int i = 1; i <= quantityRooms; i++) {
            System.out.print("\nRent #" + i + ": ");
            System.out.print("\nName: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            vectRooms[room] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < vectRooms.length; i++) {
            if (vectRooms[i] != null) {
                System.out.println(i + ": " + vectRooms[i]);
            }
        }

        sc.close();
    }
}