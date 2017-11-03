
package seccion3.poo;

import javax.swing.JOptionPane;


public class usoVehiculos {
    
    public static void main(String[] args){
        Vehiculos miCoche = new Vehiculos(4);
        Vehiculos miCoche2  = new Vehiculos(4);
        Vehiculos mimoto1 = new Vehiculos(2);
        
        miCoche.setColor("Amarillo");
        miCoche2.setExtra(true);
        
        
        System.out.println(miCoche.getColor());
        miCoche2.setColor("Rojo");
        
        System.out.println(miCoche2.getExtra());
        System.out.println(miCoche.getDatosVehiculo());
        System.out.println(mimoto1.getDatosVehiculo());
    }
    
}
