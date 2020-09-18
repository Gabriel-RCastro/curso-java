package POO.exercicios.fixacao.exercicio11.entities;

public class Company extends TaxPayer {

    private int numberEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, int numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public Double tax() {
        double tax;

        if (numberEmployees > 10) {
            tax = getAnualIncome() * 0.14;
        } else {
            tax = getAnualIncome() * 0.16;
        }
        return tax;
    }
}
