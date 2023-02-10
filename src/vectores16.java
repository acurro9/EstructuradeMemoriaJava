import java.util.Scanner;

public class vectores16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se lee el tamaño del vector
        System.out.print("Introduce el tamaño del vector: ");
        int longitud = sc.nextInt();
        System.out.println();

        //Se declara un vector de enteros de tamaño longitud
        int[] v = new int[longitud];

        //Se leen los valores del vector
        for (int i = 0; i < v.length; i++) {
            System.out.print("Vector[" + i + "]= ");
            v[i] = sc.nextInt();
            System.out.println();
        }

        int var = v[v.length-1];
        //Movemos los valores una posición
        for (int i = v.length-2; i >= 0; i--) {
            v[i+1] = v[i];
        }
        v[0] = var;

        //Printeamos los valores del vector
        for (int i = 0; i < v.length; i++) {
            System.out.println("v["+i+"]= "+v[i]);
        }
    }
}
