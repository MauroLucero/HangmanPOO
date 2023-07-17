package servicio;

import entidad.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteServicio {

    private ArrayList<Cliente> clientesLista = new ArrayList<>();
    private int id = 1;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    private void datosCliente(Cliente cliente){
        System.out.println("Ingrese el nombre y apellido");
        cliente.setNombre(leer.next());

        System.out.println("Ingrese edad");
        cliente.setEdad(leer.nextInt());

        System.out.println("Ingrese la altura");
        cliente.setAltura(leer.nextDouble());

        System.out.println("Ingrese el peso");
        cliente.setPeso(leer.nextDouble());

        System.out.println("Ingrese el objetivo");
        cliente.setObjetivo(leer.next());

    }
    public void registrarCliente(){
        Cliente cliente = new Cliente();
        cliente.setId(this.id);
        id += 1;

        datosCliente(cliente);
        clientesLista.add(cliente);
        System.out.println("Cliente registrado");
    }

    public void obtenerClientes(){
        if(clientesLista.size()!=0){
            for (Cliente i : clientesLista) {
                System.out.println(i);
            }
        }else{
            System.out.println("No hay clientes registrados.");
        }
    }

    public void actualizarCliente(int id){
        boolean noEncontrado = true;
        for (int i = 0; i < clientesLista.size(); i++) {
            if(this.clientesLista.get(i).getId() == id) {
                datosCliente(this.clientesLista.get(i));
                System.out.println("Cliente actualizado");
                noEncontrado = false;
                break;
            }
        }
        if (noEncontrado){
            System.out.println("No se encontró el cliente con ID: "+id);
        }
    }


    public void eliminarCliente(int id){
        if(this.clientesLista.size() >0){
            boolean noEncontrado = true;
            for (int i = 0; i < this.clientesLista.size(); i++) {
                if(clientesLista.get(i).getId() == id){
                   clientesLista.remove(i);
                    System.out.println("Cliente eliminado con exito.");
                    noEncontrado = false;
                   break;
                }
            }
            if (noEncontrado){
                System.out.println("No se encontró el cliente con ID: "+id);
            }
        }else{
            System.out.println("No se registran clientes");
        }
    }

    public ArrayList<Cliente> getClientesLista() {
        return clientesLista;
    }

    public void setClientesLista(ArrayList<Cliente> clientesLista) {
        this.clientesLista = clientesLista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
