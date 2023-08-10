public class Main {
    public static void main(String[] args) {
        ValidationUtil validationUtil = new ValidationUtil();
        Converter converter = new Converter();

        String testDoubleInput = "121.65";

        if (validationUtil.validateDouble(testDoubleInput)){
            double valueCurrency = validationUtil.parseDoubleFromString(testDoubleInput);
            System.out.println(converter.convertDolaresToSoles(valueCurrency));
        }
    }
}