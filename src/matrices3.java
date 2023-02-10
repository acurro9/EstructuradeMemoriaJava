import java.util.Scanner;

public class matrices3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos la matriz
        System.out.print("Introduce el número de filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.print("Introduce el número de columnas de la matriz: ");
        int col = sc.nextInt();
        int [][] m = new int[filas][col];

        int sumatorio = 0;

        //Pedimos los valores
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                System.out.print("Posición de la matriz " + x + ", " + y + ": ");
                m[x][y]=sc.nextInt();
            }
        }

        //Pedimos el número a comparar
        System.out.print("Introduce el número a comprobar: ");
        int num = sc.nextInt();

        //Comprobamos el número de veces que aparece ese número en el vector
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                if (m[x][y] == num) {
                    sumatorio++;
                }
            }
        }
        if (sumatorio == 1){
            System.out.println("El número " + num + " aparece " + sumatorio + " vez.");
        } else if (sumatorio == 0) {
            System.out.println("El número " + num + " no aparece ninguna vez.");
        } else{
            System.out.println("El número " + num + " aparece " + sumatorio + " veces.");
        }
    }
}
