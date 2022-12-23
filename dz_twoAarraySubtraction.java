import java.util.Arrays;

public class dz_twoAarraySubtraction {
    public static void main(String[] args) {
        int[] first = {2, 3, -88};
        int[] second = {1, 222, 0};
        System.out.println(Arrays.toString(arrSubstact(first, second)));

    }
    public static int[] arrSubstact(int[] first, int[] second) {
        if (first.length != second.length) {
            throw new RuntimeException("Массивы разной длинны");
        }
        int[] result = new int[first.length];
        for (int i = 0; i < result.length; i++) {
            if(second[i] ==0){
                throw new RuntimeException("На ноль делить нельзя");
            }
            result[i] = first[i] / second[i];
        }
        return result;
    }
}
