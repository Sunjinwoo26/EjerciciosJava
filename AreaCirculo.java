import java.util.Scanner;

class Circulo {
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Circulo c = new Circulo();

        System.out.print("Ingrese el radio del círculo: ");
        c.setRadio(leer.nextDouble());

        System.out.println("Radio: " + c.getRadio());
        System.out.println("Área del círculo: " + c.calcularArea());

        leer.close();
    }
}