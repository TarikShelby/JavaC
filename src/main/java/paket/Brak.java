package paket;

public class Brak {
    public static void main(String[] args) {
        int x = 0;
        while (true) {
            if (x == 150000)
                break;
            System.out.println(x);
            x++;
        }
        System.out.println("мы набрали всех людишек");
    }
}
