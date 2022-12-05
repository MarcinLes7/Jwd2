public class Lab8Zad2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[][] c = {a, b};


        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
               System.out.println("arr[" + i + "]" + "[" + j + "] = " + c[i][j]);
                }
            }

        }

    }

