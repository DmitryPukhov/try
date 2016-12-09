package dmitrypukhov;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by dima on 12/8/16.
 */
public class Java8Sort {

    /**
     * Sort samples
     */
    public void sort() {
        // Sorting of parallel produce mixed parts

        int[] arr = new Random().ints(100,0,100).toArray();
        System.out.println("Sorting parallel");
        IntStream.of(arr).parallel().sorted().forEach(i -> {
            System.out.printf("%d;", i);
        });

        System.out.println("Sorting sequential");
        // Could use just arr.sorted()
        IntStream.of(arr).sequential().sorted().forEach(i -> {
            System.out.printf("%d;", i);
        });

    }

    public String[] sortIgnoreCase(String[] arr) {
        return Stream.<String>of(arr)
                .sorted(String::compareToIgnoreCase)
                .toArray(String[]::new);
    }

    public String[] sortBySize(String[] arr) {
        return Stream.of(arr)
                .sorted((s1,s2) -> Integer.compare(s1.length(), s2.length()))
                .toArray(String[]::new);
    }

}
