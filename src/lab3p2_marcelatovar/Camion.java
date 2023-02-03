
package lab3p2_marcelatovar;

import java.awt.Color;


public class Camion extends Vehiculo{
    private int volumenMaximo;
    private double altural;
    private boolean retroexcavadora;

    public Camion() {
    }

    public Camion(int volumenMaximo, double altural, boolean retroexcavadora, String color, String marca, String modelo, int anio, double precio, int cantidadLlantas) {
        super(color, marca, modelo, anio, precio, cantidadLlantas);
        this.volumenMaximo = volumenMaximo;
        this.altural = altural;
        this.retroexcavadora = retroexcavadora;
    }

    

    public int getVolumenMaximo() {
        return volumenMaximo;
    }

    public void setVolumenMaximo(int volumenMaximo) {
        this.volumenMaximo = volumenMaximo;
    }

    public double getAltural() {
        return altural;
    }

    public void setAltural(double altural) {
        this.altural = altural;
    }

    public boolean isRetroexcavadora() {
        return retroexcavadora;
    }

    public void setRetroexcavadora(boolean retroexcavadora) {
        this.retroexcavadora = retroexcavadora;
    }

    @Override
    public String toString() {
        return "Camion{" + "volumenMaximo=" + volumenMaximo + ", altural=" + altural + ", retroexcavadora=" + retroexcavadora + '}';
    }
    
    
            
}
