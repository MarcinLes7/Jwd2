public class ArraysTester4 {
    public static void main(String[] args) {
        // tablice wielowymiarowe i iterowanie po tablicach wielowymiarowyxch

        String[] dogs = {"Burek", "Pluto", "Łajka"}; // robie tablicę imion psów
        String[] people = {"Ania", "Wojtek", "Dorota", "Marek", "Tomek"}; // kolejna tablica imion ludzie

        String[][] names = {dogs, people}; // tworzę tablicę names złożóą z tych dwoch poprzenich tablic

        System.out.println(names[0][0]); // jak chce zobaczyc co jest w indeksie 0 i 0
        System.out.println(names[1][1]); // jak chce zobaczyć co jest w indeksie 1 i 1

        System.out.println("-----");

        // a jak hce wylistowac wszystkie elementy tablicy to potrzebuję pętli najlepiej for

        for (int i = 0; i < names.length; i++) { // robimy iterację po tablicy zewnętrznej (długość) - iteracja po wszystkich elementach tablicy tablic
            for (int j = 0; j < names[i].length; j++) { // następnie wypisujemy zawartośc tablicy wewnętrznej, tej, która jest iterowana - używam indeksu z tablicy zewnętrznej
                System.out.print(names[i][j] + " "); // powyższe tablice moga bycniesymetryczne
            }
            System.out.println(); // tu robimy łamanie linii po każdym wierszu
            
        }
    }
}
