package ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;

// 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> nombresQuimbaya = new ArrayList<String>();
        nombresQuimbaya.add("Sinifana");
        nombresQuimbaya.add("Ingruma");
        nombresQuimbaya.add("Tabuya");
        nombresQuimbaya.add("Kumanday");

        System.out.println("Los valores contenidos en el ArrayList son: " + nombresQuimbaya +"\n");

        //Inicializamos nuestra lista enlazada (LinkedList) y le pasamos como Parametro nuestro ArrayList
        LinkedList<String> listaEnlazada = new LinkedList<String>(nombresQuimbaya);

        //Recorremos tanto el ArrayList como el LinkedList y mostramos el valor de cada elemento

        for(int i = 0; i < nombresQuimbaya.size(); i ++) {
            System.out.println("El valor del elemento actual en el ArrayList es: " + nombresQuimbaya.get(i));
        }

        System.out.println("\n");

        for (int i = 0; i < listaEnlazada.size(); i++){
            System.out.println("El valor del elemento actual en la lista enlazada es: " + listaEnlazada.get(i));
        }
    }
}
