public interface Queue {

    /**
     * Offers value to the queue and adds it to the back.
     * @param value the value to add.
     * @return whether it was successfully added under capacity restrictions.
     */
    boolean offer(int value);

    /**
     * Polls the value from the queue and removes it.
     * @return the value emitted from the queue.
     */
    int poll();

    /**
     * Returns the top most value of the queue without removal.
     * @return the top most value.
     */
    int peek();

}
