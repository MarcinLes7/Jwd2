public class ClassTester {
    int i; // to jest zmienna egzemplarza (pole klasy). Zmienna egzemplarza musi być definiowana w tym miejscu,
          // w ciele klasy - ona co prawda zadziała jakby i była na dole (poza), ale tak się nie robi
    static int j = 2; // zmienna klasowa statyczna - jest wspólna dla wszystkich obiektów (pole statyczne)


    // tworze poniżej metodę publiczną
    public int change() { // publiczna metoda zwraca - wartości int i nazwałem ją change, ona nie pobiera żadnych
                         // argumentów, ale w ciele swoim definjuje zmienną int k

        int k = 7; // zmienna lokalna, bo jest zdefiniowana w ciele metody change
        return i + (k * j); // zwraca takie wyrażenie - w tatkich metodach trzeba pisac return żeby się coś wywołało
                   // w każdym razie nie da się wywołać zmiennej lokalnej k poza ciałem tej metody - po przejściu
                   // kompilatora poza ciało metody zmienna jest usuwana io jej nie ma
    }

    public static void main(String[] args) {
        // to jest metoda uruchomieniowa - main - musi być public static void main(String[] args)
        // inaczej sie nie da uruchomić żadnej aplikacji bez tej metody. W niej możemy zmieniac tylko nazwę

        // Poniżej próby wywolania zmiennych znajdujących sie poza metodą main i opis dlaczego niektórych nie
        // da się uruchomić

        // System.out.println(k); // nie da się wywołać zmiennej lokalnej k w ciele metody main. Zmianna lokalna k
                                // działa tylko w obręcie ciała tej metody

        // System.out.println(i); // zmiennej i tez się nie wywołać bo nie jest statyczna a to pole jest statyczne
                                // nie da się odwoływac z pola statyczniego do pola niestatycznego - trzeba
                               // dopiero stworzyć obiekt






    }
}

// poza klasą ClassTester mogę zdefiniować inną klasę, w jednym pliku może istnieć kilka klas, ale tylko jedna może
// być klasa publiczną. Ta klasa na razie nic nie robi

class A {}
