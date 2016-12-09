package dmitrypukhov;

import dmitrypukhov.Java8Sort;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

/**
 * Created by dima on 12/8/16.
 */
public class Java8SortTest {


    @Test
    public void testSortIgnoreCase() throws Exception {
        System.out.println("Java8SortTest.testSortIgnoreCase");

        String[] unsorted = new String[] {"3", "2", "1"};
        System.out.printf("Unsorted: %s", Arrays.toString(unsorted)).println();

        String[] sorted = new Java8Sort().sortIgnoreCase(unsorted);
        System.out.printf("Sorted: %s", Arrays.toString(sorted)).println();

    }

    @Test
    public void testSortBySize() throws Exception {
        System.out.println("Java8SortTest.testSortBySize");

        String[] unsorted = new String[] {"3", "2", "1"};
        System.out.printf("Unsorted: %s", Arrays.toString(unsorted)).println();

        String[] sorted = new Java8Sort().sortBySize(unsorted);
        System.out.printf("Sorted: %s", Arrays.toString(sorted)).println();

    }
}