
package servicio;

import entidad.Pelicula;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {
    
    //creando el arraylist de Pelicula y Scanner
    ArrayList<Pelicula> peliculas;
    Scanner consola;
    
    public PeliculaService(){
        this.peliculas = new ArrayList();
        this.consola = new Scanner(System.in);
    }
    
    public void crearPelicula(){
        
        System.out.println("--- Adicionando Peliculas ---");
        System.out.println("");
        
        String titulo, director;
        Double duracion;
        //LocalTime dura=LocalTime.parse("15:10", DateTimeFormatter.ofPattern("HH:mm"));
        String op ="";
        
        boolean flag = true;
        
        do{
            System.out.print("Ingrese Titulo: ");
            titulo = consola.nextLine();
            System.out.print("Ingrese Director: ");
            director = consola.nextLine();          
            System.out.print("Ingrese Duración (minutos): ");
            duracion = consola.nextDouble();
            consola.nextLine();
            System.out.print("Duración en Horas y Minutos (HH:mm): ");
            LocalTime dura = LocalTime.parse(consola.nextLine());
            peliculas.add(new Pelicula(titulo, director, duracion, dura));
            
            
            
            System.out.println("");
            System.out.print("¿Desea ingresar más Peliculas? (S/N) ");
            op = consola.next().toLowerCase();
            
            if(op.equals("n")) flag=false;
            consola.nextLine();
        }while(flag);
        listarPeliculas();
    }
    
    private void listarPeliculas(){
        for(Pelicula pel:peliculas){
            System.out.println(pel.toString());
        }
        
        System.out.println("");
        System.out.println("Ordenado");
        peliculas.sort(Pelicula.ordenarPeliculaHoraDesc);
        for(Pelicula pel:peliculas){
            System.out.println(pel.toString());
        }
    }
    
}
