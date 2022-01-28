public class TestArrayList {
    public static void main(String [] args) {
        MyArrayList arrayList = new MyArrayList();
        for (int i = 0; i < 40; i++) {
            arrayList.add(i);
        }
        System.out.print(arrayList);
        System.out.println();
        arrayList.remove(10);
        System.out.println(arrayList);
        MyArrayList second = new MyArrayList();
        second.from(new int []{1, 2, 3, 4, 5});
        System.out.println(second);
    }
}
