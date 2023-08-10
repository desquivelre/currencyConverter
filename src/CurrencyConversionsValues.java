public enum CurrencyConversionsValues {
    USD_TO_PEN(3.7000), PEN_TO_USD(0.2700);

    private final double valueCurrency;

    CurrencyConversionsValues(double valueCurrency) {
        this.valueCurrency = valueCurrency;
    }

    public double getValueCurrency(){
        return this.valueCurrency;
    }
}
