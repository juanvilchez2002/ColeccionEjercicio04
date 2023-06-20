package entidad;

public class Pelicula {
    
    //creando los atributos
    private String titulo;
    private String director;
    private Double duracion;
    
    //constructor vacio
    public Pelicula() {
    }

    //contructor con parametros
    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    
    //set y get

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
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
    
    
    
    
    
    
}
