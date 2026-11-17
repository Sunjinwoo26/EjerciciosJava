public class Reproductor {

    private String cancion;
    private boolean reproduciendo;

    public Reproductor() {
        cancion = "";
        reproduciendo = false;
    }

    public void reproducir(String cancion) {
        this.cancion = cancion;
        reproduciendo = true;
    }

    public void pausar() {
        reproduciendo = false;
    }

    public String estado() {
        if (reproduciendo) {
            return "Reproduciendo: " + cancion;
        } else {
            return "Pausado";
        }
    }
    public static void main(String[] args) {

        Reproductor rep = new Reproductor();

        rep.reproducir("El clavo - con maluma");
        System.out.println(rep.estado());

        rep.pausar();
        System.out.println(rep.estado());
    }
}

