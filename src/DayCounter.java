public class DayCounter { // to jest wogóle jakby wstęp opisujący
    // jak będzie działał ten program - to jest trochę szkolet tego
    // programu.
    public static void main(String[] args) { // za
        // pomocą tej tablicy w metodzie main
        // będziemy przekazywać do programu jakieś dane

        int yearIn = 2016;
        int monthIn = 1;

        // za pomocą dwóch ifów sprawdzimy czy liczba elementów w
        // tablicy w main

        if (args.length > 0) { // sprawdzamy ilość elementów w tablicy
            // czyli zmienną length, jeśli jest większa od 0
            // czyli coś w tej tablicy się znajduje to ..
            monthIn = Integer.parseInt(args[0]); // .. pobieramy numer
              // miesiąca z tablicy, ale ten znak w postaci
              // stringów musimy przetransferować na liczbę - korzystamy
              // z klasy integer która ma metodę narzędziową parsein
              // do parsowania znaków na liczbę i z niej wyciągamy
              // pierwszy element
        }
        if (args.length > 1) { // teraz sprawdzamy czy ilość elementów
            // nei jest większa od 1
            yearIn = Integer.parseInt(args[1]); // w drugim elemencie chcemy
            // mieć rok wyjściowy i chcemy element tablicy o indekcie 1


            // to znaczy całościowo jeżeli użytkownik nie podał żadnych
            // elementów do tablicy to zostaną wpisane domyślne a jeżeli podał
            // to wówczas domyślne zostaną zastąpiione tymi pobranymi

            // a na samym końcu wyświetlimy użytkownikowi program
        }
            System.out.print(monthIn + "/" + yearIn);
            System.out.println(" ma " + " dni. ");


    }
}
