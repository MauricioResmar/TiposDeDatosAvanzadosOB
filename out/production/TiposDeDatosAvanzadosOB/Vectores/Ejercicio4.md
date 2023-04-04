

4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000
elementos para ser añadidos al mismo.

Respuesta: Debido a que los Vectores son dinámicos y ajustan su tamaño (Espacio en memoria) de manera
exponencial y en proporción a la cantidad de elementos que se vayan agregando, éste deberá hacer un
uso elevado de los recursos computacionales, con el fin de crear nuevos espacios en memoria, copiar los valores anteriores y agregar los nuevos,
lo cual después de una cierta cantidad de veces podría ralentizar considerablemente el rendimiento de la máquina
y la ejecución de nuestro software.

Aquí lo ideal sería hacer un uso estricto del resize y limitarnos
a trabajar con la menor cantidad de datos posibles.