
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
            System.out.println("");
        }while(flag);
        
        listarPeliculas();
        listarPeliculaHoraDuracion();
    }
    
    private void listarPeliculas(){
        System.out.println("--- Listado de Peliculas ---");
        System.out.println("");
        for(Pelicula pel:peliculas){
            System.out.println(pel);
        }  
    }
    
    private void listarPeliculaHora(){
        System.out.println("--- Listado de Peliculas: 01 Hora ---");System.out.println("");
        for(Pelicula pel:peliculas){
            if(pel.getDuracion()>60){
                System.out.println(pel);
            }
        }  
    }
    
    private void listarPeliculaHoraDuracion(){
        LocalTime duraHora=LocalTime.of(1,0);
        System.out.println("--- Listado de Peliculas: 01 Hora ---");System.out.println("");
        for(Pelicula pel:peliculas){
            if(pel.getDura().isAfter(duraHora)){
                System.out.println(pel);
            }
        }  
    }
    
}
