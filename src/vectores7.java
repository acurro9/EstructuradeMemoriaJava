import java.util.Arrays;
import java.util.Scanner;

public class vectores7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se declara un vector de enteros de tamaño 5
        String [] v = new String[5];

        //Se leen los valores
        for (int i = 0; i < v.length; i++){
            System.out.print("Vector[" + i +"]= ");
            v[i] = sc.nextLine();
            System.out.println();
        }

        //Se muestran los valores del vector
        for (int i = 0; i < v.length; i++){
            System.out.print("Vector[" + i + "]= " + v[i]);
            System.out.println();
        }
        //Ponemos los resultados en una lista:
        System.out.println(Arrays.toString(v));
    }
}
