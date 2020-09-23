package POO.exercicios.fixacao.polimorfismo.entities;

public class Account {

    private final int numberAccount;
    private String holderName;
    private double balance;

    public Account(int numberAccount, String holderName, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.holderName = holderName;
        deposit(initialDeposit);
    }

    public Account(int numberAccount, String holderName) {
        this.numberAccount = numberAccount;
        this.holderName = holderName;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= value + 5.0;
    }

    public String toString() {
        return "Account "
                + numberAccount
                + ", Holder: "
                + holderName
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
