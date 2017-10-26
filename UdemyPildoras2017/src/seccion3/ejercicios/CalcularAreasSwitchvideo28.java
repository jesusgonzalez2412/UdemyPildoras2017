package seccion3.ejercicios;

import javax.swing.*;

/**
 *
 * @author Jesús González
 */
public class CalcularAreasSwitchvideo28 {

    public static void main(String[] args) {

        int figura = 0;
        do {

            figura = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la figura:"
                    + "\n1.- Cuadrado"
                    + "\n2.- Rectangulo"
                    + "\n3.- Triangulo"
                    + "\n4.- Circulo"
                    + "\n5.- Salir de la App\n\n"));
            switch (figura) {
                case 1:
                    int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado:"));
                    JOptionPane.showMessageDialog(null, "El area del Cuadrado es: " + Math.pow(lado, 2));
                    break;
                case 2:
                    int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
                    int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Altura"));
                    JOptionPane.showMessageDialog(null, "El area del rectangulo de " + base + " * "
                            + altura + " es = " + (base * altura));
                    break;
                case 3:
                    base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
                    altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Altura"));
                    JOptionPane.showMessageDialog(null, "El area del triangulo de " + base + " * "
                            + altura + " es = " + (base * altura) / 2);
                    break;
                case 4:
                    int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio"));
                    JOptionPane.showMessageDialog(null, "El are del circulo es: " + Math.PI * (Math.pow(radio, 2)));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valido");
                    
                    break;
            }
        } while (figura != 5);
        JOptionPane.showMessageDialog(null, "Exit!!");
    }

}
