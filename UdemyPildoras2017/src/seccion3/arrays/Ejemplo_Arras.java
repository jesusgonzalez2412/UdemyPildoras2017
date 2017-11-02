
package seccion3.arrays;

/**
 *
 * @author Jesús González
 */
public class Ejemplo_Arras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definificion del Array
        int [] valores = new int [5];
        
        valores[0]=24;
        valores[1]=30;
        valores[2]=45;
        valores[3]=50;
        valores[4]=50;
        
        for (int elementos : valores) {
            System.out.print(elementos+" ");
            
        }
        
    }
    
}
