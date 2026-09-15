import java.util.Scanner;

public class Rectangulo{
    public static void main(String[] args)throws Exception{
        
        Scanner scanner = new Scanner(System.in);//Creamos un objeto

        System.out.print("Ingresa la base: ");//Solitamos la base y altura
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura: ");
        double altura = scanner.nextDouble();

        double perimetro = 2 * (base + altura);//Sacamos el perimetro y area
        double area = base * altura;

        System.out.println("El perímetro del rectángulo es: " + perimetro);//Mostramos los resultados
        System.out.println("El área del rectángulo es: " + area);

        // Cerrar el scanner
        scanner.close();
    }
}