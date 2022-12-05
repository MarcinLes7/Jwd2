public class Array3DPrinter1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[][] c = {a, b};
        int[][] d = {{7, 8, 9}}; // myk jest w tym, że do tablicy 3-elementowej moge wrzucić tylko tablice 2-elementowe
        int[][][] e = {c, d};

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println("c[" + i + "][" + j + "] = " + c[i][j]);
            }
        }

        System.out.println("------");

        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                for (int k = 0; k < e[i][j].length; k++) {
                    System.out.println("e["+ i +"]["+ j +"]["+ k +"] = " + e[i][j][k]);

                }

            }

        }
    }
}
