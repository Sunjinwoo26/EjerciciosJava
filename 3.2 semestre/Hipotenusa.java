import java.util.Scanner;

public class Hipotenusa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Creamos el objeto

        System.out.print("Ingresa el cateto a: ");//SSolicitamos los datos
        double a = scanner.nextDouble();

        System.out.print("Ingresa el cateto b: ");
        double b = scanner.nextDouble();
        
        double hipotenusa = Math.sqrt((a * a) + (b * b));// Forma mas directa

        System.out.println("La hipotenusa es: " + hipotenusa);
        scanner.close();
    }
}
