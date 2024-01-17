public class AllBoard<T> {
    public Object[] toArray() {

        Object[] result = new Object[this.size];
        int i = 0;

        for (Node<T> x = this.root; x != null; x = x.next) {
            result[i++] = x.value;
        }

        return result;
    }

    protected static class Node<T> {
        public T value;
        public Node<T> next = null;
        public Node<T> previous = null;

        public Node(T value) {
            this.value = value;
        }

//        public Node(Node<T> previous, T value, Node<T> next) {
//            this.value = value;
//            this.next = next;
//            this.previous = previous;
//        }
    }

    protected Node<T> root = null;
    protected Node<T> tail = null;
    protected int size = 0;

    public void add(T o) {
        size++;
        if (root == null) {
            root = new Node<T>(o);
            tail = root;
            return;
        }
        tail.next = new Node<T>(o);
        tail.next.previous = tail;
        tail = tail.next;
    }

    protected Node<T> getNode(int i) {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Лист пустой");
        } else if (size == 1) {
            return root;
        } else {
            if (i >= 0) {
                Node<T> current = root;
                for (int j = 0; j < i; j++) {
                    if (current.next != null) {
                        current = current.next;
                    } else {
                        current = root;
                    }
                }
                return current;
            }
        }
        return null;
    }
    public T get(int i) {
        return getNode(i).value;
    }
    static void initializePieces(Player player) {

        String color = player.getColor();
    }

}