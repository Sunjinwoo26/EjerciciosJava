package Recursividad;

public class Fibonacci{

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // El término en la posición 0 es 0
        }
        if (n == 1) {
            return 1; // El término en la posición 1 es 1
        }
        // Para cualquier n mayor a 1, sumamos las dos posiciones
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int posicion = 4;
        int resultado = fibonacci(posicion);
        System.out.println("El número en la posición " + posicion + " es: " + resultado);
    }
}