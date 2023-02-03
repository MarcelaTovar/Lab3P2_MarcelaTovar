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
            System.out.println("6. Salir");
            int op = leer.nextInt();
            switch (op) {
                case 1 -> {
                    Concesionaria(concesionarias);
                }
                case 2 -> {
                    if (concesionarias.isEmpty()) {
                        System.out.println("Ingrese primero las consecionarias");
                    }else{
                        Cliente(clientes);
                    }
                    
                }
                case 3 -> {
                    if (concesionarias.isEmpty()) {
                        System.out.println("Ingrese primero las consecionarias");
                    }else{
                        vehiculos(vehiculos, concesionarias);
                    }
                }
                case 4 -> {
                    if (concesionarias.isEmpty()) {
                        System.out.println("Ingrese primero las consecionarias");
                    }else{
                        if (vehiculos.isEmpty()) {
                            System.out.println("Ingrese vehiculos primero");
                        }else{
                          VenderComprar(concesionarias,clientes);  
                        }
                         
                    }
                   
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
                            leer.nextLine();
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

    public static ArrayList<Cliente> Cliente(ArrayList<Cliente> clientes) {
        boolean check = true;
        Scanner leer = new Scanner(System.in);
        Cliente c = new Cliente();
        do {
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Eliminar");
            System.out.println("3. Salir");
            int o = leer.nextInt();
            switch (o) {
                case 1 -> {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = leer.next();
                    System.out.println("Ingrese el saldo: ");
                    int saldo = leer.nextInt();
                    c.setNombre(nombre);
                    c.setSaldo(saldo);
                    c.setIdUnico(clientes.size() + 1);
                    clientes.add(c);
                }
                case 2 -> {
                    System.out.println(clientes.toString());
                    System.out.println("Ingrese la pocision a eliminar: ");
                    int p = leer.nextInt();
                    clientes.remove(p);
                }
                case 3 -> {
                    check = false;
                }
            }
        } while (check);
        return clientes;
    }

    public static ArrayList<Vehiculo> vehiculos(ArrayList<Vehiculo> vehiculos, ArrayList<Concesionaria> concesionarias) {
        boolean check = true;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("1. Agregar vehiculo");
            System.out.println("2. Modificar Vehiculo");
            System.out.println("3. Eliminar Vehiculo");
            System.out.println("4. Salir");
            int op = leer.nextInt();
            switch (op) {
                case 1 -> {
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
                        switch (o) {
                            case 1 -> {
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
                                } else {
                                    moto.setElectrica(false);
                                }
                                System.out.println(concesionarias.toString());
                                System.out.println("Ingrese la concesionaria que desea agregarla: ");
                                int p = leer.nextInt();
                                concesionarias.get(p).getVehiculos().add(moto);
                                vehiculos.add(moto);
                            }
                            case 2 -> {
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
                                } else if (tipo == 2) {
                                    bici.setTipo("De Calle");
                                }
                                System.out.println(concesionarias.toString());
                                System.out.println("Ingrese la concesionaria que desea agregarla: ");
                                int p = leer.nextInt();
                                concesionarias.get(p).getVehiculos().add(bici);
                                vehiculos.add(bici);

                            }
                        }
                    } else if (cantidadLlantas == 4) {
                        System.out.println("1. Carro 2. Camion 3. Bus");
                        int o = leer.nextInt();
                        switch (o) {
                            case 1 -> {
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
                            case 2 -> {
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
                                } else if (w == 2) {
                                    cam.setRetroexcavadora(false);
                                }
                                System.out.println(concesionarias.toString());
                                System.out.println("Ingrese la concesionaria que desea agregarla: ");
                                int p = leer.nextInt();
                                concesionarias.get(p).getVehiculos().add(cam);
                                vehiculos.add(cam);

                            }
                            case 3 -> {
                                Bus b = new Bus();
                                b.setColor(color);
                                b.setMarca(marca);
                                b.setAnio(anio);
                                b.setPrecio(precio);
                                b.setCantidadLlantas(cantidadLlantas);
                                System.out.println("Ingrese la cantidad de pasajeros: ");
                                int pas = leer.nextInt();
                                b.setCantidadPasajeros(pas);
                                System.out.println(concesionarias.toString());
                                System.out.println("Ingrese la concesionaria que desea agregarla: ");
                                int p = leer.nextInt();
                                concesionarias.get(p).getVehiculos().add(b);
                                vehiculos.add(b);

                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println(vehiculos.toString());
                    System.out.println("Ingrese la posicion a modificar: ");
                    int p = leer.nextInt();
                    if (vehiculos.get(p) instanceof Carro) {
                        System.out.println("1. Puertas 2. Motor 3. Velocidad");
                        int esc = leer.nextInt();
                        switch (esc) {
                            case 1 -> {
                                System.out.println("Ingrese la cantidad de puertas: ");
                                int cantidadPuertas = leer.nextInt();
                                ((Carro) vehiculos.get(p)).setCantidadPuertas(cantidadPuertas);
                            }
                            case 2 -> {
                                System.out.println("Ingrese la descripcion del motor: ");
                                String descripcionMotor = leer.nextLine();
                                ((Carro) vehiculos.get(p)).setDescripcionMotor(descripcionMotor);
                            }
                            case 3 -> {
                                System.out.println("Ingrese la velocidad maxima: ");
                                int v = leer.nextInt();
                                ((Carro) vehiculos.get(p)).setVelocidadMaxima(v);
                            }
                        }
                    } else if (vehiculos.get(p) instanceof Camion) {
                        System.out.println("1. Volumen 2. Altura 3. Retroexcavadora");
                        int esc = leer.nextInt();
                        switch (esc) {
                            case 1 -> {
                                System.out.println("Ingrese el nuevo volumen maximo: ");
                                int volMax = leer.nextInt();
                                ((Camion) vehiculos.get(p)).setVolumenMaximo(volMax);
                            }
                            case 2 -> {
                                System.out.println("Ingrese la altura: ");
                                double altura = leer.nextDouble();
                                ((Camion) vehiculos.get(p)).setAltural(altura);
                            }
                            case 3 -> {
                                System.out.println("Tiene retroexcavadora? 1 = si 2 = no");
                                int w = leer.nextInt();
                                if (w == 1) {
                                    ((Camion) vehiculos.get(p)).setRetroexcavadora(true);
                                } else if (w == 2) {
                                    ((Camion) vehiculos.get(p)).setRetroexcavadora(false);
                                }
                            }
                        }
                    } else if (vehiculos.get(p) instanceof Bus) {
                        System.out.println("Ingrese la cantidad de pasajeros: ");
                        int pas = leer.nextInt();
                        ((Bus) vehiculos.get(p)).setCantidadPasajeros(pas);
                    } else if (vehiculos.get(p) instanceof Motocicleta) {
                        System.out.println("1. Desplasamiento del motor 2. Electrica ");
                        int esc = leer.nextInt();
                        switch (esc) {
                            case 1 -> {
                                System.out.println("Ingrese el desplasamiento de el motor: ");
                                String d = leer.next();
                                ((Motocicleta) vehiculos.get(p)).setDesplasamientoMotor(d);
                            }
                            case 2 -> {
                                System.out.println("Es electrica? [S/N]");
                                String f = leer.next();
                                if (f.equalsIgnoreCase("S")) {
                                    ((Motocicleta) vehiculos.get(p)).setElectrica(true);
                                } else {
                                    ((Motocicleta) vehiculos.get(p)).setElectrica(true);
                                }
                            }
                        }
                    } else if (vehiculos.get(p) instanceof Bicicleta) {
                        System.out.println("1. Desplasamiento del motor 2. Electrica ");
                        int esc = leer.nextInt();
                        switch (esc) {
                            case 1 -> {
                                System.out.println("Ingrese la descripcion: ");
                                String d = leer.nextLine();
                                ((Bicicleta) vehiculos.get(p)).setDescripcion(d);
                            }
                            case 2 -> {
                                System.out.println("Ingrese el radio de la rueda: ");
                                int radio = leer.nextInt();
                                ((Bicicleta) vehiculos.get(p)).setRadioRueda(radio);
                            }
                            case 3 -> {
                                System.out.println("1. BMW 2. De Calle");
                                int tipo = leer.nextInt();
                                if (tipo == 1) {
                                    ((Bicicleta) vehiculos.get(p)).setTipo("BMW");
                                } else if (tipo == 2) {
                                    ((Bicicleta) vehiculos.get(p)).setTipo("De Calle");
                                }
                            }
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Ingrese la posicion de el vehiculo a eliminar: ");
                    int p = leer.nextInt();
                    vehiculos.remove(p);
                }
                case 4 -> {
                    check = false;
                }
            }
        } while (check);
        return vehiculos;
    }

    public static void VenderComprar(ArrayList<Concesionaria> concesionarias, ArrayList<Cliente> clientes) {
        boolean check = true;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("1. Comprar 2. Vender 3. Salir");
            int op = leer.nextInt();
            switch (op) {
                case 1 -> {
                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes para comprar");
                    } else {
                        System.out.println(concesionarias.toString());
                        System.out.println("Ingrese la concesionaria: ");
                        int p = leer.nextInt();
                        System.out.println(concesionarias.get(p).getVehiculos().toString());
                        System.out.println("Ingrese la posicion de el vehiculo: ");
                        
                        System.out.println(clientes.toString());
                        System.out.println("Ingrese el cliente que va a comprar: ");
                        int c = leer.nextInt();

                        
                        int l = leer.nextInt();
                        if (clientes.get(c).getSaldo() > concesionarias.get(p).getVehiculos().get(l).getPrecio()) {
                            clientes.get(c).getVehiculos().add(concesionarias.get(p).getVehiculos().get(l));
                            concesionarias.get(p).getClientes().add(clientes.get(c));
                            clientes.get(c).setSaldo((concesionarias.get(p).getVehiculos().get(l).getPrecio()-clientes.get(c).getSaldo())*0.075);
                            concesionarias.get(p).setSaldo((int) (((int) (concesionarias.get(p).getSaldo()+clientes.get(c).getSaldo()))*0.075));
                        } else {
                            System.out.println("No tiene suficiente dinero");
                        }
                    }

                }
                case 2 -> {
                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes para vender");
                    } else {
                        System.out.println(concesionarias.toString());
                        System.out.println("Ingrese la concesionaria: ");
                        int p = leer.nextInt();
                        
                        System.out.println(clientes.toString());
                        System.out.println("Ingrese el cliente que va a comprar: ");
                        int c = leer.nextInt();
                        System.out.println(clientes.get(c).getVehiculos().toString());
                        System.out.println("Ingrese la posicion de el vehiculo: ");
                        int l = leer.nextInt();
                        
                        if (concesionarias.get(p).getSaldo() > clientes.get(c).getVehiculos().get(l).getPrecio()) {
                            concesionarias.get(p).getVehiculos().add(clientes.get(c).getVehiculos().get(l));
                            concesionarias.get(p).setSaldo((int) (concesionarias.get(p).getSaldo()-clientes.get(c).getVehiculos().get(l).getPrecio()));
                            clientes.get(c).setSaldo(clientes.get(c).getSaldo()+concesionarias.get(p).getVehiculos().get(l).getPrecio());
                        } else {
                            System.out.println("No hay suficiente dinero");
                        }
                    }

                }
                case 3 ->{
                    check = false;
                }

            }

        } while (check);

    }
}
