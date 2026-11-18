package Libreria;
public class Libro {

    public String titulo, autor;
    public int año;

     public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }
    public void datos() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + año);
    }
    
}
