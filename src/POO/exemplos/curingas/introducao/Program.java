package POO.exemplos.curingas.introducao;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Joao", "Alex");
        printList(myStrs);
    }

    public static void printList(List<?> list) {
        // list.add(3);  NÃO é possível adicionar dados a uma coleção de tipo curinga
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
