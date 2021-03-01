public class Casting {
    public static void main(String[] args) {
        //Si 1 año ubique 30 perritos ¿Cuantos ubique al mes?

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACION
        int estimatedMonthglyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthglyDogs); //quita los decimales, ya que le difo que imprima enteros

        //EXACTITUD
        int a = 30;
        int b = 12;

        System.out.println((double) a/b); //me inprime decimales ya que le puse double
        //Otro ejemplo

        double c = (double) a/b;  //Asi me trae los decimales
        System.out.println(c);

        double d = a/b;  //Asi NO me trae los decimales
        System.out.println(d);

        char n = '1'; //El char es mas pequeño que un entero ya que es un caracteres
        int nI = n;
        System.out.println(nI);  //proceso automatico

        //me obliga a ejecutar un casting -- osea debo convertirlo sino me da error

        short nS = (short) n;
        System.out.println(nS);
    }
}
