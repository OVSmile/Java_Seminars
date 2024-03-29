import java.util.Iterator;

public class ListNodes<T> implements Iterable<T>{

    int size = 0;
    private Node<T> first;
    private Node<T> last;

    void addLast(T data) {
        Node<T> nextNode = new Node<>(data);
        Node<T> currentNode = first;

        if (first == null) {
            first = nextNode;
            last = nextNode;
        }else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = nextNode;
        }
        size += 1;
    }

    void addFront(T data) {
        {
            Node<T> nextNode = new Node<>(data);

            if (last == null) {
                first = nextNode;
                last = nextNode;
            }else {
                nextNode.next = first;
                first = nextNode;
            }
        }
        size +=1;
    }



    public  int getSize() { return  size; }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> iteratorNode = first;
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < getSize();
            }

            @Override
            public T next() {
                T value = iteratorNode.getData();
                iteratorNode = iteratorNode.next;
                index++;
                return value;
            }
        };
    }
}
