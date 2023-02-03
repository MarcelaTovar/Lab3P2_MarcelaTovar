
package lab3p2_marcelatovar;

import java.awt.Color;


public class Carro extends Vehiculo{
    private int cantidadPuertas;
    private String descripcionMotor;
    private int velocidadMaxima;

    public Carro() {
    }

    public Carro(int cantidadPuertas, String descripcionMotor, int velocidadMaxima, String color, String marca, String modelo, int anio, double precio, int cantidadLlantas) {
        super(color, marca, modelo, anio, precio, cantidadLlantas);
        this.cantidadPuertas = cantidadPuertas;
        this.descripcionMotor = descripcionMotor;
        this.velocidadMaxima = velocidadMaxima;
    }

    

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getDescripcionMotor() {
        return descripcionMotor;
    }

    public void setDescripcionMotor(String descripcionMotor) {
        this.descripcionMotor = descripcionMotor;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    

    @Override
    public String toString() {
        return "Carro{" + "cantidadPuertas=" + cantidadPuertas + ", descripcionMotor=" + descripcionMotor + ", velocidadMaxima=" + velocidadMaxima + '}';
    }
    
    
}
