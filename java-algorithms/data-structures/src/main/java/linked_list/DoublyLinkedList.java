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

    public void linkLast(E e) {
        Node<E> l = last;
        Node<E> eNode = new Node<>(l, e, null);
        last = eNode;

        if (l == null) {
            first = eNode;
        } else {
            l.next = eNode;
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
    public boolean remove(E e) {
        if (e == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unLink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (e.equals(x.item)) {
                    unLink(x);
                    return true;
                }
            }
        }
        return false;
    }

    E unLink(Node<E> x) {
        E element = x.item;
        Node<E> p = x.prev;
        Node<E> n = x.next;

        if (p == null) {
            first = n;
        } else {
            p.next = n;
            x.prev = null;
        }

        if (n == null) {
            last = p;
        } else {
            n.prev = p;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    @Override
    public E get(int index) {
        return node(index).item;
    }

    @Override
    public void printLinkList() {
        if (size == 0) {
            System.out.println("Empty List");
        } else {
            Node<E> x = first;
            while (x != null) {
                System.out.print(x.item + " ");
                x = x.next;
            }
            System.out.println();
        }
    }

    Node<E> node(int index) {
        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
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

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.printLinkList();
        list.remove(2);
        list.printLinkList();
        System.out.println(list.get(2));

    }
}
