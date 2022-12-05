import java.awt.*;

public class ArraysTester {
    public static void main(String[] args) {
        String[] requests;
        Point[] points;
        float[] donations;

        int[] tmp = new int[99]; // zadeklarowaliśmy, że tablica pomieści 99 elementów, ale licząc od 0 element 99 to jest 98
        tmp[0] = 1;
        tmp[1] = 5;
        // tmp[99] = 100; // błąd dopiero wystąpi po uruchomieniu programu bp jest za dużo
        tmp[98] = 100;

        System.out.println(tmp[1]);
        System.out.println(tmp.length); // jaka jest długość tablicy? ile jest elementów tablicy

        // jak łatwiej inicjalizowac tablicę?
        int[] n = {1, 2, 3, 4, 5, 6};
        System.out.println(n[5]);


    }
}
