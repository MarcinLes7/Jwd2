import java.util.Scanner;

public class Lab7Matrix {
    public static void main(String[] args) {

        int n = 3;
        System.out.println("n = " + n + " matrix");
        System.out.println("------------");

        for (int i = 0; i <=  n ; i++) { // podczas pierwszego obiegu pętli pierwszej (obieg nr 0)
            for (int j = 0; j <= n ; j++) { // zostaną wykonane wszystkie obiegi pętli nr 2 (cztery obiegi)
                System.out.println("" + i + j); // zostaną wyświetlone wartości i (0 dla pierwszego obiegu) oraz j (0, 1, 2 ,3)
                // następnie zostanie zwiększona wartość i oraz j i przyrównana do warunku, jezeli spełnia to znów wykonają się obiegi
                System.out.println(i + j); // a tu te wartości sie dodadzą
            }
            System.out.println();

        }
    }
}
