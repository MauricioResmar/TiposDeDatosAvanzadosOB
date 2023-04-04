package TryCatchThrow;

import java.util.InputMismatchException;
import java.util.Scanner;

/** 7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del
 *     tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
 *     Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente,
 *     mostraremos en cualquier caso: "Demo de código".
 */

public class ManageException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("\nPor favor ingrese el numero dividendo: ");
            int valA = scanner.nextInt();
            System.out.println("\nPor favor ingrese el numero divisor: ");
            int valB = scanner.nextInt();

            int resultado = DividePorCero(valA, valB);
            System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse! Debido a la Excepcion: " + e.getClass());
        } finally {
            System.out.println("Demo de codigo v1.0");
        }
    }
    public static int DividePorCero (int A, int B) throws ArithmeticException, InputMismatchException {
        int resultado = 0;
        try {
            resultado = A / B;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado;
    }
}
