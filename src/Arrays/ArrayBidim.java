package Arrays;

// 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

public class ArrayBidim {
    public static void main(String[] args) {
        int arraybidim[][] = new int[2][4];

        arraybidim[0][0] = 4;
        arraybidim[0][1] = 8;
        arraybidim[0][2] = 16;
        arraybidim[0][3] = 32;

        arraybidim[1][0] = 64;
        arraybidim[1][1] = 128;
        arraybidim[1][2] = 256;
        arraybidim[1][3] = 512;

        for (int i = 0; i<arraybidim.length; i ++){
            System.out.println("\nPosicion actual de la columna= " + i + "\n");

            for (int j = 0; j < arraybidim[1].length; j++){
                System.out.println("Estoy en i: " + i + ", j: " + j);
                System.out.println(arraybidim[i][j]);
            }
        }
    }
}
