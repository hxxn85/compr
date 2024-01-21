package compr;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortTest {
    @DisplayName("Insertion sort")
    @Test void insertion() {
        List<Integer> list = IntStream.range(1,100).boxed().collect(Collectors.toList());
        int[] orderedArray = list.stream().mapToInt(i -> i).toArray();
        Collections.shuffle(list);
        int[] unorderedArray = list.stream().mapToInt(i -> i).toArray();

        assertTimeout(Duration.ofMillis(1000), () -> Sort.insertion(unorderedArray));
        assertArrayEquals(orderedArray, unorderedArray);
    }

    @DisplayName("Quick sort")
    @Test void quick() {
        List<Integer> list = IntStream.range(1,100).boxed().collect(Collectors.toList());
        int[] orderedArray = list.stream().mapToInt(i -> i).toArray();
        Collections.shuffle(list);
        int[] unorderedArray = list.stream().mapToInt(i -> i).toArray();

        assertTimeout(Duration.ofMillis(1000), () -> Arrays.sort(unorderedArray));
        assertArrayEquals(orderedArray, unorderedArray);
    }
}
