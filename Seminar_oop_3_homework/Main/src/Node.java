public class Node<T> {
    T data;

    Node<T> next;

    @Override
    public String toString() {
        return String.format("Node %s", data);
    }

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
