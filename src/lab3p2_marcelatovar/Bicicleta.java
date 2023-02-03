
package lab3p2_marcelatovar;


public class Bicicleta extends Vehiculo{
    private String descripcion;
    private int radioRueda;
    private String tipo;

    public Bicicleta() {
    }

    public Bicicleta(String descripcion, int radioRueda, String color, String marca, String modelo, int anio, double precio, int cantidadLlantas) {
        super(color, marca, modelo, anio, precio, cantidadLlantas);
        this.descripcion = descripcion;
        this.radioRueda = radioRueda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRadioRueda() {
        return radioRueda;
    }

    public void setRadioRueda(int radioRueda) {
        this.radioRueda = radioRueda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    @Override
    public String toString() {
        return "Bicicleta{" + "descripcion=" + descripcion + ", radioRueda=" + radioRueda + '}';
    }
    
    
}
