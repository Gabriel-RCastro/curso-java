package POO.exercicios.fixacao.listas.application;

import POO.exercicios.fixacao.listas.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int numEmployees = sc.nextInt();

        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("\nEmployee #" + i + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();
            Integer position = hasId(list, id);
            if (position != null) {
                System.out.print("Id ja existente, tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name =  sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Integer position = hasId(list, id);

        if (position == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(position).increaseSalary(percentage);
        }

        System.out.println("\nList of employees:");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer hasId(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}