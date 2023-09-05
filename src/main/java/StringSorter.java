import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {
    public List<String> sortStrings(List<String> unsortedStrings, String exceptionChar) {
        List<String> sortedStrings = unsortedStrings.stream()
                .filter(str -> !str.startsWith(exceptionChar))
                .sorted()
                .collect(Collectors.toList());

        if (sortedStrings.size() == 0) {
            return unsortedStrings.stream()
                    .filter(str -> str.startsWith(exceptionChar))
                    .sorted()
                    .toList();
        }

        List<String> exceptionStrings = unsortedStrings.stream()
                .filter(str -> str.startsWith(exceptionChar))
                .sorted(Collections.reverseOrder())
                .toList();

        sortedStrings.addAll(exceptionStrings);
        return sortedStrings;
    }
}
