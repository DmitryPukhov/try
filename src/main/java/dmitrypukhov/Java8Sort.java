package dmitrypukhov;

import java.util.Collections;
import java.util.stream.Stream;

/**
 * Created by dima on 12/8/16.
 */
public class Java8Sort {

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
