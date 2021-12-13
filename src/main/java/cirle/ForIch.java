package cirle;

import java.util.Arrays;

public class ForIch {
    public static void main(String[] args) {
        String[] array = new String[]{"Здарова", " Абдула "};
        for (String x : array) {
            x = x + x;
            System.out.println(x);

        }
    }
}
