package dmitrypukhov;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * The Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {

        IntStream arr = new Random().ints(100,0,100);
        arr.parallel().sorted().sequential().forEach(i -> {
            System.out.printf("%d;", i);
        });


        int[] unsorted = new int[] {3,2,1};
        System.out.printf("Unsorted: %s", Arrays.toString(unsorted)).println();

        int[] sorted = new MergeSort().sort(unsorted);
        System.out.printf("Sorted: %s", Arrays.toString(sorted)).println();
    }

}

