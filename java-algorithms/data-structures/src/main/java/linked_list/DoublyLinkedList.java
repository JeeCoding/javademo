package linked_list;

public class DoublyLinkedList<E> implements List<E> {

    int size = 0;
    Node<E> first;
    Node<E> last;

    public DoublyLinkedList() {
    }

    public void linkFirst(E e) {
        Node<E> f = first;
        Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f != null) {
            f.prev = newNode;
        } else {
            last = newNode;
        }
        size++;
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.linkFirst(1);
        list.linkFirst(2);
        list.linkFirst(3);
        list.printLinkList();
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean addFirst(E e) {
        return false;
    }

    @Override
    public boolean addLast(E e) {
        return false;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void printLinkList() {
        if (size == 0) {
            System.out.println("Empty List");
        } else {
            while (first != null) {
                System.out.print(first.item + " ");
                first = first.next;
            }
            System.out.println();
        }
    }

    private class Node<E> {
        Node<E> prev;
        E item;
        Node<E> next;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
}
