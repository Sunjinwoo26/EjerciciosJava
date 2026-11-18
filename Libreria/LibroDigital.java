package Libreria;

public class LibroDigital extends Libro {

    public  String formato;

    public LibroDigital(String titulo, String autor, int año,String formato) {

        super(titulo, autor, año);
        this.formato = formato;

    }
    public void digital() {

        System.out.println("Formato: " + formato);
    }

}
