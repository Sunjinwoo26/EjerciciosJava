import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);//Creame un objeto

        System.out.print("Ingresa los grados Fahrenheit: ");//Pedimos la temperatura en Fahrenheit al usuario
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;//La fórmula de conversión

        System.out.println(fahrenheit + " °F equivalen a " + celsius + "°C");//Resultado

        scanner.close();
    }
}
