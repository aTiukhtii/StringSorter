import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringSorterTest {
    private static StringSorter stringSorter;

    @BeforeAll
    static void beforeAll() {
        stringSorter = new StringSorter();
    }

    @Test
    void sortStrings() {
        List<String> input = Arrays.asList("apple", "banana", "grape", "avocado", "cherry");
        String exceptionChar = "a";

        List<String> expected = Arrays.asList("banana", "cherry", "grape", "avocado", "apple");
        List<String> result = stringSorter.sortStrings(input, exceptionChar);

        assertIterableEquals(expected, result);
    }

    @Test
    void sortString_AllException() {
        List<String> input3 = Arrays.asList("zebra", "zoo", "zeppelin");
        List<String> expected3 = Arrays.asList("zebra", "zeppelin", "zoo");
        assertEquals(expected3, stringSorter.sortStrings(input3, "z"));
    }
}