package POO.exemplos.curingas.delimitados.problema1.application;

import POO.exemplos.curingas.delimitados.problema1.entities.Circle;
import POO.exemplos.curingas.delimitados.problema1.entities.Rectangle;
import POO.exemplos.curingas.delimitados.problema1.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list) {
        // list.add(new Rectangle(3.0, 4.0)); // NÃO é possível adicionar elementos na lista do método
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
