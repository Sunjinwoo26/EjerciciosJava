import java.util.Scanner;
public class Calculadora {
//se requiere hacer una calculadora con java y utilizando POO
/*Cada operaciones debe tener su propio metodo, ejemplo sumar
Debe existir un metodo que nos ayude a la ejecucion del codigo
el main de estar limpio solo instancia y metodo de ejecucion */
public double a=0;
public double b=0;
public int opcion=0;


public double sumar (double a, double b){
    return a+b;
}
public double resta(double a, double b){
    return a-b;
}
public double multiplicacion (double a, double b){
    return a*b;
}
public double division(double a, double b){
    return a/b;

}
public void obtenerInformacion(){
     Scanner sc = new Scanner(System.in);
    System.out.println("Que quieres hacer hoy");
    System.out.println("1- suma, 2- restar, 3- multiplicar, 4- division");
    this.opcion = sc.nextInt();
    System.out.println("Dame el dato a");
    this.a =sc.nextDouble();
    System.out.println("Dame el valor b");
    this.b= sc.nextDouble();
    }

public void ejecutar(){
    this.obtenerInformacion();
    switch (this.opcion){
        case 1:
            System.out.println("La suma es:" + this.sumar(this.a, this.b));
            break;
        case 2:
            System.out.println("La resta es:" + this.resta(this.a, this.b));
            break;
        case 3:
            System.out.println("La multiplicacion es:" + this.multiplicacion(this.a, this.b));
            break;    
        case 4:
            System.out.println("La divsion es:" + this.division(this.a, this.b));
            break;        
    
        default:
            System.out.println("Esta opcion no esta disponible");
            break;
    }
    
}
        


    public static void main(String[] args)throws Exception {
        Calculadora app = new Calculadora();
        app.ejecutar();
        
    }
    
}