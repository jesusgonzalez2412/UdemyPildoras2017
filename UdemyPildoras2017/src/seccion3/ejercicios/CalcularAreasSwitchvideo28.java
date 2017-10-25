package seccion3.ejercicios;

import javax.swing.*;

/**
 *
 * @author Jesús González
 */
public class CalcularAreasSwitchvideo28 {

    public static void main(String[] args) {

        int figura = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la figura:"
                + "\n1.- Cuadrado"
                + "\n2.- Rectangulo"
                + "\n3.- Triangulo"
                + "\n4.- Circulo\n"));
        switch (figura) {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado:"));
                JOptionPane.showMessageDialog(null,"El area del Cuadrado es: "+Math.pow(lado, 2));
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }

    }

}
