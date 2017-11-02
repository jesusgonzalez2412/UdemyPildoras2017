package seccion3.arrays;

/**
 *
 * @author Jesús González
 */
public class Ejemplo_Arrays_Bidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] [] numeros = new int [5][3];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        
        numeros[1][0] = 9;
        numeros[1][1] = 8;
        numeros[1][2] = 7;
        
        numeros[2][0] = 4;
        numeros[2][1] = 5;
        numeros[2][2] = 6;
        
        numeros[3][0] = 16;
        numeros[3][1] = 15;
        numeros[3][2] = 14;
        
        numeros[4][0] = 11;
        numeros[4][1] = 12;
        numeros[4][2] = 13;
        
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j] +" ");
                
            }
            System.out.println("");
            
        }
        
    }
    
}
