import java.math.BigInteger;

public class Loops1 {
    public static void main(String[] args) {

        // wszystkie cyfry
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        // oblicz silnię, big integer to musi byc bo mogą byc duże liczbny
        int number = 5; // silnia dla 5 to jest 1*2*3*4*5
        BigInteger factorial = BigInteger.ONE; // big integer jest to typ stosowany do ogromnych liczb wiekszych
                                            // niż long, no i ta silnie na początku będzie miała wartość 1,
                                            // bo domyślnie silnia dla 1 jest = 1.
        for (int i = 1; i <= number ; i++) { // zacznij od 1, aż i będzie < lub = 1, zwiększaj i o 1
            factorial = factorial.multiply(BigInteger.valueOf(i));  // silnia to jest u nas factorial
                                    // jak pomnozyc liczbę biginteger?  mnożymy za pomoca odpowiedniej
                                    // funkcji (metody) multiply. Czyli te liczbę typu big integer mnożymy metodą
                      // multiply z inna liczba typu big integer i będzie to liczba, która bedzie zwięta
            // z normalnego inta dlatego jest valueOf(i).
        }
        System.out.printf("%d! = %s%n", number, factorial); // jak to wyswietlić? %d czyli decimal, ! to sugeruje,
                // że to jest silnia, %s - to jest string i %n czyli new line


        // wartość bitów w bajcie
        // 128 64 32 16 8 4 2 1
        // 0   0  0  0  0 0 0 0

        for (int i = 1, sum = 1; i <=128 ; i = i*2, sum+= i) {  // uwaga: po przecinku można zapodac kilka zmiennych
            System.out.printf("i= %d, sum = %d%n", i, sum);

        }




    }
}
