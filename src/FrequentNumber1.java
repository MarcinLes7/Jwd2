public class FrequentNumber1 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,5,4,4,5,4,3,4,5,4,3,4,4,4,4,4,3,3,4,4,3,3,4,3,3,3,3,3,3,4};
        int[] counters = new int[10]; // tablica pomocnicza, ma tyle elementów ile jest
         // cyfr - cyfr jest 10 - to nie jest ilość elementów tablicy
        // i to musi byc przez new int ponieważ inaczej się nie odniesie do poprzedniej tablicy
        // gdybyśmy liczyli ile liczb czy coś innego to można użyć [Integer.MAX_VALUE],

        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++; // za każdym razem jak napotkamy daną  wartość tablicy to
                            // zwiększamy licznik counter. counters dla indeksu,
                            // który jest wartością naszej tablicy robimy inkrementację
        }
/*        // sprawdzenie co zostało zapisane w tablicy counters
        for (int i : counters ) {
            System.out.println(i); // jak czytać wynik: zer mam zero, jedynek mam jedną, dwójek mam trzy
        }*/

        // jaka jest najczęściej wystepująca liczba
        int mostFrequent = 0;

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) { // jeżeli liczba która siedzie w liczniku będize większa od counters most freq
                mostFrequent = i;
            }

        }
        System.out.print("najczęsciej występująca cyfrą jest cyfra " + mostFrequent);
        System.out.println(". Wystapiła " + counters[mostFrequent] + " razy");





    }
}

