package ArrayList;
import java.util.ArrayList;

// 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.

public class ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i ++) {
            numeros.add(i);
        }
        System.out.println("\nSe asignaron los siguientes valores al ArrayList numeros: " + numeros);

        System.out.println("\nRemoviendo Pares: ");
        for (int j = 0; j < numeros.size(); j ++) {

            if (numeros.get(j) % 2 == 0) {

                System.out.println("El siguiente numero Par sera removido: " + numeros.get(j));
                numeros.remove(j);
            }
        }

        System.out.println("\nResultado: ");

        for (int k = 0; k < numeros.size(); k ++) {
            System.out.println("El numero impar en el ArrayList es: " + numeros.get(k));
        }
    }
}
