public class Arrays {
    public static void main(String[] args) {
        //17 versiones de android
        //Una dimension
        String[] androidVersions = new String[17];  //El espacio en memoria es fij no se varia en el tiempo
        String days[] = new String[7];  //Se recomienda usar en elemntos que NO varien ej. dias de la semana

        //Dos dimensiones
        String [][] cities = new String[4][2];  //4 filas y 2 columnas, los elementos que le caben con 4 * 2 = 8 elementos

        /*
        -----------------------
        3 Mexico   ! CDMX       !
        2 Mexico   ! Guadalajara!
        1 Colombia ! Bogota     !
        0 Colombia ! Medellin   !
           0           1
        -----------------------
         */

        //Tres dimensiones
        int [][][] numbers = new int[2][2][2]; //llevar estos datos a una BBDD o para usar calculos matematicos

        //cuatro dimensiones
        int [][][][] numbers4 = new int[2][2][2][2]; //Ej. para calculos matematicos

        //conversion de nombres debe ser en PLURAL

        System.out.println("Una dimension");
        //Asignar un dato del array

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        //Acceder a un dato del array
        /*System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);*/

        /*for (int i = 0; i <=3; i++) {
            System.out.println(i);
        }*/
         //Aqui accedes a la longitud de la variable que siempre debe ser n-1, por eso se le quita el = a <=;
        /*for (int i = 0; i < androidVersions.length ; i++) {
            System.out.println(androidVersions[i]);
        }*/

        //Hacer lo mismo pero con un foreach

        for (String androidVersion: androidVersions) {
            System.out.println(androidVersion);
        }

        System.out.println();
        System.out.println("Dos dimensiones");

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/

        /*for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length ; j++) {
                System.out.println(cities[i][j]);
            }

        }*/

        //HACER LO MISMO PERO CON FOREACH

        for (String[] pais : cities) {
            for ( String ciudad : pais) {
                System.out.println(ciudad);
            }

        }


        System.out.println();
        System.out.println("cuatro dimensiones");


        String [][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        //System.out.println(animals[1][0][0][1]);
   //Aqui como colocas los numeros debes colocar el <= ya que es n-1

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <= 0 ; k++) {
                    for (int l = 0; l <= 1 ; l++) {
                        System.out.println(animals[i][j][k][l]);

                    }

                }

            }

        }

    }
}
