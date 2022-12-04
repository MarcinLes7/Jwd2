public class Lab7Matrix1 {
    public static void main(String[] args) {
        int n = 30;
        System.out.println("matrix n = " + n);
        System.out.println("-------------");

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3s",i + j + " "); //"%3s" - oznacza to, że operujemy na stringach i chcemy mieć 3 odstępy
                                                        // każda liczba jest wyświetlana z odstępem 3

            }
            System.out.println();

        }



    }
}
