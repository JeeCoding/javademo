package linked_list;

public class CircularLinkedList<E> implements List<E> {

    transient int size = 0;
    transient Node<E> head;
    transient Node<E> tail;

    public CircularLinkedList() {
    }

    void linkFirst(E e) {
        Node<E> newNode = new Node<>(e, head);

        if (head == null) {
            newNode.next = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
        }
        head = newNode;
        size++;
    }

    void linkLast(E e) {
        Node<E> newNode = new Node<>(e, head);
        if (head == null) {
            newNode.next = newNode;
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
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
        unLink(e);
        return true;
    }

    void unLink(E e) {
        if (head == null) {
            return;
        }
        if (e == null) {
            return;
        }

        Node<E> current = head;
        Node<E> prev = null;

        do {
            if (current.item.equals(e)) {
                // 删除头节点
                if (current == head) {
                    if (size == 1) {
                        head = null;
                        tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;  // 保证尾节点仍然指向头节点
                    }
                }
                // 删除尾节点
                else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                }
                // 删除中间节点
                else {
                    prev.next = current.next;
                }

                size--;
                return;  // 删除成功后退出
            }

            prev = current;
            current = current.next;
        } while (current != head);
    }

    @Override
    public E get(int index) {
        return node(index).item;
    }

//    Node<E> node(int index) {
//        if (index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//        }
//
//        Node<E> current = head;
//        for (int i = 0; i < index; i++) {
//            current = current.next;
//        }
//        return current;
//    }

    Node<E> node(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size);
        }

        Node<E> current;

        // 根据索引位置选择遍历方向
        if (index < (size >> 1)) { // 前半部分，从头开始遍历
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else { // 后半部分，从尾开始遍历
            current = tail;
            for (int i = size; i > index + 1; i--) { // 向前倒退，保持循环特性
                Node<E> temp = head;
                while (temp.next != current) { // 倒退一步
                    temp = temp.next;
                }
                current = temp; // 反向迭代
            }
        }

        return current;
    }

    @Override
    public void printLinkList() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node<E> temp = head;
            while (temp.next != head) {
                System.out.print(temp.item + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.item);
        }
    }

    private static class Node<E> {
        private final E item;
        private Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        list.remove(5);
        list.printLinkList();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
    }
}
