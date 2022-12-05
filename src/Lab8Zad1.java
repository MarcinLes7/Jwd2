public class Lab8Zad1 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 6, 6, 7, 2, 0, 6, 2, 2, 2, 2, 9, 9, 6, 5}; // tworzymy tablicę z cyframi
        int[] counters = new int[10]; //tworzymy tablicę, któa ma tyle elementów ile tablica wyżej
        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;
        }
        int mostFrequent = 0;

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;
            }

        }
        System.out.print("Najczęściej występująca cyfra jest  cyfra " + mostFrequent);
        System.out.println(", wystąpiła " + counters[mostFrequent] + " razy");


/*
        for (int i : counters) {
            System.out.println(i); // zlicza ile mam danych cyfr
*/

        }
    }

