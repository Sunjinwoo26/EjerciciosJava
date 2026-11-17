public class Lampara {

   private boolean encendida;
   
   public Lampara(){
       encendida = false;
   }
   public void encender(){
       encendida = true;
   }
   public void apagado(){
       encendida = false;
   }
   public String estado(){
     return  encendida ? "Encendiada": "Apagada";
   }
   public static void main(String[] args) throws Exception{
     Lampara lam = new Lampara();
     System.out.println("Estado inicial: " +  lam.estado());

     lam.encender();
     System.out.println("Despues encender: " + lam.estado());

     lam.apagado();
     System.out.println("Despues apagar: " + lam.estado());

   }

}
