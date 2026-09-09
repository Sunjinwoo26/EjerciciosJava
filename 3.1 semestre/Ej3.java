public class Ej3 {
    /*Crear un arreglo de 8 numeros y determinar cual es el numero mayorº */
    public static void main(String[] args)throws Exception{
        
        int[] numeros = {1,2,3,4,5,10};

        int mayor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }  System.out.println("El número mayor es: " + mayor);
    }
}
