package seccion3.ejercicios;


import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author bytejg
 */
public class Video30Adivina_Numero {

    
    public static void main(String[] args) {
        
        int numAleatorio;
        int numero = 0;
        int intentos = 0;
         
        Scanner entrada = new Scanner(System.in);
        
        //Donde n es hasta el número que quieres que llegue, + 1 
        //para que nunca tengas un 0 y el cast a int porque Math#random 
        //arroja un valor de tipo double.
        
        numAleatorio = (int) (Math.random() * 10) + 1;
        System.out.println("Num Aleatorio: "+numAleatorio);
        while (numAleatorio!=numero) {
            intentos++;
            
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un "
                   + "numero en el rango del 1 al 10|"));
                
               if (numero >0 && numero < 11 ) {
                    
                    if (numero>numAleatorio) {
                        JOptionPane.showMessageDialog(null, "El numero que intenta adividar es menor que "+numero);
                    }
                    else if(numero<numAleatorio){
                        JOptionPane.showMessageDialog(null, "El numero que intenta adivida es mayor que "+numero);
                    }
                }
               else{
                   JOptionPane.showMessageDialog(null, "Error! el numero "+numero+" Esta fuera de rango");
               }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error!! Solo admite valores numericoss");
                
            }
                            
        }
        JOptionPane.showMessageDialog(null, "Correcto. Lo has conseguido en "+intentos+" Intentos!");
        
    }
    
}
