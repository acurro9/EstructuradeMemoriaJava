import java.util.Scanner;

public class matrices8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos la matriz
        System.out.print("Introduce el tamaño de la matriz: ");
        int n = sc.nextInt();
        int [][] m = new int [n][n];

        int sumatorio = 0;

        //Pedimos los valores y calculamos la suma de la diagonal
        System.out.println("Introduce los valores de la matriz");
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                System.out.print("m[" + x + "][" + y + "]= ");
                m[x][y] = sc.nextInt();
                if (x == y){
                    sumatorio += m[x][y];
                }
            }
        }

        //Printeamos la matriz
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                System.out.print(m[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("La suma de la diagonal principal es " + sumatorio);



    }
}
