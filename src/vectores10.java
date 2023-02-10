import java.util.Scanner;

public class vectores10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se lee el tamaño del vector
        System.out.print("Introduce el tamaño del vector: ");
        int longitud = sc.nextInt();
        System.out.println();

        //Se declara un vector de enteros de tamaño longitud
        int[] v = new int[longitud];

        //Se leen los valores del vector
        for (int i = 0; i < v.length; i++){
            System.out.print("Vector["+i+"]= ");
            v[i] = sc.nextInt();
            System.out.println();

        }

        int suma = 0;
        //Calcula la suma de los valores
        for (int i = 0; i < v.length; i++){
            suma += v[i];
        }
        System.out.println("El resultado de la suma es: " + suma);
    }
}