package lab3p2_marcelatovar;

import java.util.*;

public class Lab3P2_MarcelaTovar {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        ArrayList<Concesionaria> concesionarias = new ArrayList<Concesionaria>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        Scanner leer = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("1. CRUD Concesionaria");
            System.out.println("2. CRUD Clientes");
            System.out.println("3. CRUD Vehiculos ");
            System.out.println("4. Compra/Venta");
            System.out.println("5. Salir");
            int op = leer.nextInt();
            switch (op) {
                case 1 -> {
                    Concesionaria(concesionarias);
                }
                case 2 -> {

                }
                case 4 -> {

                }
                case 5 -> {
                    check = false;
                }
            }
        } while (check);
    }

    public static ArrayList<Concesionaria> Concesionaria(ArrayList<Concesionaria> concesionarias) {
        boolean check = true;
        Scanner leer = new Scanner(System.in);
        Concesionaria c = new Concesionaria();
        do {
            System.out.println("1. Agregar");
            System.out.println("2. Modificar");
            System.out.println("3. Eliminar");
            System.out.println("4. Salir");
            int op = leer.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Ingrese el nombre de la empresa: ");
                    String nombre = leer.next();
                    System.out.println("Ingrese la direccion: ");
                    leer.nextLine();
                    String direccion = leer.nextLine();
                    System.out.println("Ingrese saldo: ");
                    int saldo = leer.nextInt();
                    c.setNombreEmpresa(nombre);
                    c.setDireccion(direccion);
                    c.setSaldo(saldo);
                    c.setIdEmpresa(concesionarias.size() + 1);
                    concesionarias.add(c);
                }
                case 2 -> {
                    System.out.println("\n1. Direccion");
                    int o = leer.nextInt();
                    switch (o) {
                        case 1 -> {
                            System.out.println("Ingrese la direccion: ");
                            String direccion = leer.nextLine();
                            c.setDireccion(direccion);
                            
                        }

                    }

                }
                case 3 -> {
                    System.out.println(concesionarias.toString());
                    System.out.println("Ingrese la posicion a eliminar: ");
                    int p = leer.nextInt();
                    concesionarias.remove(p);
                }
                case 4 -> {
                    check = false;
                }
            }
        } while (check);
        return concesionarias;

    }

}
