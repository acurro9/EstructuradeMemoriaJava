import java.util.Arrays;
import java.util.Scanner;

public class vectores17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se lee el tamaño del vector
        System.out.print("Introduce el tamaño del vector: ");
        int longitud = sc.nextInt();
        System.out.println();

        //Se declara un vector de enteros de tamaño "longitud"
        int[] v = new int[longitud];
        int[] w = new int [longitud];

        //Se leen los valores del vector
        for (int i = 0; i < v.length; i++) {
            System.out.print("Vector[" + i + "]= ");
            v[i] = sc.nextInt();
            System.out.println();
        }

        //Se muestran los valores del vector
        for (int i = 0; i < v.length; i++) {
            System.out.print("Vector[" + i + "]= " + v[i]);
            System.out.println();
        }
        /*
        Forma de ordenar de menor a mayor
        Arrays.sort(v);
        System.out.println(Arrays.toString(v));
         */
        //Se ordenan los valores del vector
        for (int x = 0; x < v.length; x++) {
            for (int i = 0; i < v.length-x-1; i++) {
                if(v[i] > v[i+1]){
                    int cambio = v[i];
                    v[i] = v[i+1];
                    v[i+1] = cambio;
                }
            }
        }

        //Se printea el vector ordenado
        for (int x = 0; x < v.length; x++){
            System.out.println("Vector[" + x +"]= " + v[x]);
        }

    }
}