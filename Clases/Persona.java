package Clases;

public class Persona {
   public String nombre,sexo;
   public int edad;

   public Persona(String nombre, String sexo, int edad){
    this.nombre = nombre;
    this.sexo = sexo;
    this.edad = edad;
   }

   public void Dato(){
    System.out.println("Hola usuario vamos a verificar tus datos");
   }
}
