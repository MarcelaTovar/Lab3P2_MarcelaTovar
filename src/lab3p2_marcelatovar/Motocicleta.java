
package lab3p2_marcelatovar;


public class Motocicleta extends Vehiculo{
    private String desplasamientoMotor;
    private boolean electrica;

    public Motocicleta() {
    }

    public Motocicleta(String desplasamientoMotor, boolean electrica, String color, String marca, String modelo, int anio, double precio, int cantidadLlantas) {
        super(color, marca, modelo, anio, precio, cantidadLlantas);
        this.desplasamientoMotor = desplasamientoMotor;
        this.electrica = electrica;
    }

    public String getDesplasamientoMotor() {
        return desplasamientoMotor;
    }

    public void setDesplasamientoMotor(String desplasamientoMotor) {
        this.desplasamientoMotor = desplasamientoMotor;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "desplasamientoMotor=" + desplasamientoMotor + ", electrica=" + electrica + '}';
    }
    
    
    
}
