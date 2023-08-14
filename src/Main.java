import javax.swing.*;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        ValidationUtil validationUtil = new ValidationUtil();
        Formulario formulario = new Formulario();

        while (true) {
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda"}, "Seleccion")).toString();

            switch (opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");

                    if (validationUtil.validateDouble(input)) {
                        double Minput = validationUtil.parseDoubleFromString(input);

                        formulario.ConvertirMonedas(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");

                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Selecciona opción Afirmativa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            exit(0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
            }
        }
    }
}