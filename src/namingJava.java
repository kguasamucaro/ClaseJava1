public class namingJava {
    public static void main(String[] args) {

        int lives = 5;
        lives =  lives - 1;
        System.out.println(lives);

        lives--;
        System.out.println(lives);

        lives++;
        System.out.println(lives);

        //postfija
        int gifts = 100 + lives++;
        System.out.println(gifts);

        //prefijo
        int regalo = 100 + ++lives;
        System.out.println(regalo);


    }
}
