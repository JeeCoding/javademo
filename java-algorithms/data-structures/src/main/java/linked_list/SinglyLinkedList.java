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

    public void unLink(E e) {
        if (head == null) {
            throw new NullPointerException("The list is empty.");
        }
        if (e == null) {
            return;
        }
        if (head.item.equals(e)) {
            head = head.next;
            size--;
            return;
        }
        Node<E> current = head;
        while (current.next != null) {
            if (current.next.item.equals(e)) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    @Override
    public E get(int index) {
        return node(index).item;
    }

    @Override
    public void printLinkList() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
        } else {
            Node<E> node = head;
            while (node != null) {
                System.out.print(node.item + " ");
                node = node.next;
            }
            System.out.println();
        }
    }

    Node<E> node(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<E> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
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
        String s1 = linkFirst.get(3);
        System.out.println(s1);
        linkFirst.unLink("a");
        linkFirst.printLinkList();

        SinglyLinkedList<String> linkLast = new SinglyLinkedList<>();
        linkLast.linkLast("a");
        linkLast.linkLast("b");
        linkLast.linkLast("c");
        linkLast.linkLast("d");
        linkLast.printLinkList();
        String s2 = linkLast.get(3);
        System.out.println(s2);
        linkLast.unLink("d");
        linkLast.printLinkList();
    }
}
