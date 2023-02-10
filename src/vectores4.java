import java.util.Scanner;

public class vectores4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se lee el tamaño del vector
        System.out.print("Introduce el tamaño del vector: ");
        int longitud = sc.nextInt();
        System.out.println();

        //Se declaran los vectores de enteros de tamaño "longitud"
        int[] v = new int[longitud];
        int[] y = new int[longitud];
        int[] z = new int[longitud];

        //Se leen los valores de los vectores
        for (int i = 0; i < v.length; i++){
            System.out.print("Vector x["+i+"]= ");
            v[i] = sc.nextInt();
            System.out.println();
        }
        for (int i = 0; i < v.length; i++){
            System.out.print("Vector y["+i+"]= ");
            y[i] = sc.nextInt();
            System.out.println();
        }

        //Se muestran los valores del vector z
        for (int i = 0; i < v.length ; i++) {
            z[i] = v[i]+y[i];
            System.out.println("Vector z[" + i + "]= " + z[i]);
        }
    }
}
