package entidad;

import java.time.LocalTime;
import java.util.Comparator;

public class Pelicula {
    
    //creando los atributos
    private String titulo;
    private String director;
    private Double duracion;
    private LocalTime dura;
    
    //constructor vacio
    public Pelicula() {
    }

    //contructor con parametros
    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula(String titulo, String director, Double duracion, LocalTime dura) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.dura = dura;
    }
    
    
    //set y get
    public LocalTime getDura() {
        return dura;
    }

    public void setDura(LocalTime dura) {
        this.dura = dura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", dura=" + dura + '}';
    }    
    
    private static Comparator<Pelicula> ordenarPeliculaDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPeliculaHoraDesc = new Comparator<>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDura().compareTo(o2.getDura());
        }
    };
    
    
    
}
