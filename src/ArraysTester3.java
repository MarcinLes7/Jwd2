public class ArraysTester3 {
    public static void main(String[] args) {

        int[][][] multiDimArr = {{{1}}, {{1}, {3}}};

        int[] arr = {1, 2, 3, 5, 12, 17};

        // z pętli for korzystam gdy chcę wyciągnać iterator
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i + " , arr[" + i + "] = " + arr[i]);
        }

        System.out.println("------");
        // pętla enhanced for - ta konstrukcja pętli jest lepsza dla tablic bo nei trzeba wyszczegolniać elementów
        // to jest prostsza wersja tylko że nie da się wyciągnąć iteratora w tej wersji - zalezo co chcę

 /*       for (int a : arr) {
            System.out.println("a = " + a + " , arr[" + a + "] = " + arr[a]); // uwaga - tak nie da się zrobić bo
                             // wyjdzie nieprawidlowo, bo nie ma podanego iteratora. To rzeba robic inaczej
            System.out.println(a);
        }*/

        System.out.println("-----");
        for (int b : arr) { // int to jest typ elementu który wybiera, b - to nazywam sobie to jak chce, arr - to nazwa tablicy
                            // nie musze podawac ile ma elementów,
            System.out.println(b);
        }




     }
}
