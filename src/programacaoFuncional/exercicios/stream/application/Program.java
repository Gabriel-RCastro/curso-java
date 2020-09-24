package programacaoFuncional.exercicios.stream.application;

import programacaoFuncional.exercicios.stream.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        Double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            Comparator<String> comp = Comparator.comparing(String::toUpperCase);

            List<String> emails = list.stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted(comp)
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            Double sum = list.stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
