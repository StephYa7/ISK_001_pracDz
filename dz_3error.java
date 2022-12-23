import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class dz_3error {


    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] c = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        stackOverflowError(a, b);
        fileNotFoundException();
        arrayIndexOutOfBoundsException(c);
    }

    public static int stackOverflowError(int a, int b) {
        return stackOverflowError(a, b);
    }

    public static void fileNotFoundException() {
        FileReader reader = new FileReader("menyanet.txt");
    }

    public static void arrayIndexOutOfBoundsException(int[] c) {
        for (int i = 0; i < 22; i++) {
            System.out.println(c[i]);
        }
        }
    }

