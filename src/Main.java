import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ValidationUtil validationUtil = new ValidationUtil();
        Converter converter = new Converter();

        String testDoubleInput = "121.65";

        if (validationUtil.validateDouble(testDoubleInput)) {
            double valueCurrency = validationUtil.parseDoubleFromString(testDoubleInput);
            converter.convertSolesToEuros(valueCurrency);
        }

        Formulario formulario = new Formulario();
        formulario.ConvertirMonedas(validationUtil.parseDoubleFromString(testDoubleInput));

        while(true) {

            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda"}, "Seleccion")).toString();

            switch(opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if(ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        monedas.ConvertirMonedas(Minput);

                        int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta){
                            System.out.println("Selecciona opción Afirmativa");
                        }else{
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;


                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if(ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);

                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if((respuesta == 0) && (ValidarNumero(input) == true)) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
            }

        }
}