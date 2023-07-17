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
    }

    public void obtenerClientes(){
        for (Cliente i : clientesLista) {
            System.out.println(i);
        }
    }

    public void actualizarCliente(int id){
        for (int i = 0; i < clientesLista.size(); i++) {
            if(this.clientesLista.get(i).getId() == id){
                datosCliente(this.clientesLista.get(i));
            }
        }

    }


    public void eliminarCliente(int id){
        if(this.clientesLista.size() >0){
            for (int i = 0; i < this.clientesLista.size(); i++) {
                if(clientesLista.get(i).getId() == id){
                   clientesLista.remove(i);
                }else{
                    System.out.println("No se encontró clientes con ese ID");
                }
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
