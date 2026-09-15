import java.util.Scanner;

public class ConversionMinuto{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Creamos el objeto

        System.out.print("Ingresa la cantidad total de minutos: ");//Pedimos la cantidad total de minutos
        int totalMinutos = scanner.nextInt();

        int horas = totalMinutos / 60;//Calculamos las horas y los minutos restantes
        int minutosRestantes = totalMinutos % 60;
        //Mostramos
        System.out.println(totalMinutos + " minutos equivalentes a " + horas + " horas y " + minutosRestantes + " minutos");
        scanner.close();
    }
}
