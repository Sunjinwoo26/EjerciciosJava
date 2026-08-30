import java.util.Scanner;
public class Iva {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);;//system es la informacion de la construccion
        final double iva=0.21;
        System.out.print("Dame el dato del precio");
        double numero = Double.parseDouble(scanner.nextLine());
        double numeroFinal = numero + (numero*iva);
        System.out.println("El precio final es "+ numeroFinal);
        scanner.close();
    }
}
