public class Termometro {

    private double temperatura;

    public Termometro() {
        temperatura = 25.0;
    }

    public void subir(double grados) {
        temperatura = temperatura + grados;
        System.out.println("La temperatura subió " + grados + " grados.");
    }

    public void bajar(double grados) {
        temperatura = temperatura - grados;
        System.out.println("La temperatura bajó " + grados + " grados.");
    }

    public double mostrarTemperatura() {
        return temperatura;
    }

    public static void main(String[] args) {

        Termometro t = new Termometro();

        t.subir(5.0);
        t.bajar(2.0);

        System.out.println("Temperatura actual: " + t.mostrarTemperatura() + " °C");
    }
}