import java.util.Scanner;

public class ValidadorNumero {

    private int numero;

    public ValidadorNumero(int numero) {
        this.numero = numero;
    }

    public void validar() {
        if (numero >= 0) {
            System.out.println("El número " + numero + " es entero positivo.");
        } else {
            System.out.println("El número " + numero + " es entero negativo.");
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int num = teclado.nextInt();

        ValidadorNumero obj = new ValidadorNumero(num);

        obj.validar();

        teclado.close();
    }
}
