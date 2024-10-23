public class Test {

    public static void main(String[] args) {
        var queue = new Queue<Integer>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
        var list = new DoubleLinkedList<Character>('h','e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!');

        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.toString());


        System.out.println(list.toString());
    }
}
