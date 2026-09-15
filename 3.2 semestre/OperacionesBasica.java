
import java.util.Scanner;

public class OperacionesBasica{
    public static void main(String[] args)throws Exception{
        Scanner scanner = new Scanner(System.in);//Creamos el Objeto

        System.out.print("Ingresa el primer número: ");//Solicitamos los datos
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;//Realizamos las operaciones
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division= num1/num2;

        System.out.println("Suma: " + suma);//Mostrar Resultados
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("Diivision: " + division);
        scanner.close();
    }
}