package POO.exercicios.fixacao.interfaces.model.services;

public class PayPalService implements OnlinePaymentService {

    private static final Double JUROS_MENSAL = 0.01;
    private static final Double TAXA_PAGAMENTO = 0.02;

    @Override
    public double paymentFee(double amount) {
        return amount * TAXA_PAGAMENTO;
    }

    @Override
    public double interest(double amount, int months) {
        return amount * JUROS_MENSAL * months;
    }
}
