package sample;

import static java.lang.Integer.parseInt;

public class Ordenamiento {

    public  String[][] burbuja(String[][] A) {
    String aux;
    String aux2;
    String[][] arregloOrdenado;
    for (int i = 0; i < A.length-1; i++)
        for (int j = 0; j < A.length - i - 1; j++) {
            int a = parseInt(A[j][1]);
            int b= parseInt(A[j + 1][1]);

            if ( a > b) {
                aux = A[j][0];
                aux2 = A[j][1];
                A[j][0] = A[j + 1][0];
                A[j][1] = A[j + 1][1];
                A[j + 1][0] = aux;
                A[j + 1][1] = aux2;
            }
        }
    arregloOrdenado=A;
    return arregloOrdenado;
    }
    public String[][] quicksortPrueba(String[][] m) {
        String [][]ordenado;
        quicksort(m, 0, 10);
        ordenado=m;
        return ordenado;
    }

    public String[][]  quicksort(String[][] m, int inferior, int superior) {
        String[][]ordenado;
        int izquierda, derecha;
        String mitad, x,y;
        izquierda = inferior;
        derecha = superior;
        mitad = m[(izquierda + derecha) / 2][1];

        do {
            while (Integer.parseInt(m[izquierda][1]) < Integer.parseInt(mitad) && izquierda < superior) {
                izquierda++;
            }
            while (Integer.parseInt(mitad) < Integer.parseInt(m[derecha][1]) && derecha > inferior) {
                derecha--;
            }

            if (izquierda <= derecha) {

                x = m[izquierda][1];
                y=m[izquierda][0];
                m[izquierda][1] = m[derecha][1];
                m[izquierda][0] = m[derecha][0];
                m[derecha][1] = x;
                m[derecha][0] = y;

                izquierda++;
                derecha--;

            }

        } while (izquierda <= derecha);

        if (inferior < derecha) {
            quicksort(m, inferior, derecha);
        }

        if (izquierda < superior) {
            quicksort(m, izquierda, superior);
        }
        ordenado=m;
        return ordenado;

    }

}


