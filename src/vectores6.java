public class vectores6 {
    public static void main(String[] args) {

        //Se declara un vector de enteros de tamaño "longitud"
        String [] v = new String[10];

        //Se leen los valores del vector
        v[0]= "Jax";
        v[1]= "Renekton";
        v[2]= "Zed";
        v[3]= "Tinky-Winky";
        v[4]= "Rammus";
        v[5]= "Dipsy";
        v[6]= "Sivir";
        v[7]= "Laa-Laa";
        v[8]= "Po";
        v[9]= "Aatrox";

        //Se muestran los valores del vector
        for (int i = 0; i < v.length; i++){
            System.out.print("Vector[" + i + "]= " + v[i]);
            System.out.println();
        }
    }
}