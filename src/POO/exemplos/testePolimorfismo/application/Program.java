package POO.exemplos.testePolimorfismo.application;

import POO.exemplos.testePolimorfismo.entities.Employee;
import POO.exemplos.testePolimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char response = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (response == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                employeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employeeList.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS:");
        for (Employee emp : employeeList) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
