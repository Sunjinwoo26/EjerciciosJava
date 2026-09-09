public class Ej2 {
    public static void main(String[] args)throws Exception{
        double[] numero ={1,2,3,4,5,6,7,8,9,10};
        double suma = 0;
        double promedio =0;
        for (int i = 0; i <numero.length; i++) {
        suma += numero[i];
  
        } promedio = suma /numero.length;
        System.out.println("la suma total es: "+ suma);
        System.out.println("el promedio es: "+ promedio);
       
    }
}
/*crear un arreglo de 10 elementos, el programa debe recorrer
el areglo y calcular la suma de todos los numeros contenidos
en el areglo.
Debe mostrar la cantidad total
asi como el promedio */