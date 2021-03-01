import java.net.PortUnreachableException;

public class WhileLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        //Simulacion de lampara para dar señal SOS (... _ _ _ ...)
       turnOnOffLight();

       int i = 1;
       while(isTurnOnLight && i <=10){
           printSOS();
           i++;
       }
    }

    public static void printSOS(){
        System.out.println("... _ _ _ . . .");
    }

    public static boolean turnOnOffLight (){
        //Con el metodo if
        /*if (isTurnOnLight){
            isTurnOnLight = false;
            System.out.println("Entro en false");
        }else {
            isTurnOnLight = true;
            System.out.println("entro en true");
        }
        return isTurnOnLight;*/

        //Usando el operador terneario se hace lo mismo pero resumiendo en una linea
        //isTurnOnLight = (condicion)?valor:valor;

        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;

    }
}
