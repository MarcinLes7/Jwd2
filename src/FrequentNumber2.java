public class FrequentNumber2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        int[] counters = new int[1000]; // będa liczby do 1000 - to ilość elementów, które beda mogły znajdowac się w naszym zbiorze

        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;

        }
        int mostFrequest = 0;

        // co siedzi w tablicy counters? ile mamy danych cyfr
        for (int i = 0; i < arr.length; i++) {
            System.out.println("counters[" + i + "] = " + counters[i]);

        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequest]){  // 2 iteracja, i=1, mostFrequent = 0
                mostFrequest = i;                       // 3 iteracja, i=1, mostf = 1, zwieksz
            }                                           // 6 iteracja i=6, mostf = 2
        }
        System.out.print("najczęsciej występująca liczba jest liczba " + mostFrequest);
        System.out.println(". Wystapiła " + counters[mostFrequest] + " razy");
    }
}

