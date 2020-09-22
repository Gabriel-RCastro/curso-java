package POO.exercicios.fixacao.exercicioInterface.model.services;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double interest(double amount, int months);
}

