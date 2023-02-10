import java.util.Scanner;

public class matrices6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos la matriz
        System.out.print("Introduce el número de filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.print("Introduce el número de columnas de la matriz: ");
        int col = sc.nextInt();
        int [][] m = new int[filas][col];

        int suma = 0;
        int resta = 0;

        //Pedimos los valores
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                System.out.print("Posición de la matriz " + x + ", " + y + ": ");
                m[x][y]=sc.nextInt();
            }
        }


        //Realizamos la suma de los positivos y los negativos
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                if (m[x][y] >= 0) {
                    resta += m[x][y];
                }
                else {
                    suma += m[x][y];
                }
            }
        }
        System.out.println("La suma de los positivos es: " + suma);
        System.out.println("La suma de los negativos es: " + resta);
    }
}
