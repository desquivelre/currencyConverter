import javax.swing.*;

public class Converter {

    public double convertFromTo(double value, CurrencyConversionsValues processCurrency) {
        double currencyValueProcess = processCurrency.getValueCurrency();
        double finalCurrencyValue = value * currencyValueProcess;

        finalCurrencyValue = (double) Math.round(finalCurrencyValue * 100d) / 100;

        JOptionPane.showMessageDialog(null, "Tienes " + finalCurrencyValue + " " + processCurrency.getValueCurrencyName());
        return finalCurrencyValue;
    }

    public double convertSolesToDolares(double value) {
        return convertFromTo(value, CurrencyConversionsValues.PEN_TO_USD);
    }

    public double convertDolaresToSoles(double value) {
        return convertFromTo(value, CurrencyConversionsValues.USD_TO_PEN);
    }

    public double convertEurosToSoles(double value) {
        return convertFromTo(value, CurrencyConversionsValues.EUR_PEN);
    }

    public double convertSolesToEuros(double value) {
        return convertFromTo(value, CurrencyConversionsValues.PEN_EUR);
    }
}
