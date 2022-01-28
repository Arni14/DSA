import java.util.LinkedList;
import java.util.List;

public class MapEntry {
    private List<KeyValue> entries;

    public MapEntry() {
        this.entries = new LinkedList();
    }

    public List<KeyValue> getEntries() {
        return this.entries;
    }

    public void addEntry(KeyValue pair) {
        this.entries.add(pair);
    }

    public void removeEntry(KeyValue pair) {
        this.entries.remove(pair);
    }
}
