package masive;

public class Multihacks {
    public static void main(String[] args) {
        int[][] arrays = {{3, 2, 1},
                {1, 2, 3},
                {5, 4, 3, 1},
                {2, 8, 4, 1},};
        for (int x = 0; x < arrays.length; x++) {
            for (int j = 0; j < arrays[x].length; j++) {
                System.out.println(arrays[x][j] + " ");
            }
            System.out.println();
        }
    }
}
