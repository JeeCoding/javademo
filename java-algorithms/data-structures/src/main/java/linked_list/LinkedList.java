package linked_list;

public class LinkedList<E> implements List<E> {

    transient int size = 0;

    transient Node<E> first;

    transient Node<E> last;


    void linkFirst(E e) {
        Node<E> newNode = new Node<>(null, e, first);
        size++;
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
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void printLinkList() {

    }

    public static void main(String[] args) {
        String a = "a";
        Node<String> node1 = new Node<>(null, a, null);

        String b = "b";
        Node<String> node2 = new Node<>(null, b, node1);

        String c = "c";
        Node<String> node3 = new Node<>(null, c, node2);


        System.out.println(node2);
    }

    private static class Node<E> {
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


