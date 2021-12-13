package masive;

import java.util.Arrays;

public class TetsMassive {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 5, 3, 1, 8, 2, 1, 7, 9, 3, 5, 6};
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int keys = Arrays.binarySearch(array, 5);
        System.out.println(keys);
    }
}
