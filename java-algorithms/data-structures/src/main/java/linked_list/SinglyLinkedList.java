package linked_list;

public class SinglyLinkedList<E> implements List<E> {

    transient int size = 0;
    transient Node<E> head;

    public SinglyLinkedList() {
    }

    void linkFirst(E e) {
        head = new Node<>(e, head);
        size++;
    }

    void linkLast(E e) {
        Node<E> newNode = new Node<>(e, null);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        size++;
    }

    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    @Override
    public boolean addFirst(E e) {
        linkFirst(e);
        return true;
    }

    @Override
    public boolean addLast(E e) {
        linkLast(e);
        return true;
    }

    @Override
    public boolean remove(E o) {
        return false;
    }

    @Override
    public E get(int index) {
        return node(index).data;
    }

    @Override
    public void printLinkList() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
        } else {
            Node<E> node = head;
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println();
        }
    }

    Node<E> node(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }

        Node<E> head = this.head;
        for(int i = 0; i < index; i++){
            head = head.next;
        }
        return head;
    }

    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList<String> linkFirst = new SinglyLinkedList<>();
        linkFirst.linkFirst("a");
        linkFirst.linkFirst("b");
        linkFirst.linkFirst("c");
        linkFirst.linkFirst("d");
        linkFirst.printLinkList();
        String s1 = linkFirst.get(0);
        System.out.println(s1);

        SinglyLinkedList<String> linkLast = new SinglyLinkedList<>();
        linkLast.linkLast("a");
        linkLast.linkLast("b");
        linkLast.linkLast("c");
        linkLast.linkLast("d");
        linkLast.printLinkList();
        String s2 = linkLast.get(0);
        System.out.println(s2);
    }
}
