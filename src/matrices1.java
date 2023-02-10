import java.util.Scanner;

public class matrices1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos una matriz de 2x3
        int [][] m = new int [2][3];
        //Pedimos sus valores
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++) {
                System.out.print("posición de la matriz: " + x + "," + y + ": ");
                m[x][y]=sc.nextInt();
            }
        }
        System.out.println();
        //Printeamos los valores
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++) {
                System.out.print(m[x][y] + " ");
            }
            System.out.println();
        }
    }
}
