import entidad.Cliente;
import servicio.ClienteServicio;

public class Main {
    public static void main(String[] args) {
        ClienteServicio clienteServicio = new ClienteServicio();

       /* Cliente cliente = new Cliente(1,"Juan Paz",31,1.66,67.33,"Musculacion");
        Cliente cliente2 = new Cliente(2,"Ana Sanchez",31,1.66,67.33,"Musculacion");*/

        Interfaz interfaz = new Interfaz();

        interfaz.menu();

    }
}