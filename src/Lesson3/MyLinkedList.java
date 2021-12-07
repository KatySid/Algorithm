package Lesson3;


public class MyLinkedList<T> {
    private MyLink<T> first;
    private MyLink<T> last;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(T element) {
        MyLink<T> l = new MyLink<T>(element);
        if (first == null) {
            first = l;
            last = l;
            return;
        }
        l.setPrevious(last);
        last.setNext(l);
        last = l;
    }

    public void addFirst(T element) {
        MyLink<T> l = new MyLink<T>(element);
        if (first == null) {
            first = l;
            last = l;
            return;
        }
        l.setNext(first);
        first.setPrevious(l);
        first = l;
    }

    public MyLink<T> getFirst() {
        return first;
    }

    public MyLink<T> getLast() {
        return last;
    }

    public T removeLast() {
        if (!isEmpty()) {
            T temp = last.getValue();
            last = last.getPrevious();
            if (last == null) {
                first = null;
            } else {
                last.setNext(null);
            }
            return temp;
        }
        return null;
    }

    public T removeFirst() {
        if (!isEmpty()) {
            T temp = first.getValue();
            first = first.getNext();
            if (first == null) {
                last = null;
            } else {
                first.setPrevious(null);

            }
            return temp;
        }
        return null;
    }

}
