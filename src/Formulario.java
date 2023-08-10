import javax.swing.*;

public class Formulario {
    Converter converter = new Converter();

    public void ConvertirMonedas(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Soles a Dólar", "De Dólar a Soles", "De Soles a Euros","De Euros a Soles"},
                "Seleccion")).toString();
        switch(opcion) {
            case "De Soles a Dólar":
                converter.convertSolesToDolares(Minput);
                break;
            case "De Dólar a Soles":
                converter.convertDolaresToSoles(Minput);
                break;
            case "De Soles a Euros":
                converter.convertSolesToEuros(Minput);
                break;
            case "De Euros a Soles":
                converter.convertEurosToSoles(Minput);
                break;
        }
    }
}
