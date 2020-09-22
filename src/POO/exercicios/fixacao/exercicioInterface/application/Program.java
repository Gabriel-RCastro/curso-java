package POO.exercicios.fixacao.exercicioInterface.application;

import POO.exercicios.fixacao.exercicioInterface.model.entities.Contract;
import POO.exercicios.fixacao.exercicioInterface.model.entities.Installment;
import POO.exercicios.fixacao.exercicioInterface.model.services.PayPalService;
import POO.exercicios.fixacao.exercicioInterface.model.services.ContractService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        sc.nextLine();
        Date date = sdf.parse(sc.nextLine());
        System.out.print("Contract value: ");
        double contractValue = sc.nextDouble();
        System.out.print("Enter number of installments: ");
        int numberInstallments = sc.nextInt();

        Contract contract = new Contract(number, date, contractValue);

        ContractService contractService = new ContractService(new PayPalService());

        contractService.processContract(contract, numberInstallments);

        System.out.println("Installments: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
