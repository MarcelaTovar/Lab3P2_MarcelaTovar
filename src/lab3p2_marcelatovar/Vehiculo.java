
package lab3p2_marcelatovar;

import java.awt.Color;


public class Vehiculo {
    protected String color;
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precio;
    protected int cantidadLlantas;

    public Vehiculo() {
    }

    public Vehiculo(String color, String marca, String modelo, int anio, double precio, int cantidadLlantas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.cantidadLlantas = cantidadLlantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadLlantas() {
        return cantidadLlantas;
    }

    public void setCantidadLlantas(int cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio + ", cantidadLlantas=" + cantidadLlantas + '}';
    }
    
    
}
