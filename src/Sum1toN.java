import java.nio.channels.Pipe;
import java.util.Scanner;
// Program do wyypisania sumy luiczb od 1 do n
public class Sum1toN {
    public static void main(String[] args) {
        System.out.print("n = " );
        Scanner scanner = new Scanner(System.in); // klasa Scanner powoduje, że możemy wskazać miejsce pobierania danych
        // w tym przypadku dane pobieram z klasy System oraz miejsca - obiektu input czyli z klawiatury
        int n = scanner.nextInt(); // do zmiennej n wpiszemy to co użytkownik poda - spodziewamy się liczby całkowitej
        int number = 1;
        int sum = 1;

        System.out.print("Suma 1");
        while (number < n) {
            number++;
            sum += number;
            System.out.print(" + " + number);

        }
        System.out.println(" = " + sum);


    }
}
