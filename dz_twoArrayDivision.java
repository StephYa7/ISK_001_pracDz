import java.util.Arrays;

public class dz_twoArrayDivision {
    public static void main(String[] args) {
        int[] first = {2, 3, 4};
        int[] second = {1, 2, 3};
        System.out.println(Arrays.toString(arrDivis(first, second)));

    }
    public static int[] arrDivis(int[] first, int[] second) {
        if (first.length != second.length) {
            throw new RuntimeException("Массивы разной длинны");
        }
        int[] result = new int[first.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = first[i] - second[i];
        }
        return result;
    }
}