public class Task_002 {
    public static void main(String[] args) {
        int[][] array = {{0, 1, 0}, {0, 1, 1}, {0, 1, 1}};
        System.out.println(summArray(array));
    }

    public static int summArray(int[][] array) {
        int sum = 0;

        if (!isQuadro(array)) {
            throw new RuntimeException("neKvadrat");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    throw new RuntimeException("Ne0101010101010101010101");
                }
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static boolean isQuadro(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != array.length) {
                return false;
            }
        }
        return true;
    }
}
