import java.awt.*;

public class ArraysTester2 {
    public static void main(String[] args) {
        Point[]  markups = {new Point(1,5), new Point(0,3), new Point(1,1)}; // tablica punktów, w liczbie
                // mnogiej s to znaczy że to jest agregacja punktów a nie jeden. tablica zawiera 3 elementy typu Point
                // są to elementy typu referencyjnego i tablica jest też typu referencyjnego
        String[] titles = {"Pan", "Pani", "Państwo", "Panna", "Doktor"};

        Point p = new Point(100, 100);
        markups[0] = p;
        markups[1] = markups[0];
        markups[2] = markups[1]; // w takim wypadku zakładamy że cała tabliza wypełniona jest punktami 100x100
                // sprawdzamy
        System.out.println(markups[0]);
        System.out.println(markups[1]);
        System.out.println(markups[2]);

        p.x = 200;  // biorę zmienną p iwywołam na niej wartośc x i podstawię sobie tu wartość 200 - nie odwopłuje się
                    // do tablicy ale do punktu
                    // wty switlam sobioe jeszcze raz
        System.out.println("--------");

        System.out.println(markups[0]);
        System.out.println(markups[1]);
        System.out.println(markups[2]);

    }
}
