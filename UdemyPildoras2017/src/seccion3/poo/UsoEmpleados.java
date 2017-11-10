/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccion3.poo;

/**
 *
 * @author bytejg
 */
public class UsoEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleados empleado1 = new Empleados("Ana");
        System.out.println(empleado1.getDatosEmpleado());
        empleado1.setSeccion("RRHH");
        System.out.println(empleado1.getDatosEmpleado());
    }
    
}

class Empleados{
    /**Estado incial de los atributos
     * Departamente obligado es el de Admon
     */
public Empleados(String nombre)    {
    this.NOMBRE=nombre;
    seccion="Administracion";//Obligamos a todos los empleados que pasen en un principio en admon
    
}
/**
 * Metodo para cambiar la seccion que le pertenece
 */
public void setSeccion(String seccion){
    this.seccion=seccion;
    
    
}
public String getDatosEmpleado(){
    return "El empleado "+ NOMBRE +" Pertenece a la seccion "+seccion;
    
}
/*public void setNombre (String nom){
    this.NOMBRE=nom;
}*/

    
    private final String NOMBRE; //Constante de la clase Empleado
    private String seccion;
}
