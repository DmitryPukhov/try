package dmitrypukhov;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by dpukhov on 05.12.16.
 */
public class MergeSortTest {

    @Test
    public void testSort_3elements() throws Exception {
        System.out.println("Test");

        int[] unsorted = new int[] {3,2,1};
        System.out.printf("Unsorted: %s", Arrays.toString(unsorted)).println();

        int[] sorted = new MergeSort().sort(unsorted);
        System.out.printf("Sorted: %s", Arrays.toString(sorted)).println();




    }


}