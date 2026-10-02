package Recursividad;

public class Potencia {

    public static int potencia(int base, int exponente) {
        // Cualquier número elevado a la potencia 0 es igual a 1.
        if (exponente == 0) {
            return 1;
        }
        // Multiplicamos la base por el resultado de elevar la base al (exponente - 1).
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        int b = 2;
        int exp = 3;
        System.out.println( b + " elevado a " + exp + " es: " + potencia(b, exp));
    }
}
