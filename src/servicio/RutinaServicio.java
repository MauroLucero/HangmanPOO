package servicio;

import entidad.Rutina;

import java.util.ArrayList;
import java.util.Scanner;

public class RutinaServicio{
    ArrayList<Rutina> listaRutinas = new ArrayList<>();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int id =1;


    private void datosRutina(Rutina rutina){
        System.out.println("Ingrese el nombre de la rutina");
        rutina.setNombre(leer.next());
        System.out.println("Ingrese la duracion en minutos");
        rutina.setDuracion(leer.nextInt());
        System.out.println("Ingrese el nivel de dificultad");
        rutina.setNivelDificultad(leer.next());
        System.out.println("Ingrese una descripcion");
        rutina.setDescripcion(leer.next());
    }

    public void crearRutina(){
        Rutina rutina = new Rutina();
        rutina.setId(id);
        id+=1;
        datosRutina(rutina);
        listaRutinas.add(rutina);
    }


    public void obtenerRutinas(){
        for (Rutina i : listaRutinas) {
            System.out.println(i);
        }
    }

    public void actualizarRutina(Rutina rutina){
        int indice = listaRutinas.indexOf(rutina);
        Rutina auxiliar = new Rutina();
        auxiliar.setId(rutina.getId());
        datosRutina(auxiliar);
        listaRutinas.set(indice,auxiliar);
    }

    public void eliminarRutina(Rutina rutina){
        int indice = listaRutinas.indexOf(rutina);
        listaRutinas.remove(indice);
    }

    public ArrayList<Rutina> getListaRutinas() {
        return listaRutinas;
    }

    public void setListaRutinas(ArrayList<Rutina> listaRutinas) {
        this.listaRutinas = listaRutinas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
