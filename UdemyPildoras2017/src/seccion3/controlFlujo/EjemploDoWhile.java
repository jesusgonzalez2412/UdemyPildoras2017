package seccion3.controlFlujo;

import javax.swing.JOptionPane;

/**
 *
 * @author bytejg
 */
public class EjemploDoWhile {

    public static void main(String[] args) {
        /* Programa que cuenta las paalbras introducidas por el usuario y verifica
        que sea diferente de Salir!*/
        JOptionPane.showMessageDialog(null, "Este programa cuenta los caracteres de la"
                + "palabra o frase introducida\n"
                + "Para terminar escribe salir\n");
        String texto = "";

        while (!texto.equals("salir")) {
            texto = JOptionPane.showInputDialog("Introduce el Texto");

            if (texto.equals("salir")) {
                JOptionPane.showMessageDialog(null, "Has Salido del Sistema");
                System.exit(0);
            } else {

                JOptionPane.showMessageDialog(null, "El texto introducido tiene " + texto.length()
                        + " Caracteres");
            }
        }
        System.out.println("Has salido del Sistema");

    }

}
