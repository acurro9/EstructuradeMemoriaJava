import java.util.Scanner;

public class matrices2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos una matriz de 2x3 y definimos la variable sumatorio
        int [][] m = new int [2][3];
        int sumatorio = 0;
        //Pedimos los valores y calculamos el sumatorio
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++) {
                System.out.print("posición de la matriz: " + x + "," + y + ": ");
                m[x][y]=sc.nextInt();
                sumatorio += m[x][y];
            }
        }
        System.out.println();
        //Se printean los valores y el sumatorio
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++) {
                System.out.print(m[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("El resultado es " + sumatorio);
    }
}
