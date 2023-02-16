package Model;

public class Word implements Comparable<Word> {

    //
    // Data members
    //

    private String text;

    private Integer count;

    //
    // Constructors
    //

    public Word(String text, Integer count) {
        this.text = text;
        this.count = count;
    }

    //
    // Getters
    //

    public String getText() {
        return text;
    }

    public Integer getCount() {
        return count;
    }

    //
    // Overrides
    //

    @Override
    public int compareTo(Word w) {
        return this.count.compareTo(w.count);
    }

    @Override
    public String toString() {
        return "{" + text + " " + count + "}";
    }
}
