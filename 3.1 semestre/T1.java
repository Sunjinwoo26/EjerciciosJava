import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                encontrado = true;
            }
        }

        if (encontrado)
            System.out.println("Número encontrado");
        else
            System.out.println("Número no encontrado");
    }
}