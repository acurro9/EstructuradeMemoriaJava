import java.util.Scanner;

public class matrices4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos la matriz
        System.out.print("Introduce el número de filas: ");
        int fil = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int col = sc.nextInt();
        int [][] m = new int[fil][col];

        //Pedimos los valores
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length;y++){
                System.out.print("Posición de la matriz " + x + ", " + y + ": ");
                m[x][y]=sc.nextInt();
            }
        }
        //Printeamos la matriz
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length;y++){
                System.out.print(m[x][y] + " ");
            }
            System.out.println();
        }

        //Pedimos el número a comprobar
        System.out.print("Introduce el número a comprobar: ");
        int num = sc.nextInt();

        //Comprobamos donde está el número y lo cambiamos
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                if (m[x][y] == num){
                    m[x][y] = 0;
                }
            }
        }
        //Printeamos la nueva matriz
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length;y++){
                System.out.print(m[x][y] + " ");
            }
            System.out.println();
        }
    }
}
