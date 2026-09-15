import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Creamos el objeto

        System.out.print("¿Cómo te llamas? ");//Solicitamos el dato
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre + " Mucho gusto");//Mostrar
        scanner.close();
    }
}
