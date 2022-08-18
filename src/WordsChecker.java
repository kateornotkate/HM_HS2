import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {

    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> set = new HashSet<>(List.of(text.toLowerCase().split("\\P{Alpha}+")));
        if (set.contains(word.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}