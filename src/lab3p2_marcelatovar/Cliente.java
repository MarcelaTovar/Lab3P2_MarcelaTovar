
package lab3p2_marcelatovar;

import java.util.ArrayList;


public class Cliente {
    private int idUnico;
    private String nombre;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private double saldo;

    public Cliente() {
    }

    public Cliente( String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(int idUnico) {
        this.idUnico = idUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idUnico=" + idUnico + ", nombre=" + nombre + ", vehiculos=" + vehiculos + ", saldo=" + saldo + '}';
    }
    
    
}
