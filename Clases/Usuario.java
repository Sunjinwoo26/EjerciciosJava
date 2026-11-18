package Clases;

public class Usuario extends Persona {
    public String nombre,sexo;
    public int edad; 
    
    public Usuario(String nombre,int edad, String sexo){

        super(nombre, sexo, edad);
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public void mostrar(){
        System.out.println("Tu nombre es : " + nombre );
        System.out.println("Tu edad es : " + edad);
        System.out.println("Tu genero es : " + sexo);
    } 
}
