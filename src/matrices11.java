import java.util.Scanner;

public class matrices11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se crea la matriz
        System.out.print("Introduce el tamaño de la matriz: ");
        int n = sc.nextInt();
        int [][]m = new int[n][n];

        if ( n<5 ){
            System.out.println("El tamaño no es suficiente, mínimo tiene que ser 5x5");
        }
        else {
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

            /*
            Damos valor 1 a toda la matriz
                for (int x = 0; x < m.length; x++){
                for (int y = 0; y < m[x].length; y++){
                    m[x][y] = 1;
                }
            }
             */

            int sumatorio = 0;
            //Se calcula el interior
            for (int x = 1; x < m.length-1; x++){
                for (int y = 1; y < m.length-1; y++){
                    if (x == 1 || x == m.length-2){
                        sumatorio += m[x][y];
                    } else if (y == 1 || y == m.length-2) {
                        sumatorio += m[x][y];
                    }
                }
            }
            System.out.println("El resultado es " + sumatorio);
        }
    }
}
