public class DayCounter1 {
    public static void main(String[] args) {

        int yearIn = 2016;
        int monthIn = 1;

        if (args.length > 0) {
            monthIn = Integer.parseInt(args[0]);
        }
        if (args.length > 1) {
            yearIn = Integer.parseInt(args[1]);
        }
        System.out.print(monthIn + "/" + yearIn);
        System.out.println(" ma " + countDays(monthIn, yearIn) + " dni. "); // umieszczam
                // tu swoją poniższą metodę countDays

    }
    // Zadaniem jest policzenie ilości dni w poszczególnych miesiącach
    // poza metodą main musimy zdefiniować własną metodę narzędziową
    // to musi być metoda statyczna, która zwróci nam ilość dni
    // będzie int, będzie się nazywała countDays i będzie przyjmowała
    // następujące argumenty: typu int parametr month i typu int parametr year

    // TODO zaimplementować metodę
    static int countDays(int month, int year) {
        return 0; // będzie musiałą coś zwracać - na razie 0

    }



}
