import java.util.ArrayList;
import java.util.Collections;

public class ALStack implements Stack {
    private ArrayList<Integer> dataList;
    private int currPos;

    public ALStack() {
        this.dataList = new ArrayList<>();
        this.currPos = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.currPos == 0;
    }

    @Override
    public int peek() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.dataList.get(this.currPos - 1);
    }

    @Override
    public int pop() {
        int value = this.dataList.remove(this.currPos - 1);
        this.currPos -= 1;
        return value;
    }

    @Override
    public void push(int value) {
        this.dataList.add(value);
        this.currPos += 1;
    }

    @Override
    public int search(int value) {
        return Collections.binarySearch(this.dataList, value);
    }
}
