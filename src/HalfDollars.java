public class HalfDollars {
    public static void main(String[] args) {
        int[] denver = {1_700_000, 4_600_000, 2_100_000}; // zmienna tablicowa  zawierające dane (ilość monet) wyprodukowanych w trzech kolejnych latach
        int[] philadelphia = new int[denver.length]; // tu chodzi o to, że chce mieć tablicę o takiej samej długości jak tablica denver
                                                    // i zawsze jak się zmieni tablica denver to tablica phila tez się zmieni
        int[] total = new int[denver.length]; // potrzebujemy tablice intów o takiej samej długości jak denver
        int average;  // średnia

        // zaczynamy przypiswayueni wartości dla tablicy philadelphia
        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 2_500_000;

        total[0] = denver[0] + philadelphia[0];
        total[1] = denver[1] + philadelphia[1];
        total[2] = denver[2] + philadelphia[2];
        average = (total[0] + total[1] + total[2]) / total.length;
        System.out.println("Produkcja w roku 2012: " + total[0]);
        System.out.println("Produkcja w roku 2013: " + total[1]);
        System.out.println("Produkcja w roku 2014: " + total[2]);
        System.out.println("Średnia produkcja: " + average);

        System.out.println("---------------");

        // możnma też to ładnie sformatowa
        System.out.print("Produkcja 2012: ");
        System.out.printf("%,d%n", total[0]); // %,d od decimal oraz %n czyli znak nowej linii
        System.out.print("Produkcja 2013: ");
        System.out.printf("%,d%n", total[1]);
        System.out.print("Produkcja 2014: ");
        System.out.printf("%,d%n", total[2]);

        System.out.print("Średnia Produkcja: ");
        System.out.printf("%,d%n", average);


    }
}
