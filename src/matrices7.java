import java.util.Scanner;

public class matrices7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos la matriz
        int [][] m = new int[4][3];

        //Pedimos los valores
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                System.out.print("Posición de la matriz " + x + ", " + y + ": ");
                m[x][y] = sc.nextInt();
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

        //Igualamos el mayor valor a la posición [0][0] de la matriz
        int [] v = new int[2];
        int mayor = m[0][0];
        v[0] = 0;
        v[1] = 0;


        //Recorremos la variable para conocer el mayor valor
        for (int x = 0; x < m.length; x++){
            for (int y = 0; y < m[x].length; y++){
                if (mayor < m[x][y]){
                    mayor = m[x][y];
                    v[0] = x;
                    v[1] = y;
                }
            }
        }
        System.out.println("El mayor valor es " + mayor + " y se encuentra en la posicion m[" + v[0] + "][" + v[1] + "]");
    }
}
