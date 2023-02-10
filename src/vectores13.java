import java.util.Scanner;

public class vectores13 {
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

        //Creamos variables contador y calculamos cuantos pares e impares hay
        int par = 0;
        int impar = 0;
        for (int i = 0; i < v.length; i++) {
            if ( v[i]%2 != 0){
                impar++;
            } else {
                par++;
            }
        }
        System.out.println("El número de pares es " + par + " y el de impares es " + impar);
    }
}