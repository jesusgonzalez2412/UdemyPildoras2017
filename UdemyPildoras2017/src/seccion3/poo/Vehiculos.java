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

    public String getExtra() {

        if (climatizador == true) {
            return "Tu coche tiene climatizador";
        } else {
            return "Tu coche no tiene climatizador";
        }
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

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
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
    private int largo;
    private int ancho;
    private int peso;
    /**
     * Varibale de Tipo Booleano
     */
    private boolean climatizador;
    private boolean tapiceriaCuero;
    private boolean gps;

}
