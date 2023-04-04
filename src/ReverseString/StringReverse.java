package ReverseString;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cadena a revertir: ");

        //scanner.next devuelve la cadena hasta el primer espacio
        //scanner.nextline devuelve la cadena de toda la linea de texto incluyendo espacios:

        String cadena = scanner.nextLine();

        //Invocamos al metodo reverse el cual realiza la operación mediante array
        String cadenaInvertida = reverse(cadena);

        System.out.println("la cadena original es: " + cadena);
        System.out.println("la cadena invertida mediante array es: " + cadenaInvertida);

        //Invocamos al metodo reverseBuffer el cual realiza la operación mediante Clase StringBuffer y metodo reverse
        StringBuffer cadenaInvertidaII = reverseStringBuffer(cadena);
        System.out.println("La cadena invertida mediante la Clase StringBuffer y el metodo .reverse es: " + cadenaInvertidaII);
    }
    public static String reverse(String texto) {

        //Creamos un array de caracteres de la misma longitud que la cadena de texto.

        char[] caracteres = new char[texto.length()];

        // Recorremos la cadena y agregamos los caracteres al array en orden inverso
        for (int i = texto.length() - 1; i >= 0; i--) {
            caracteres[texto.length() - 1 - i] = texto.charAt(i);
        }

        // Creamos una nueva cadena a partir del array de caracteres
        String cadenaInvertida = new String(caracteres);

        // retornamos la cadena invertida
        return cadenaInvertida;
    }

    // Metodo alternativo para invertir la cadena haciendo uso del metodo .reverse de la clase StringBuffer
    public static StringBuffer reverseStringBuffer(String texto) {
        //Imprime la cadena haciendo uso de la Clase StringBuffer y el metodo reverse de java
        StringBuffer cadenaInvert = new StringBuffer(texto).reverse();
        return cadenaInvert;
    }
}
