import java.util.Scanner;

public class vectores8 {
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

        //Calcula el mayor y lo printea
        int mayor = v[0];
        for (int i = 1; i < v.length; i++){
            if (mayor < v[i] ){
                mayor = v[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
}
