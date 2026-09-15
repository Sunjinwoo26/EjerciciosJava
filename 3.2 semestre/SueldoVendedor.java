import java.util.Scanner;

public class SueldoVendedor {
    public static void main(String[] args)throws Exception{
        Scanner scanner = new Scanner(System.in);//Creamos el objeto

        System.out.print("Ingresa el sueldo base del vendedor: ");//Solicitamos el sueldo base
        double sueldoBase = scanner.nextDouble();

        System.out.print("Ingresa el monto de la venta 1: ");//Pedir el monto de las tres ventas
        double venta1 = scanner.nextDouble();
        System.out.print("Ingresa el monto de la venta 2: ");
        double venta2 = scanner.nextDouble();
        System.out.print("Ingresa el monto de la venta 3: ");
        double venta3 = scanner.nextDouble();

        double totalVentas = venta1 + venta2 + venta3;//Calcular el total de ventas

        double comisiones = totalVentas * 0.10; // Calculamos la comisión del 10% (multiplicar por 0.10)

        double sueldoTotal = sueldoBase + comisiones;//Calculamos el sueldo total

        System.out.println("Dinero por comisiones (10%): $" + comisiones);//Motramos los resultados
        System.out.println("Sueldo total a recibir: $" + sueldoTotal);
        scanner.close();
    }
}