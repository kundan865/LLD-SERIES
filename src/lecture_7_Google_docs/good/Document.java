package lecture_7_Google_docs.good;

import java.util.ArrayList;
import java.util.List;

// Document class responsible for holding a collection of elements
public class Document {

    private final List<DocumentElement> documentElements = new ArrayList<>();

    public void addElement(DocumentElement element) {
        documentElements.add(element);
    }

    public String render() {
        StringBuilder result = new StringBuilder();
        for (DocumentElement element : documentElements) {
            result.append(element.render());
        }
        return result.toString();
    }
}
