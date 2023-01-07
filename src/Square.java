import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.print("i = ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double square = Math.sqrt(i);
        System.out.println("Pierwiastek kwadratowy z " + i + " = " + square);

    }
}
