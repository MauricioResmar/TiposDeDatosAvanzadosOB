package Arrays;

// 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

public class ArrayUnidim {
    public static void main(String[] args) {
        String arrayunidim[] = new String[8];
        arrayunidim[0] = "Alfa";
        arrayunidim[1] = "Beta";
        arrayunidim[2] = "Gamma";
        arrayunidim[3] = "Delta";
        arrayunidim[4] = "Epsilon";
        arrayunidim[5] = "Zeta";
        arrayunidim[6] = "Eta";
        arrayunidim[7] = "Theta";

        for (String i: arrayunidim){
            System.out.println("Array de String: " + i);
        }

        char[] greekAlphabet = {'\u03B1', '\u03B2', '\u03B3', '\u03B4', '\u03B5', '\u03B6', '\u03B7', '\u03B8', '\u03B9', '\u03BA', '\u03BB', '\u03BC', '\u03BD', '\u03BE', '\u03BF', '\u03C0', '\u03C1', '\u03C3', '\u03C4', '\u03C5', '\u03C6', '\u03C7', '\u03C8', '\u03C9'};

        // Imprime simbolos griegos
        for (char letter : greekAlphabet) {
            System.out.print(letter + " ");
        }

    }
}
