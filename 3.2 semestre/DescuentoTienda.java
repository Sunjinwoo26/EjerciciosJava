import java.util.Scanner;

public class DescuentoTienda{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Creamos el objeto

        System.out.print("Ingresa el monto total de la compra: $");//Pedir el monto total de la compra al usuario
        double totalCompra = scanner.nextDouble();

        double descuento = totalCompra * 0.15; // Calcular el valor del descuento (15%)

        double precioFinal = totalCompra - descuento; //Calcular el precio final a pagar

        System.out.println("Total original: $" + totalCompra);//Mostrar
        System.out.println("Descuento (15%): $" + descuento);
        System.out.println("Monto final a pagar: $" + precioFinal);
        scanner.close();
    }
}

