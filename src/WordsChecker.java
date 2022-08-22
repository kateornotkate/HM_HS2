import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {

    private String text;
    private Set<String> set;

    public WordsChecker(String text) {
        this.text = text;
        this.set = new HashSet<>(List.of(text.toLowerCase().split("\\P{Alpha}+")));
    }

    public boolean hasWord(String word) {
        if (set.contains(word.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}