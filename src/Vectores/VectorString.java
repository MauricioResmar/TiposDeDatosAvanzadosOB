package Vectores;
import java.util.Vector;

// 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

public class VectorString {
    public static void main(String[]  Args){

        //Instanciamos el Vector
        Vector<String> simbolos = new Vector<>(7);

        simbolos.add("Alfa");
        simbolos.add("Beta");
        simbolos.add("Gama");
        simbolos.add("Delta");
        simbolos.add("Epsilon");

        System.out.println("El valor en el vector es: " + simbolos);
        System.out.println("El tamano del Vector es de: " + simbolos.size());
        System.out.println("Y su capacidad es de: " + simbolos.capacity() + "\n");

        //Removemos el 2o y 3er elemento y muestra el resultado final.
        simbolos.remove(2);
        simbolos.remove(3);
        simbolos.trimToSize();

        System.out.println("Ahora el tamano del Vector es de: " + simbolos.size());
        System.out.println("Y su capacidad es de: " + simbolos.capacity());

        for (int i = 0; i < simbolos.size(); i++) {
            System.out.println("Y sus valores son: " + simbolos.get(i));
        }
    }
}
