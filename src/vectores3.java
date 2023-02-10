import java.util.Scanner;

public class vectores3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Se lee el tamaño del vector
        System.out.print("Introduce el tamaño del vector: ");
        int longitud = sc.nextInt();
        System.out.println();
        //Se declara un vector de enteros de tamaño "longitud"
        int[] v = new int[longitud];
        //Se leen los valores del vector
        for (int i = 0; i < v.length; i++){
            System.out.print("Vector["+i+"]= ");
            v[i] = sc.nextInt();
            System.out.println();
        }
        //Se muestran los valores del vector v
        for (int i = 0; i < v.length ; i++) {
            System.out.print("Vector v[" + i + "]= " + v[i]);
            System.out.println();
        }

        int y[] = new int[longitud];
        System.out.println("");

        //Se muestran los valores del vector y
        for (int i = 0; i < v.length ; i++){
            y[i] = v[i];
            System.out.print("Vector y[" + i + "]= " + y[i]);
            System.out.println();

        }
    }
}
