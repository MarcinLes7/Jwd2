public class Loops4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println(i + " " + j); // tu mamy pętlę w pętli
            }
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println(i + " " + j);
                break; // to po każdym wykonaniu pętli wewnętrznej nastepuje jej przerwanie i rozpoczęcie od
                    // nowa pętli wyższego rzedu,
            }
        }

        System.out.println();

        out: for (int i = 0; i < 10; i++) { // jeżeli nazwiemy sobie petle zewnętrzną np. out
            for (int j = 0; j < 15; j++) {
                System.out.println(i + " " + j);
                break out; // i podamy nazwę pętli zewnętrznej, to break przerwie nam działanie pętli zewnętrznej


            }

        }





    }
}
