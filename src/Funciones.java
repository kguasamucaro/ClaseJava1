import javax.sound.midi.Soundbank;
import java.net.PortUnreachableException;
import java.util.SortedMap;

public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        //Area de una circulo
        //pi * r2 (r = y)
        //System.out.println(Math.PI * Math.pow(y,2)); //Llamo a mi funcion circulo
        //System.out.println(circleArea(y)); //Se imprime sin variable
        //double areaCirculo = circleArea(y); //Se imprime con variable
        //System.out.println(areaCirculo);
        circleArea(y); //Solo dejar los metodos

        //Area de una esfera
        //4*PI*r2
        //System.out.println(4 * Math.PI * Math.pow(y,2));
        //System.out.println(sphereArea(y));
        sphereArea(y);

        //Volumen de una esfera
        //(4/3)* pi * r3
        //System.out.println((4/3) * Math.PI * Math.pow(y,3));
        //System.out.println(sphereVolumen(y));
        sphereVolumen(y);

        //System.out.println("Conversion de pesos Mex: " + converToDolar(200, "MXN"));
        System.out.println("Convertir a pesos Col: " + converToDolar(1000, "COP"));
        System.out.println("Convertir a peso BOL: " + converToDollar(100, "BOL"));

    }

    public static double circleArea (double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea (double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen (double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }


    //OTRO EJEMPLO DE FUNCION PERO CON SWITCH Y CON VARIOS PARAMETROS

    /**
     *
     * Descripción: Funcion que convierte la moneda de Pesos a Dolares
     * @param cantidad: Muestra la cantidad
     * @param moneda : Muestra la moneda de MXN y COP
     * @return cantidad : Devuelve la cantidad actualizada en Dolares
     *
     *   */
    /*
     * Otros son:
     * @author Ileana guasamucaro
     * @<code> Muestra texto HTML</code>
     * {@code} Muestra texto en formato de codigo sin ser interpretado por HTML
     * {@docRoot} Indica ruta relativa al directorio raiz del doc. generado desde cualquier pagina generada
     * @exception  class-name description: cuando es vulnerable lanzar un exception
     * @deprecated Se coloca indicando que la API no se usa mas
     * {@inheritDoc} Indica herencia o implementacion prodecedentora
     * {@link package.class#memberlabel} Hace un enlace a un miembro indicado
     * @param parameter-name descrption
     * @return decription
     * @see reference: Se añade para manejar referencias o informacion relacionada
     * @serial fiel-descrption include exclude: Se usa para indicar campos o clases serializables
     * @serialData data-descrption: Se usa para documentar metodos que genera serializacion
     * @serialField field-name field-type field-descrption: se usa para documentar objetos serializados
     * @since release: Se añade en el encabezado para indicar cuando se creo
     * @throws class-name descrption: Es sinonimo con la etiqueta @exception
     * {@value paquete.class#field} : Cunado se usa sin argumento se usa para especificar un campo estatico,
     * en otro caso se usa para usar el valor constante
     * @version version-text: Se añade en el subtitulo con la version especificada.
     */


    public static double converToDolar(double cantidad, String moneda){
    //MXN o COP
        switch (moneda){
            case "MXN":
                cantidad = cantidad * 0.052;
                break;
            case "COP":
                cantidad = cantidad * 0.00031;
                break;
    }
    return cantidad;

    }
    //Otra manera con IF
    public static double converToDollar(double quantity, String currency){
        if (currency == "MXN"){
            quantity = quantity * 0.042;
        }else if (currency == "COP"){
            quantity = quantity * 0.00026;
        }else if (currency == "BOL"){
            quantity = quantity * 0.15;
        }else {
            quantity = 0.0;
        }
        return quantity;

    }





}





