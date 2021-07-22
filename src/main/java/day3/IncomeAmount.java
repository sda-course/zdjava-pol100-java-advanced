package day3;

import java.math.BigDecimal;

public class IncomeAmount {
    private final BigDecimal amount;

    private IncomeAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public static IncomeAmount of(long zloty, long grosz){
        if (zloty >= 0 && grosz >= 0){
            return new IncomeAmount(
                    new BigDecimal(zloty * 100 + grosz).divide(new BigDecimal(100))
            );
        } else {
            //zgłoszenie wyjątku oznacza przerwanie wykonywania tej metody
            throw new InvalidArgumentIncomeAmountException("Kwota złotych i groszy musi być dodatnia!");
        }
    }

    public static IncomeAmount parse(String amount){
        BigDecimal decimal;
        try{
            decimal = new BigDecimal(amount);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Lancuch nie zawiera poprawnej liczby dziesiętnej!");
        }
        if (decimal.compareTo(BigDecimal.ZERO) == 0 || decimal.compareTo(BigDecimal.ZERO) > 0){
            return new IncomeAmount(decimal);
        } else {
            throw new IllegalArgumentException("Kwota wpływu nie może być ujemna!");
        }
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
