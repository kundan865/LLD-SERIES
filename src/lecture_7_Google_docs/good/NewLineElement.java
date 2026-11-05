package lecture_7_Google_docs.good;

// NewLineElement represents a line break in the document.
public class NewLineElement implements DocumentElement {
    @Override
    public String render() {
        return "\n";
    }
}
