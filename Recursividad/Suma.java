package Recursividad;

public class Suma {
    public static int sumarN(int n){
        //Cuando n llega a 1 o menos.
        // como conoces la resp directa no es necesario volver a llamar el metodo.
        if (n <= 1){
            return n;  
        }//Si n es mayor a 1, el método se llama a sí mismo pasando (n - 1).
            return n + sumarN(n - 1);
    }
    public static void main(String[] args) {
        int n = 5 ;
        int resultado = sumarN(n);
        System.out.println("La suma de 1 a "+ n + " es: " + resultado);
    }
}
