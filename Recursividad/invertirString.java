package Recursividad;

public class invertirString{

    public static String invertirString(String texto) {
        // Si la cadena es nula, está vacía ("") o tiene un solo carácter,
        // no hay nada que invertir, así que la devolvemos tal cual.
        if (texto == null || texto.length() <= 1) {
            return texto;
        }
        //charAt(texto.length() - 1) toma el ÚLTIMO carácter.
        //substring(0, texto.length() - 1) toma TODO el texto EXCEPTO el último carácter.
        // Se hace la llamada recursiva con ese fragmento restante.
        char ultimoCaracter = texto.charAt(texto.length() - 1);
        String restoDelTexto = texto.substring(0, texto.length() - 1);

        return ultimoCaracter + invertirString(restoDelTexto);
    }

    public static void main(String[] args) {
        String palabra = "HOLA";
        System.out.println("Original: " + palabra);
        System.out.println("Al revés: " + invertirString(palabra));
    }
}

