public class Switch {
    public static void main(String[] args) {
        // instrukcja switch działa na następujących typach
        // byte i Byte
        // short i Short
        // int i Integer
        // char i Character
        // enum
        // String

        // Instrukcja, ktra wystawia uczniowi odpowienic opis do oceny

        char grade = 'A';

        switch (grade) {
            case 'A': // przypadek oceny A
                System.out.println("Wspaniale"); // instrukcja
                break; // musi być zawsze break po tym
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'D':
                System.out.println("Mogło byc lepiej");
                break;
            default: // opcja do której nie pasuje żaden powyższy przypadek
                System.out.println("Rozważ oszukiwanie");
        }

        char grade1 = 'D';
        if (grade1 == 'A') {
            System.out.println(grade1 + " Wspaniale");
        } else if (grade1 == 'B') {
            System.out.println(grade1 + " Dobrze");
        } else if (grade1 == 'C') {
            System.out.println( grade1 + " Mogło być lepiej");
        } else {
            System.out.println(grade1 + " Rozważ oszukiwanie");
        }

        System.out.println("-------");

        // a co się stanie w przypadku jeśli zapomnimy "break"
        // wówczas zstana wykonane wszystkie "jeżeli"
        // czasami jest to pożądane ale nie jeśli chcemy
        // zeby wykonywało tylko dla jednego rpzypadku
        char grade2 = 'A';

        switch (grade2) {
            case 'A': // przypadek oceny A
                System.out.println("Wspaniale"); // instrukcja
            case 'B':
                System.out.println("Dobrze");
            case 'D':
                System.out.println("Mogło byc lepiej");
            default: // opcja do której nie pasuje żaden powyższy przypadek
                System.out.println("Rozważ oszukiwanie");
        }
        // ważne jeszcze jest, że nie musi to być wszystko po kolei
        // może być całkowiecie niepokolei







    }

}
