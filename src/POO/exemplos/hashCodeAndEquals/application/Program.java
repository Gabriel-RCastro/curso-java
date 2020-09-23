package POO.exemplos.hashCodeAndEquals.application;

import POO.exemplos.hashCodeAndEquals.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2)); // Compara pelo conteúdo dos objetos
        System.out.println(c1 == c2); // Compara as referências dos objetos

        String s1 = "Test"; // expressão literal
        String s2 = "Test"; // expressão literal

        System.out.println(s1 == s2); // Expressão literal é tratada de forma especial (gera igualdade)

        String s3 = new String("Test"); // criação de objeto
        String s4 = new String("Test"); // criação de objeto

        System.out.println(s3 == s4); // Os objetos são alocados em espaços de memória diferentes (não gera igualdade)
    }
}
