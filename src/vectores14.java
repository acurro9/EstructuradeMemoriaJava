import java.util.Scanner;

public class vectores14 {
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


        //Se lee el numero y se calcula el numero de veces que aparece
        System.out.print("Introduce el número a comprobar: ");
        int num = sc.nextInt();
        int contador = 0;
        for (int i = 0; i < v.length; i++){
            if ( v[i] > num){
                contador++;
            }
        }

        //Printeamos el resultado dependiendo de si vale 1 o es distinto
        if (contador == 1){
            System.out.println("El número " + num + " es superado en " + contador + " ocasión en el vector");
        } else {
            System.out.println("El número " + num + " es superado en " + contador + " ocasiones en el vector");
        }
    }
}
