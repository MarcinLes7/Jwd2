public class Loops3 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) { // to jest nasza pierwotna pętla
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) { // tu jest warunek, czyli, że liczba jest nieparzysta (modulo dzielone przez 2 daje resztę),
                            // to ma jej nie wyświetlać,
                continue; // w pewnych warunkach chcemy, żeby pętla przerwała swoje działania i przeszła do następnego kroku
                          // gdyby było break toby się pętla wogóle nie wykonała w tym przypadku
            }
            System.out.print(i); // wynikiem tej pętli jest wyświetlenie tylko parzystych liczb ponieważ pętla w przypadku
            System.out.print(" ");  // liczby nieparzystaej przerywa swoje działanie i przechodzi do nastepnego kroku w pętli
       }
    }
}
