public class Lab7BinConv {
    public static void main(String[] args) {
        String binary = "1101110101010101101111111"; // 1*2^0 + 0*2^1
        Long result = 0L;

        // 1  1  0  1 - liczba binarnie
        // 0  1  2  3 - indeks (i) bieżący
        // 3  2  1  0 - ale potrzebujemy indeks odwrotny
        //              czyli od długości odejmujemy 1 i odejmujemy indeks bieżący (długość - 1 - i)
        // (4-1-0=3), (4-1-1=2); (4-1-2=1), (4-1-3=0) - reversIndex

        // teraz trzeba zrobic pętlę i pętla będzie musiała chodzić tyle razy ile jest znaków w ciągu

        for (int i = 0; i < binary.length(); i++) {
            int reversIndex = binary.length() - 1 - i;
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);
            // 1*2^0 + 0*2^1 + 1*2^2 + 1*2^3 ... = 1+0+4+8 = 13
            result += bit * (long)Math.pow(2, i);
        }
        System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie.");
        // Sprawdzenie
        System.out.println();
        System.out.println(binary);
        System.out.println(Long.toBinaryString(result));


    }
}
