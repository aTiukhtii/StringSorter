import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorter {
    public List<String> sortStrings(List<String> unsortedStrings, String exceptionChar) {
        List<String> exceptionStrings = new ArrayList<>();
        List<String> sortedStrings = new ArrayList<>();

        for (String str : unsortedStrings) {
            if (str.startsWith(exceptionChar)) {
                exceptionStrings.add(str);
            } else {
                sortedStrings.add(str);
            }
        }

        if (sortedStrings.size() == 0) {
            Collections.sort(exceptionStrings);
            return exceptionStrings;
        }

        Collections.sort(sortedStrings);
        exceptionStrings.sort(Collections.reverseOrder());
        sortedStrings.addAll(exceptionStrings);
        return sortedStrings;
    }
}
