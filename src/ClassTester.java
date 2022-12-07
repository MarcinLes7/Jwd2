public class ClassTester {
    int i; // to jest zmienną egzemplarza (pole klasy)
           // zmienna ezemplarza musi być definiowana w tym miejscu, w ciele klasy
          // ona co prawda zadziała jakby i była na dole (poza) ale tak się nie robi
    static int j = 2; // zmienna klasowa statyczna - jest wspólna dla wszystkich obiektów (pole statyczne)
    // tworze poniżej metodę publiczną

    public int change() { // publiczna metoda zwraca wartości int nazywa się change,
        // nie pobiera żadnych argumentów ale w ciele swoim definjuje zmienną int k
        int k = 7; // zmienna lokalna bo jest zdefiniowana w ciele metody
        return i + (k * j); // zwraca takie wyrażenie
        // w każdym razie nei da się wywołać zmiennej lokalnej k poza ciałem tej metody
    }

    public static void main(String[] args) {
        // metoda uruchomieniowa main musi być public static void main(String[] args)
        // inaczej sie nie da jej uruchomić

        // System.out.println(k); // nei da się wywołać zmiennej lokalnej k
        // System.out.println(i); // zmiennej i tez się nie wywoła bo nie jest statyczna a to pole jest statyczne






    }
}

// poza klasą ClassTester mogę definiuje inną klasę, w jednym pliku może istnieć kilka
// klas ale tylko jedna może być klasa publiczną. ta klasa na razie nic nie robi
class A {}
