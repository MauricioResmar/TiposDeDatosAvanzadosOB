
Entrega ejercicios temas 7, 8 y 9.

Dada la función:

public static String reverse(String texto) { }

Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh". Ruta: >ReverseString>StringReverse

1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores. Ruta: >Arrays>ArrayUnidim.
    
2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones. Ruta: >Arrays>ArrayBidim

3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final. Ruta: >Vectores>VectorString

4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo. Ruta: >Vectores>Ejercicio4.Md

5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento. Ruta: >ArrayList>ArrayListString

6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno. Ruta: >ArrayList>ArrayListInt

7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código". Ruta: >TryCatchThrow>ManageException

8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut". Ruta: >StreamClass>StreamFunction

9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array. Ruta: >FileInputDataProcessor>FileInputDataProcessor

Para la correcta ejecución del programa propuesto, se debe almacenar en la raiz "C://" el respectivo fichero como sigue: "C://IotDataSensorIn.txt" y en el cual almacenaremos la respectiva Data necesaria para hacer el respectivo procesamiento en nuestro archivo Java junto con su análisis.

Contenido del fichero "C://IotDataSensorIn.txt":

Idreg_01,SensorIot01,ph,8,1/04/2023,13:13,RioQuindio
Idreg_02,SensorIot02,ph,8,1/04/2023,13:15,RioQuindio
Idreg_03,SensorIot03,ph,10,1/04/2023,13:16,RioQuindio
Idreg_04,SensorIot01,ph,14,1/04/2023,13:17,RioQuindio
Idreg_05,SensorIot02,ph,2,1/04/2023,13:17,RioQuindio
Idreg_06,SensorIot03,ph,10,1/04/2023,13:17,RioQuindio
Idreg_07,SensorIot02,ph,7,1/04/2023,13:17,RioQuindio
Idreg_08,SensorIot04,conductividad,14,1/04/2023,13:17,RioQuindio
Idreg_09,SensorIot05,conductividad,14,1/04/2023,13:17,RioQuindio
Idreg_10,SensorIot06,conductividad,14,1/04/2023,13:17,RioQuindio
Idreg_11,SensorIot11,ph,2,1/04/2023,13:17,RioVerde
Idreg_12,SensorIot12,ph,10,1/04/2023,13:17,RioVerde
Idreg_13,SensorIot13,ph,7,1/04/2023,13:17,RioVerde