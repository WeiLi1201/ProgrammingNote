package akka.dt.app.java.messages;

/**
 * Created by Variant on 16/4/9.
 */
public class WordCount {
    private String word;
    private Integer count;

    public WordCount(String word, Integer count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public Integer getCount() {
        return count;
    }
}
