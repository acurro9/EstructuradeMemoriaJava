import java.util.Scanner;

public class matrices9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos la matriz
        System.out.print("Introduce el tamaño de la matriz: ");
        int n = sc.nextInt();
        int [][]m = new int[n][n];

        int sumatorio = 0;

        //Pedimos los valores
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                System.out.print("m[" + x + "][" + y + "]= ");
                m[x][y]= sc.nextInt();
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

        //Calculamos el sumatorio
        int y = 0;
        for (int x = n-1; x >= 0; x--){
            sumatorio += m[x][y];
            y++;
        }
        System.out.println("El resultado es " + sumatorio);
    }
}
