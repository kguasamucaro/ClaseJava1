public class MiFamilia {
    public static void main(String[] args) {
        var nameMother = "Ivonne";
        int ageMother = 2021 - 1956;
        System.out.println("Mi Mama se llama: " + nameMother + " su Edad es: " + ageMother);

        var nameBrotherMayor = "Darwin";
        int ageBrotherMayor = 2021 - 1974;
        var nameBrotherMedio = "Rafael";
        int ageBrotherMedio = 2021 -1977;
        var nameSisterMenor = "Ileana";
        int ageSiterMenor = 2021 - 1991;

        System.out.println(nameMother + " Tienes 3 hijos llamados: " +
                nameBrotherMayor + ", " + nameBrotherMedio + " y " + nameSisterMenor + " que tienen las edades de: " +
                ageBrotherMayor + "," + ageBrotherMedio + " y " + ageSiterMenor);
        System.out.println(nameBrotherMayor + " es mayor que " + nameBrotherMedio + " por " +
                (ageBrotherMayor - ageBrotherMedio + " años"));
        System.out.println(nameBrotherMedio + " es mayor que " + nameSisterMenor + " por " +
                (ageBrotherMedio - ageSiterMenor) + " años");
        System.out.println("Este año " + nameSisterMenor + " va a cumplir " + ageSiterMenor +
                " pero el año que viene ya serán " + ++ageSiterMenor);


        //double edadMotherExacta = (double) ageMother;
        //System.out.println(edadMotherExacta);

        //String d = "67857";
        //System.out.println(Integer.parseInt(d));

        //char c = ‘z’; conviertelo a int
        char c = 'z';
        System.out.println((int) c);

        //int i = 250; conviertelo a long y luego de long a short
        int i = 250;
        System.out.println( i); //No necesita castearlo a long
        System.out.println((short) i);

        //double d = 301.067; conviertelo a long
        double e = 301.067;
        System.out.println((long) e);

        //int i = 100; súmale 5000.66 y conviertelo a float
        int x = 100;
        double y = x + 5000.66;
        System.out.println( y); //No necesita castearlo a float

        //int i = 737; multiplícalo por 100 y conviertelo a byte
        int h = 737 * 100;;
        byte hB = (byte) h;
        System.out.println(hB);

        //CONVERTIR INT a BYTE
        //int iB = 737 * 100;
        //byte iBy = (byte) iB;
        //System.out.println(iBy);

        //double d = 298.638; divídelo entre 25 y conviertelo a long
        double s = 298.638;
        System.out.println( (long) s / 25);

        // convertir de ENTERO a LONG
        //int i = 250;
        //long iL = i;
        //System.out.println(iL);

        // CONVERTIR de LONG A SHORT
        //short iS = (short) iL;
        //System.out.println(iS);


    }
}
