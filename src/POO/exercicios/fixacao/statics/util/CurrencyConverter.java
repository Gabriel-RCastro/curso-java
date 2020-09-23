package POO.exercicios.fixacao.statics.util;

public class CurrencyConverter {

    public static double DOLLAR;
    public static double BUY_DOLLARS;
    public static final double IOF = 0.06;

    public static double converterInReais() {
        double tax = (BUY_DOLLARS * DOLLAR) * IOF;
        return (BUY_DOLLARS * DOLLAR) + tax;
    }
}