import java.util.ArrayList;

public class ALQueue implements Queue {
    private ArrayList<Integer> dataList;
    private int size;

    public ALQueue() {
        this.dataList = new ArrayList<>();
        this.size = 0;
    }

    @Override
    public int peek() {
        if (this.size == 0) {
            return -1;
        }
        return this.dataList.get(0);
    }

    @Override
    public boolean offer(int value) {
        this.dataList.add(value);
        this.size += 1;
        return true;
    }

    @Override
    public int poll() {
        return this.dataList.remove(0);
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        StringBuilder toBuild = new StringBuilder();
        for (int j = this.dataList.size() - 1; j >= 0; j--) {
            toBuild.append(this.dataList.get(j).toString()).append(' ');
        }
        return toBuild.toString();
    }
}
