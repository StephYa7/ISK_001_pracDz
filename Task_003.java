public class Task_003 {
    public static void main(String[] args) {
        Integer[] arr = {3, 2, 4, null, null, 2, null, 3, 6, null, 6};
        System.out.println(arr);
        checkArray(arr);

    }

    public static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("fgrt " + i + " rtert");
            }
        }
    }
}
