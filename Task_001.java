public class Task_001 {
    static int[] array;

    public static void main(String[] args) {
        int element = 5;
        System.out.println(findElement(array, element));
    }

    private static int findElement(int[] array, int element) {
        int min = 5;
        if (array == null) return -3;
        if (array.length < min) return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) return i;
        }
        return -2;
    }
}
