import java.util.Scanner;

public class matrices13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se crea la matriz
        System.out.print("Introduce las filas de la matriz: ");
        int n = sc.nextInt();
        System.out.print("Introduce las columnas de la matriz: ");
        int c = sc.nextInt();
        int [][]m = new int[n][c];

        //Se piden los valores
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                System.out.print("m[" + x + "][" + y + "]= ");
                m[x][y]= sc.nextInt();
            }
        }
        //Se printean los valores
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                System.out.print(m[x][y] + " ");
            }
            System.out.println();
        }

        //Se crea el vector para guardar la suma de cada columna
        int[] v = new int[n];

        //Se calcula la suma de cada columna
        for (int x = 0; x < n; x++){
            v[x]=0;
            for (int y = 0; y < c; y++){
                v[x] += m [x][y];
            }
        }

        //Se printea el resultado
        for (int x = 0; x < v.length; x++){
            System.out.println("La fila " + x + " suma " + v[x]);
        }
    }
}
