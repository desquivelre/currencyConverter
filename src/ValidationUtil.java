public class ValidationUtil {
    public boolean validateDouble(String value) {
        try {
            double valueParsed = Double.parseDouble(value);
            if (valueParsed > 0) {
                return true;
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return false;
    }

    public double parseDoubleFromString(String value) {
        return Double.parseDouble(value);
    }
}
