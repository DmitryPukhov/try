package dmitrypukhov;

import java.util.Arrays;

/**
 * The Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        System.out.println("Test");
        args.toString();

        int[] unsorted = new int[] {3,2,1};
        System.out.printf("Unsorted: %s", Arrays.toString(unsorted)).println();

        int[] sorted = new MergeSort().sort(unsorted);
        System.out.printf("Sorted: %s", Arrays.toString(sorted)).println();
    }

}

