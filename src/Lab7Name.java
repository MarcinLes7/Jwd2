public class Lab7Name {
    public static void main(String[] args) {
        String name = "Agata"; // A=0, g=1 a potrzebujemy odwrotnie
        for (int i = name.length()-1; i >= 0; i--) {
              System.out.print(name.charAt(i));
        }
    }
}
