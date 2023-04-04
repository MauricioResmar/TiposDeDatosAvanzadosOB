package FileInputDataProcessor;
import java.io.*;
import java.util.*;
import java.util.Scanner;

// 9. Sorpréndenos creando un programa de tu elección que utilice InputStream,
// PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

/* FileInputDataProcessor V1.0
 *  La siguiente Clase Java, lee los datos almacenados en un archivo plano .txt ubicado en la raiz (C:), haciendo uso del
 *  respectivo manejo de Excepciones. Posteriormente estos datos se almacenan en un ArrayList llamado listaReg
 *  haciendo uso de un ciclo while para tomar los datos separados por coma "," mediante el metodo String.split.
 *  Y en la medida que estos se van almacenando en nuestro ArrayList hacemos uso de un HashMap para capturar todos los elementos
 *  que sean del tipo (ph) e idRio = "RioQuindio" almacenando en el mapa respectivo valor de medida (ph). Posteriormente y antes
 *  de finalizar el metodo inputStreamFile(){} calculamos el promedio del (Ph) de las muestras obtenidas lo que nos
 *  permitira determinar e interpretar el Ph actual del liquido.
 *
 *  Por ultimo nuestro codigo imprime en consola: Si la muestra es más Acida o Alcalina y generara un archivo
 * llamado "IotDataSensorOut.txt" en la raiz (C:), con el correspondiente resultado final del análisis.
 */

public class FileInputDataProcessor {
    public static void main(String[] args) {

        //Atributos principales (Estado de la aplicación):
        String fileIn = "C://IotDataSensorIn.txt";
        String fileOut = "C://IotDataSensorOut.txt";
        int resultadoAnalisis = 0;
        String rivername = "";

        //Metodo constructor selectRiverId:
        Scanner scanner = new Scanner(System.in);
        while (rivername.equals("")) {
            try {
                rivername = selectRiverId(scanner);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un numero valido.");
            }
        }
        System.out.println("El numero de rio seleccionado es: " + rivername);

        //Metodos constructores inputStreamFile / printStreamFile.
        int lecturaPh = inputStreamFile(fileIn, resultadoAnalisis, rivername);
        printStreamFile(fileOut, lecturaPh, rivername);

    }

    // Metodo Selección Rio(){}
    public static String selectRiverId(Scanner scanner) throws NumberFormatException {

        System.out.println("Seleccione el Rio Correspondiente para el cual quiere realizar la consulta del Ph: \n");
        System.out.println("Ingrese: 1 para Rio Quindio");
        System.out.println("Ingrese: 2 para Rio Verde");
        System.out.println("Ingrese aqui la opcion: ");

        String input = scanner.nextLine();
        int riverId = Integer.parseInt(input);
        String riverName = switch (riverId) {
            case 1 -> "RioQuindio";
            case 2 -> "RioVerde";
            default -> throw new NumberFormatException();
        };
        return riverName;
    }

    //Metodo inputStreamFile(){}
    public static int inputStreamFile (String fileIn, int resultadoAnalisis, String idRio){
        try {
            FileInputStream ficheroIn = new FileInputStream(fileIn);
            System.out.println("\nSe encontro el archivo: " + fileIn + " satisfactoriamente, con los siguientes datos:\n");

            try {
                // Crear un ArrayList para almacenar los datos leídos del archivo
                ArrayList<String[]> listaReg = new ArrayList<>();

                //Almacenamos los datos referentes al tipo Ph y su valor en un Mapa para hacer analisis
                HashMap<String, Integer> mapaPh = new HashMap<String, Integer>();

                // Crear un objeto BufferedReader para leer el archivo de manera eficiente
                BufferedReader br = new BufferedReader(new InputStreamReader(ficheroIn));

                // Leer el archivo línea por línea y agregar cada línea al ArrayList
                String linea;

                while ((linea = br.readLine()) != null) {
                    // Separar los datos de cada línea por coma y agregarlos al ArrayList
                    String[] fila = linea.split(",");

                    if (fila.length == 7) {
                        listaReg.add(fila);
                    }
                }
                // Imprimir los datos almacenados en el ArrayList:

                System.out.println("|IdRegist||IdSensr||Tipo||Valor| |Fecha| |Hora| |Nombre Rio|\n");

                for (String[] columna : listaReg) {
                    System.out.println(columna[0] + ", " + columna[1] + ", " + columna[2] + ", " + columna[3] + ", " + columna[4] + ", " + columna[5] + ", " + columna[6]);

                    //Si el valor es igual a ph:
                    if(columna[2].equals("ph") && columna[6].equals(idRio)){
                        //Convertimos el respectivo campo (Ph) de String a Integer para el análisis correspondiente:
                        int valorPh = Integer.parseInt(columna[3]);

                        //Agregamos el par Clave/valor al HashMap mapaPh en la medida que el ciclo for itera
                        mapaPh.put(columna[0], valorPh);
                    }
                }

                // una vez que el ciclo for halla recorrido nuestro ArrayList con todos los registros del fichero
                // y hemos almacenado todas las mediciones relacionadas al (Ph) en nuestra estructura de datos HashMap
                // procedemos a sumar dichos valores, necesarios para calcular el promedio de nuestro valor (Ph) y poder así interpretarlo.
                for(Map.Entry elemento : mapaPh.entrySet()){
                    resultadoAnalisis = resultadoAnalisis + Integer.parseInt(elemento.getValue().toString());
                }
                // Calculamos el promedio del (Ph) dividiendo la suma de todos los valores
                // entre el tamaño de nuestro mapaPh recientemente creado.
                resultadoAnalisis = resultadoAnalisis / mapaPh.size();

                br.close();                       //Cerramos las instancias abiertas
                ficheroIn.close();

            } catch (IOException e) {
                System.out.println("El programa da error: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No puedo leer el fichero" + e.getMessage());
        }

        return resultadoAnalisis;    //Retornamos el valor prometido por el metodo
    }

    // Metodo PrintStream(){}
    // Según sea el resultado de nuestro analisis procedemos a generar archivo "C://IotDataSensorOut.txt" con el respectivo valor
    public static void printStreamFile (String fileOut, int lecturaPh, String idRio) {
        try {
            PrintStream ficheroOut = new PrintStream(fileOut);

            System.out.println("\nEl pH del agua se muestra en una escala de 0 a 14, con 7 considerado neutro. Un pH inferior a 7 es considerado acido y tiende a ser alcalino cuando es superior a 7.");

            if (lecturaPh >= 7) {
                System.out.println("\nEl valor promedio del Ph en el " + idRio + " es: " + lecturaPh + " y segun la muestra analizada este es mas alcalino que acido. Para mayor informacion consulta el archivo almacenado en: " + fileOut);
                ficheroOut.println("El Ph actual del: " + idRio + " es mas Alcalino, el promedio del (Ph) analizado es: " + lecturaPh + " donde un resultado > a 7 es mas Alcalino y < a 7 mas es Acido");
            } else {
                System.out.println("\nEl valor promedio del Ph en el " + idRio + " es: " + lecturaPh + " y segun la muestra analizada este es mas Acido que Alcalino. Para mayor informacion consulta el archivo almacenado en: " + fileOut);
                ficheroOut.println("El Ph actual del: " + idRio + " es mas Acido, el promedio del (Ph) analizado es: " + lecturaPh + " donde un resultado < 7 es mas Acido y > a 7 es mas Alcalino");
            }

            ficheroOut.close(); //Cerramos la instancia abierta

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}