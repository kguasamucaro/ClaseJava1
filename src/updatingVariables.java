public class updatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono 200$
        salary = salary + 200;
        System.out.println(salary);

        //pension 50$ descuento
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extras 30$ c/u
        //comida 45$
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Katherine";
        employeeName = employeeName + " Guasamucaro";
        System.out.println(employeeName);

        employeeName = "Ileana " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);



    }

}
