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
        System.out.println("Rutina registrada con exito");
    }


    public void obtenerRutinas(){
        if(listaRutinas.size()!=0){
            for (Rutina i : listaRutinas) {
                System.out.println(i);
            }
        }else{
            System.out.println("No se registran rutinas.");
        }
    }

    public void actualizarRutina(int id){
        boolean noEncontrado = true;
        for (int i = 0; i < listaRutinas.size(); i++) {
            if(listaRutinas.get(i).getId() == id){
                datosRutina(listaRutinas.get(i));
                System.out.println("Rutina actualizada.");
                noEncontrado = false;
                break;
            }
        }
        if (noEncontrado) {
            System.out.println("No se encontró una rutina con el ID: "+id);
        }
    }

    public void eliminarRutina(int id){
        if(listaRutinas.size() >0){
            boolean noEncontrado = true;
            for (int i = 0; i < listaRutinas.size(); i++) {
                if(listaRutinas.get(i).getId() == id){
                    listaRutinas.remove(i);
                    System.out.println("Rutina eliminada con exito.");
                    noEncontrado = false;
                    break;
                }
            }
            if (noEncontrado) {
                System.out.println("No se encontró una rutina con el ID: "+id);
            }
        }else{
            System.out.println("No se registran rutinas");
        }
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
