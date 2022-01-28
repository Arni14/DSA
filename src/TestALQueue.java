public class TestALQueue {
    public static void main(String[] args) {
        ALQueue queue = new ALQueue();
        for (int i = 1; i < 11; i++) {
            queue.offer(i);
        }
        System.out.println(queue);
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.poll() + " ");
        }
    }
}
