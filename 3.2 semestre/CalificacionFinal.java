import java.util.Scanner;

public class CalificacionFinal {
    public static void main(String[] args)throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la calificación del Parcial 1: ");//Solicitamos la calificacionde los 3 parciales
        double parcial1 = scanner.nextDouble();
        System.out.print("Ingresa la calificación del Parcial 2: ");
        double parcial2 = scanner.nextDouble();
        System.out.print("Ingresa la calificación del Parcial 3: ");
        double parcial3 = scanner.nextDouble();

        System.out.print("Ingresa la calificación del Examen Final: ");//Solicitamos la calificacion de examen y trabajo final
        double examenF= scanner.nextDouble();
        System.out.print("Ingresa la calificación del Trabajo Final: ");
        double trabajoF = scanner.nextDouble();

        double promParciales = (parcial1 + parcial2 + parcial3) / 3;//Calculamos los 3 parciales

        double calificacionFinal = (promParciales * 0.55) + (examenF * 0.30) + (trabajoF * 0.15);

        System.out.println("Calificación Final: " + calificacionFinal);//RESULTADO

        scanner.close();
    }
}
