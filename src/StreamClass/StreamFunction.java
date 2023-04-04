package StreamClass;
import java.io.*;

// 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
// La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut"

public class StreamFunction {
    public static void main(String[] args) {

        //Invovamos mediante constructor la funcion CreateFile() la cual hara uso de InputStream y PrintStream
        CreateFile("C://FicheroPrueba.txt", "C://FicheroOut.txt");
    }

    // Input Stream:
    public static void CreateFile (String fileIn, String fileOut){
        try {
            InputStream fichero = new FileInputStream(fileIn);
            System.out.println("\nSe encontro el archivo: " + fileIn + " satisfactoriamente!:\n");

            try {
                byte[] dato = fichero.readAllBytes();
                for (byte datos : dato) {
                    System.out.println("El fichero leido cuenta con los siguientes datos: " + (char)datos);
                }

                // Print Stream:
                PrintStream ficheroOut = new PrintStream(fileOut);
                ficheroOut.write(dato);
                System.out.println("Se creo el fichero: " + fileOut + " Satisfactoriamente con la informacion contenida en: " + fileIn);

                fichero.close();
                ficheroOut.close();
            } catch (IOException e) {
                System.out.println("Lo sentimos, el archivo no pudo ser encontrado: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lo sentimos, el archivo no pudo ser encontrado: " + e.getMessage());
        }
    }
}
