
package lab3p2_marcelatovar;


public class Bus extends Vehiculo{
    private int cantidadPasajeros;
    private String tipo;

    public Bus() {
    }
    
    

    public Bus(int cantidadPasajeros, String color, String marca, String modelo, int anio, double precio, int cantidadLlantas) {
        super(color, marca, modelo, anio, precio, cantidadLlantas);
        this.cantidadPasajeros = cantidadPasajeros;
        if (cantidadPasajeros > 50) {
             this.tipo = "De ruta";
        }else{
            this.tipo = "Rapidito";
        }

    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    @Override
    public String toString() {
        return "Bus{" + "cantidadPasajeros=" + cantidadPasajeros + ", tipo=" + tipo + ", cantidadMaxima=";
    }
    
    
}
