import java.util.Arrays;

public class MyArrayList {

    static int INIT_SIZE = 20;
    private int currSize;
    private int[] backingArray;
    private int currPos;

    public MyArrayList() {
        this.currSize = INIT_SIZE;
        this.currPos = 0;
        this.backingArray = new int[this.currSize];
    }

    /**
     * From our ArrayList, get the ith element.
     * @param i the index at which we want the element.
     * @return the value at index i.
     */
    public int get(int i) {
        if (i < 0 || i >= this.currSize) {
            throw new IllegalArgumentException("The index requested is out of bounds");
        }
        return this.backingArray[i];
    }

    /**
     * Add to the very end of our ArrayList.
     * @param value the value we want to add to the end of the ArrayList.
     */
    public void add(int value) {
        // If we run out of capacity, double it.
        if (this.currPos >= this.currSize) {
            this.backingArray = Arrays.copyOf(this.backingArray, this.currSize * 2);
            this.currSize *= 2;
        }
        // Proceed as normal
        this.backingArray[this.currPos] = value;
        this.currPos += 1;
    }

    /**
     * Remove the element at index i in the ArrayList.
     * @param i the index at which we want to remove from.
     */
    public void remove(int i) {
        if (i == this.currSize - 1) {
            this.backingArray[i] = 0;
            this.currPos -= 1;
            return;
        }
        // Move all elements of backingArray[i + 1:] back to backingArray[i:]
        // and shift the currPos back by 1.
        for (int j = i + 1; j < this.currPos; j++) {
            this.backingArray[j - 1] = this.backingArray[j];
        }
        this.backingArray[this.currSize - 1] = 0;
        this.currPos -= 1;
        return;
    }

    /**
     * Return the size of this ArrayList.
     * @return the size
     */
    public int size() {
        return this.currPos;
    }

    public void from(int[] arr) {
        for (int i = 0; i < this.currSize; i++) {
            this.backingArray[i] = 0;
            this.currPos = 0;
        }
        for (int value : arr) {
            this.add(value);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            stringBuilder.append(this.get(i));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
