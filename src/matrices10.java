import java.util.Scanner;

public class matrices10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos la matriz
        System.out.print("Introduce el tamaño de la matriz: ");
        int n = sc.nextInt();
        int [][]m = new int[n][n];

        int sumatorio = 0;

        //Pedimos los valores y calculamos la suma
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                System.out.print("m[" + x + "][" + y + "]= ");
                m[x][y]= sc.nextInt();
            }
        }

        //Calculamos la suma
        for (int x = 0; x < m.length-1; x++) {
            for (int y = x+1; y < m[x].length; y++) {
                sumatorio += m[x][y];
            }
        }

        System.out.println();

        //Printeamos la matriz
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                System.out.print(m[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("El resultado es " + sumatorio);
    }
}

