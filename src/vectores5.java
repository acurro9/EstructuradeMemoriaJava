public class vectores5 {
    public static void main(String[] args) {

        //Se declara un vector de enteros de tamaño 500
        int[] v = new int[500];

        //Se leen los valores del vector
        for (int i = 0; i < v.length; i++){
            v[i] = 1;
            System.out.println();
        }

        //Se muestran los valores del vector
        for (int i = 0; i < v.length; i++){
            System.out.print("Vector[" + i + "]= " + v[i]);
            System.out.println();
        }
    }
}