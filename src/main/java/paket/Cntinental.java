package paket;

public class Cntinental {
    public static void main(String[] args) {
        for (int a = 0; a < 6; a++) {
            if (a % 10 == 0) {
                continue;
            }
            System.out.println(" " + a);
        }
    }
}
