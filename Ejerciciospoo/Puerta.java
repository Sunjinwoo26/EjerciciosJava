public class Puerta {

    private boolean abierta;

    public Puerta() {
        abierta = false;
    }

    public void abrir() {
        abierta = true;
        System.out.println("La puerta se abrió.");
    }

    public void cerrar() {
        abierta = false;
        System.out.println("La puerta se cerró.");
    }

    public String estado() {
        if (abierta) {
            return "Abierta";
        } else {
            return "Cerrada";
        }
    }

    public static void main(String[] args) {

        Puerta puerta = new Puerta();

        System.out.println("Estado inicial: " + puerta.estado());

        puerta.abrir();
        System.out.println("Estado actual: " + puerta.estado());

        puerta.cerrar();
        System.out.println("Estado actual: " + puerta.estado());
    }
}