public class NewSwitch2 {
    public static void main(String[] args) {
        String str = "trzy";
        int number;

        number = switch (str) {
            case "jeden":
            case "jedynka":
                yield 1;
            case "dwa":
            case "dwójka":
                yield 2;
            case "trójka":
            case "trzy":
                yield 3;
            default:
                yield 0;
        };
        System.out.println(number);
    }
} // to jest uproszczenie wersji pierwszej ale jest jeszcze większe uproszczenie w wersji nr 3
