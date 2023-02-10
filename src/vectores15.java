import java.util.Scanner;

public class vectores15 {
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


        //Se calcula el numero de aprobados, suspensos y sus medias
        int aprob = 0;
        int susp = 0;
        float sumaprob = 0;
        float sumasusp = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= 5) {
                aprob++;
                sumaprob += v[i];
            } else {
                susp++;
                sumasusp += v[i];
            }
        }
        System.out.println("El número de aprobados es de " + aprob + " y la nota media es de " + (sumaprob/aprob));
        System.out.println("El número de suspensos es de " + susp + " y la nota media es de " + (sumasusp/susp));
    }
}