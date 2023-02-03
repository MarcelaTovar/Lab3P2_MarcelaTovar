
package lab3p2_marcelatovar;

import java.util.ArrayList;


public class Concesionaria {
    private String nombreEmpresa;
    private int idEmpresa;
    private String direccion;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private int saldo;

    public Concesionaria() {
    }

    public Concesionaria(String nombreEmpresa, int idEmpresa, String direccion, int saldo) {
        this.nombreEmpresa = nombreEmpresa;
        this.idEmpresa = idEmpresa;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nombreEmpresa=" + nombreEmpresa + ", idEmpresa=" + idEmpresa + ", direccion=" + direccion + ", vehiculos=" + vehiculos + ", clientes=" + clientes + ", saldo=" + saldo + '}';
    }
    
    
}
