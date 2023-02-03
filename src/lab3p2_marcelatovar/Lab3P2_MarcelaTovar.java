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
                    Cliente(clientes);
                }
                case 3 -> {
                    vehiculos(vehiculos,concesionarias);
                }
                case 4 -> {
                    
                }
                case 5 ->{
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
    
    public static ArrayList<Cliente> Cliente(ArrayList<Cliente> clientes){
        boolean check = true;
        Scanner leer = new Scanner(System.in);
        Cliente c = new Cliente();
        do{
            System.out.println("1. Agregar Cliente"); 
            System.out.println("2. Eliminar");
            System.out.println("3. Salir");
            int o = leer.nextInt();
            switch(o){
                case 1 ->{
                    System.out.println("Ingrese el nombre: ");
                    String nombre = leer.next();
                    System.out.println("Ingrese el saldo: ");
                    int saldo = leer.nextInt();
                    c.setNombre(nombre);
                    c.setSaldo(saldo);
                    c.setIdUnico(clientes.size()+1);
                    clientes.add(c);
                }
                case 2 ->{
                    System.out.println(clientes.toString());
                    System.out.println("Ingrese la pocision a eliminar: ");
                    int p = leer.nextInt();
                    clientes.remove(p);
                }
                case 3 ->{
                    check = false;
                }
            }
        }while(check);
        return clientes;
    }
    
    public static ArrayList<Vehiculo> vehiculos (ArrayList<Vehiculo> vehiculos, ArrayList<Concesionaria> concesionarias){
        boolean check = true;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("1. Agregar vehiculo");
            System.out.println("2. Modificar Vehiculo");
            System.out.println("3. Eliminar Vehiculo");
            System.out.println("4. Salir");
            int op = leer.nextInt();
            switch(op){
                case 1 ->{
                    System.out.println("Ingrese el color: ");
                    String color = leer.next();
                    System.out.println("Ingrese la marca: ");
                    String marca = leer.next();
                    System.out.println("Ingrese el anio: ");
                    int anio = leer.nextInt();
                    System.out.println("Ingrese el precio: ");
                    double precio = leer.nextDouble();
                    System.out.println("Ingrese la cantidad de llantas: ");
                    int cantidadLlantas = leer.nextInt();
                    if (cantidadLlantas == 2) {
                        System.out.println("1. Motocicleta 2. Bicicleta");
                        int o = leer.nextInt();
                        switch(o){
                            case 1 ->{
                                Motocicleta moto = new Motocicleta();
                                moto.setColor(color);
                                moto.setMarca(marca);
                                moto.setAnio(anio);
                                moto.setPrecio(precio);
                                moto.setCantidadLlantas(cantidadLlantas);
                                System.out.println("Ingrese el desplasamiento de el motor: ");
                                String d = leer.next();
                                moto.setDesplasamientoMotor(color);
                                System.out.println("Es electrica? [S/N]");
                                String f = leer.next();
                                if (f.equalsIgnoreCase("S")) {
                                    moto.setElectrica(true);
                                }else{
                                    moto.setElectrica(false);
                                }
                                System.out.println(concesionarias.toString());
                                System.out.println("Ingrese la concesionaria que desea agregarla: ");
                                int p = leer.nextInt();
                                concesionarias.get(p).getVehiculos().add(moto);
                                vehiculos.add(moto);
                            }
                            case 2 ->{
                                Bicicleta bici = new Bicicleta();
                                bici.setColor(color);
                                bici.setMarca(marca);
                                bici.setAnio(anio);
                                bici.setPrecio(precio);
                                bici.setCantidadLlantas(cantidadLlantas);
                                System.out.println("Ingrese la descripcion: ");
                                String d = leer.nextLine();
                                bici.setDescripcion(d);
                                System.out.println("Ingrese el radio de la rueda: ");
                                int radio = leer.nextInt();
                                bici.setRadioRueda(radio);
                                System.out.println("1. BMW 2. De Calle");
                                int tipo = leer.nextInt();
                                if (tipo == 1) {
                                    bici.setTipo("BMW");
                                }else if(tipo == 2){
                                    bici.setTipo("De Calle");
                                }
                                System.out.println(concesionarias.toString());
                                System.out.println("Ingrese la concesionaria que desea agregarla: ");
                                int p = leer.nextInt();
                                concesionarias.get(p).getVehiculos().add(bici);
                                vehiculos.add(bici);

                            }
                        }
                    }else if(cantidadLlantas == 4){
                        System.out.println("1. Carro 2. Camion 3. Bus");
                        int o = leer.nextInt();
                        switch(o){
                            case 1 ->{
                                Carro car = new Carro();
                                car.setColor(color);
                                car.setMarca(marca);
                                car.setAnio(anio);
                                car.setPrecio(precio);
                                car.setCantidadLlantas(cantidadLlantas);
                                System.out.println("Ingrese la cantidad de puertas: ");
                                int cantidadPuertas = leer.nextInt();
                                car.setCantidadPuertas(cantidadPuertas);
                                System.out.println("Ingrese la descripcion del motor: ");
                                String descripcionMotor = leer.nextLine();
                                car.setDescripcionMotor(descripcionMotor);
                                System.out.println("Ingrese la velocidad maxima: ");
                                int v = leer.nextInt();
                                car.setVelocidadMaxima(v);
                                System.out.println(concesionarias.toString());
                                System.out.println("Ingrese la concesionaria que desea agregarla: ");
                                int p = leer.nextInt();
                                concesionarias.get(p).getVehiculos().add(car);
                                vehiculos.add(car);
                                
                            }
                            case 2 ->{
                                Camion cam = new Camion();
                                cam.setColor(color);
                                cam.setMarca(marca);
                                cam.setAnio(anio);
                                cam.setPrecio(precio);
                                cam.setCantidadLlantas(cantidadLlantas);
                                System.out.println("Ingrese el nuevo volumen maximo: ");
                                int volMax = leer.nextInt();
                                cam.setVolumenMaximo(volMax);
                                System.out.println("Ingrese la altura: ");
                                double altura = leer.nextDouble();
                                cam.setAltural(altura);
                                System.out.println("Tiene retroexcavadora? 1 = si 2 = no");
                                int w = leer.nextInt();
                                if (w == 1) {
                                    cam.setRetroexcavadora(true);
                                }else if(w == 2){
                                    cam.setRetroexcavadora(false);
                                }
                                System.out.println(concesionarias.toString());
                                System.out.println("Ingrese la concesionaria que desea agregarla: ");
                                int p = leer.nextInt();
                                concesionarias.get(p).getVehiculos().add(cam);
                                vehiculos.add(cam);
                                
                            }
                            case 3 ->{
                                Bus b = new Bus();
                                System.out.println("Ingrese la cantidad de pasajeros: ");
                                int pas = leer.nextInt();
                                
                            }
                        }
                    }
                }
                case 2 ->{
                    
                }
                case 3 ->{
                    
                }
                case 4 ->{
                    
            }
            }
        }while(check);
        return vehiculos;
    }

}
