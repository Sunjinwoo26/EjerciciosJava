public class T2 {
    public static void main(String[] args) {

        int[] numeros = {2, 5, 8, 7, 10};
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nPares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
