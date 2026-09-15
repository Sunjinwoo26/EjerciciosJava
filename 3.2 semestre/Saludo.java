import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer entradas de la consola
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre al usuario
        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();

        // Mostrar el saludo
        System.out.println("Hola, " + nombre + " Mucho gusto");

        // Cerrar el scanner
        scanner.close();
    }
}
