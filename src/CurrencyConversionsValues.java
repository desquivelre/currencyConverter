public enum CurrencyConversionsValues {
    USD_TO_PEN(3.7000, "soles"), PEN_TO_USD(0.2700, "dolares"), EUR_PEN(4.0599, "soles"), PEN_EUR(0.2464, "euros");

    private final double valueCurrency;
    private final String valueCurrencyName;

    CurrencyConversionsValues(double valueCurrency, String valueCurrencyName) {
        this.valueCurrency = valueCurrency;
        this.valueCurrencyName = valueCurrencyName;
    }

    public double getValueCurrency() {
        return this.valueCurrency;
    }

    public String getValueCurrencyName() {
        return valueCurrencyName;
    }
}
