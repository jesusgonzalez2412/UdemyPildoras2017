package seccion3.poo;

public class Vehiculos {

    /**
     * Constructor de la clase, mimso nombre que la clase
     */
    public Vehiculos(int ruedas) {
        //Dan estado incial
        this.ruedas = ruedas;
        largo = 2;
        ancho = 1;
        peso = 2;
        color = "Sin color";

    }

    public void setExtra(boolean climatizador) {
        this.climatizador = climatizador;
    }
    
    public void setExtra (boolean gps, boolean climatizador, boolean tapiceria_cuero){
        this.climatizador=climatizador;
        this.gps=gps;
        this.tapiceriaCuero=tapiceria_cuero;
        
    }

    public String getExtra() {

        if (climatizador && gps== false && tapiceriaCuero == false ) 
            return "Tu coche tiene climatizador";
        else if(climatizador && gps && tapiceriaCuero) return "Tu vehiculo lleva el pack de extras";
        
        else return "La convinacion de estras que ha eligido no se Admite";
        
    }

    public int getRueda() {
        return ruedas;
    }

    public void setRueda(int rueda) {
        this.ruedas = rueda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void asignarColor() {
        color = "Azul";
    }

    public String getDatosVehiculo() {
        return "Tu vehivulo tiene " + ruedas + " Ruedas Ademas tiene " + " Tiene " + largo + " mts de largo";
    }

    private int ruedas;
    private String color;
    private double largo;
    private int ancho;
    private int peso;
    /**
     * Varibale de Tipo Booleano
     */
    private boolean climatizador;
    private boolean tapiceriaCuero;
    private boolean gps;

}
