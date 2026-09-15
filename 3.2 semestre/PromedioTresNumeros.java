import java.util.Scanner;

public class PromedioTresNumeros {
    public static void main(String[] args)throws Exception{
        Scanner scanner = new Scanner(System.in);//Creamos el objeto

        System.out.print("Ingresa el primer número: ");//Solicitamos los datos
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextDouble();

        double media = (num1 + num2 + num3) / 3;//Calculamos la media

        System.out.println("La media de los tres números es: " + media);

        scanner.close();
    }
}
