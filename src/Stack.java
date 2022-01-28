public interface Stack {

    /**
     * A function that checks whether the stack is empty.
     * @return Boolean true or false.
     */
    boolean isEmpty();

    /**
     * A function that returns the top of the stack.
     * @return the value at the top.
     */
    int peek();

    /**
     * A function that removes the top and returns it.
     * @return that value.
     */
    int pop();

    /**
     * Pushes value onto top of stack.
     * @param value to push.
     */
    void push(int value);

    /**
     * Looks for value in stack. Returns index where 0 is bottom. -1 o.w.
     * @param value to look for.
     * @return 0-based index as described.
     */
    int search(int value);
}
