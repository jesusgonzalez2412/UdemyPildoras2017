
package seccion3.arrays;

/**
 *
 * @author bytejg
 */
public class Ejemplo_Arrays_Bidimensional_Forecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int [] [] numeros = new int [5] [3];
        
       int [] [] numeros = {
           {1,2,3},
           {4,5,6},
           {7,8,9},
           {10,11,12},
           {13,14,15}};
        for (int[] dimension1 : numeros) {
            
            for (int dimension2 : dimension1) {
                
                System.out.print(dimension2 +" ");
                
            }
            System.out.println();
            
        }
        
    }
    
}
