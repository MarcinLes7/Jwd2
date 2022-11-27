public class Loops {
    public static void main(String[] args) {
        int x = 5;
        { // poczatek bloku
            int y = 10;
            y = x + y;
            System.out.println(y);

        } // koniec bloku
        // System.out.println(y); tu poza blokiem instrukcji y jest niedostępne bo jest niezdefiniowane

    }
}
