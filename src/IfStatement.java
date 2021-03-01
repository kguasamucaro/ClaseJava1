public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetooEnabled = false;  //Solo se ve una condicion, es decir true
        int fileSend = 3;

        if (isBluetooEnabled){
            //Si es true se envia un archivo
          fileSend++;
            System.out.println("El archivo se Envia");
        } else {
            fileSend--;
            System.out.println("Por favor enciende tu Bluetoo");
        }
        System.out.println(fileSend);

    }
}
