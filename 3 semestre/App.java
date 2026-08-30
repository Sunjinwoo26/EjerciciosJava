import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero:");

        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Si es divisible entre 2");
        } else {
            System.out.println("No es divisible entre 2");
        }
    }
}