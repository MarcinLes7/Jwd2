public class IfElse {
    public static void main(String[] args) {
        int x = 5;
        if (x > 2) {  // jeżeli x jest > od 2 to wykonaj instrukcję
            System.out.println(x + " jest większe od 2");
        }

        // to można zapisać także bez klamer, ale zawsze nalezy zapisywać
        // w klamrach

        int xx = 1;
        if (xx > 2) {
            System.out.println(xx + " jest większe od 2");
        } else {
            System.out.println(xx + " nie jest większe od 2");
        }

        int xxx = -2;
        if (xxx > 2) {
            System.out.println(xxx + " jest większe od 2");
        } else if (xxx < 2) {
            System.out.println(xxx + " jest mniejsze od 2");
        } else {
            System.out.println(xxx + " jest równe 2");
        }





    }
}
