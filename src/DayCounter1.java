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
        int count = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    count = 29;
                } else {
                    count = 28;
                }
                // TODO sprawdzić logikę
                if ((year % 100 == 0) && (year % 400 != 0)) {
                    count = 28;

            }



        }
        return count; // będzie musiałą coś zwracać - na razie 0

    }



}
