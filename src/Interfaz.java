import entidad.Rutina;
import servicio.ClienteServicio;
import servicio.RutinaServicio;

import java.util.Scanner;

public class Interfaz {
    ClienteServicio clienteServicio = new ClienteServicio();
    RutinaServicio rutinaServicio = new RutinaServicio();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");



    public void menu(){
        boolean flag = true;
        int opcion;
        System.out.println("Bienvenido!");
        while(flag){
            int id;
            int longitudClientes = clienteServicio.getClientesLista().size();
            int longitudRutinas = rutinaServicio.getListaRutinas().size();


            System.out.println("-----------------------");
            System.out.println("Elija una opción: ");
            System.out.println("1-Crear Cliente");
            System.out.println("2-Actualizar Cliente");
            System.out.println("3-Borrar Cliente");
            System.out.println("4-Ver Clientes");
            System.out.println("5-Crear Rutina");
            System.out.println("6-Actualizar Rutina");
            System.out.println("7-Borrar Rutina");
            System.out.println("8-Ver Rutinas");
            System.out.println("9-Salir");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    clienteServicio.registrarCliente();
                    break;

                case 2:

                    System.out.println("Ingrese el ID del cliente a actualizar:");
                    id = leer.nextInt();
                    clienteServicio.actualizarCliente(id);
                    break;

                case 3:

                    System.out.println("Ingrese el ID del cliente a eliminar:");
                    id = leer.nextInt();
                    clienteServicio.eliminarCliente(id);
                    break;

                case 4:
                    clienteServicio.obtenerClientes();
                    break;

                case 5:
                    rutinaServicio.crearRutina();
                    break;

                case 6:

                    System.out.println("Que rutina quiere actualizar?");
                    id = leer.nextInt();
                    rutinaServicio.actualizarRutina(id);
                    break;

                case 7:

                    System.out.println("Que rutina quiere eliminar?");
                    id = leer.nextInt();
                    rutinaServicio.eliminarRutina(id);
                    break;

                case 8:
                    rutinaServicio.obtenerRutinas();
                    break;

                case 9:
                    flag = false;
                    System.out.println("Chau");
                    break;
            }
        }
    }


    public Interfaz() {
    }
}
