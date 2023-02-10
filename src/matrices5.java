import java.util.Scanner;

public class matrices5 {
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

        //Comprobamos los número mayores al indicado
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                if (m[x][y] > num) {
                    sumatorio++;
                }
            }
        }
        if (sumatorio == 1){
            System.out.println("El número " + num + " tiene " + sumatorio + " número mayor que él en la matriz.");
        } else if (sumatorio == 0) {
            System.out.println("El número " + num + " no tiene un número mayor en la matriz.");
        } else{
            System.out.println("El número " + num + " tiene " + sumatorio + " números mayores que él en la matriz.");
        }
    }
}