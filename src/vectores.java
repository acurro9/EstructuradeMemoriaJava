import java.util.Scanner;

public class vectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media = 0;
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
        //Calculamos la media de los valores
        for (int i = 0; i < v.length; i++){
            media = media + v[i];
        }

        //Se muestran los valores del vector
        for (int i = 0; i < v.length; i++){
            System.out.print("Vector[" + i + "]= " + v[i]);
            System.out.println();
        }
        media= media/longitud;
        System.out.println();
        System.out.println("La media es: " + media);
    }
}
