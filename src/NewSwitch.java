public class NewSwitch {
    public static void main(String[] args) {
        String str = "trzy";
        int number;

        switch (str) {
            case "jeden":
            case "jedynka":
                number = 1;
                break;
            case "dwa":
            case "dwójka":
                number = 2;
                break;
            case "trójka":
            case "trzy":
                number = 3;
                break;
            default:
                number = 0;
        }
        System.out.println(number);
    }
} // generalnie jest ciekawa konstrukcja al emoże lepiej byłoby cos uprościć
// i wówczas wprowadzono wersję uproszczoną wyrażeniową
