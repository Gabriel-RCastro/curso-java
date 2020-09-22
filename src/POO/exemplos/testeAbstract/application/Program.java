package POO.exemplos.testeAbstract.application;

import POO.exemplos.testeAbstract.entities.Circle;
import POO.exemplos.testeAbstract.entities.Rectangle;
import POO.exemplos.testeAbstract.entities.Shape;
import POO.exemplos.testeAbstract.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> listShapes = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i+1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char response = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (response == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                listShapes.add(new Rectangle(color, width, height));
            } else if (response == 'c'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                listShapes.add(new Circle(color, radius));
            }
        }

        System.out.println("\nSHAPE AREAS:");
        for (Shape s : listShapes) {
            System.out.printf("%.2f%n", s.area());
        }

        sc.close();
    }
}
