public class Stack<T> {
    private final DoubleLinkedList<T> list;

    public Stack() {
        list = new DoubleLinkedList<>();
    }

    public Stack(T data) {
        list = new DoubleLinkedList<>(data);
    }

    public void push(T data) {
        list.add(data);
    }

    public T pop() {
        return list.removeGet(list.size() - 1);
    }

    public T peek() {
        return list.get(list.size() - 1);
    }
}
