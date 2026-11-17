public class Semaforo {
    public String color;

    public Semaforo(){
        color = "Rojo";
    }
    public void cambiarRojo(){
        color = "Rojo";
    }
    public void cambiarAmarillo(){
        color = "Amarrillo";
    }
    public void cambiarVerde(){
        color = "Verde";
    }
    public String mostrarColor(){
        return color;
    }
    public static void main(String[] args)throws Exception{
        Semaforo sema = new Semaforo();
        System.out.println("Color actual: " + sema.mostrarColor());

        sema.cambiarAmarillo();
        System.out.println("Color actual: " + sema.mostrarColor());

        sema.cambiarVerde();
        System.out.println("Color actual: " +  sema.mostrarColor());

    }

}
