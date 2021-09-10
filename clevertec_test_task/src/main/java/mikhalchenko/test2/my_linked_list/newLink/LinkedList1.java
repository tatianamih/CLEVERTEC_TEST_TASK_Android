package mikhalchenko.test2.my_linked_list.newLink;

import java.util.NoSuchElementException;

/*Тестовое задание 2
На любом известном вам языке программирования напишите класс реализующий двусвязный список.
Класс должен иметь методы вставки, удаления и замены элемента списка.Оформление работы:
Решение представьте в виде текстового файла с именем в формате:
Тестовое задание 2. Язык программирования. [Ваша Фамилия Имя] txt
Например:
Тестовое задание 2. Pascal. Иванов Владимир.txt*/
public class LinkedList1<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    public LinkedList1() {
        last = new Node<E>(null, first, null);
        first = new Node<E>(null, null, last);
    }

    public void addLast(E el) {
        Node<E> previous = last;
        previous.setCurrentElement(el);
        last = new Node<E>(null, previous, null);
        previous.setNextElement(last);
        size++;
    }

    public void updateLast(E el) {
        Node<E> lastEl = last;
        lastEl.setCurrentElement(el);
    }

    public void addFirst(E el) {
        Node<E> next = first;
        next.setCurrentElement(el);
        first = new Node<E>(null, null, next);
        next.setPreviousElement(first);
        size++;
    }

    public void updateFirst(E el) {
        Node<E> firstEl = first;
        firstEl.setCurrentElement(el);
    }
public void myprint(){
    Node<E> firstEl = first;

    System.out.println(firstEl.currentElement);
}

    public E removeFirst() {
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return unlinkFirst(f);
    }

    private E unlinkFirst(Node<E> f) {
        // assert f == first && f != null;
        final E element = f.currentElement;
        final Node<E> next = f.nextElement;
        f.currentElement = null;
        f.nextElement = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.previousElement = null;
        size--;
        return element;
    }

    public E removeLast() {
       Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return unlinkLast(l);
    }

    private E unlinkLast(Node<E> l) {
        // assert l == last && l != null;
        final E element = l.currentElement;
        final Node<E> prev = l.previousElement;
        l.currentElement = null;
        l.previousElement = null;
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.nextElement = null;
        size--;
        return element;
    }

    public E getTheElementByIndex(int counter) {
        Node<E> target = first.getNextElement();
        for (int i = 0; i <= counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }


    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.nextElement) {
                if (x.currentElement == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.nextElement) {
                if (o.equals(x.currentElement))
                    return index;
                index++;
            }
        }
        return index;
    }
    public E getByIndex(int index) {
        checkElementIndex(index);
        return node(index).currentElement;
    }
    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }
    Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.nextElement;
            return x;
        } else {
           Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.previousElement;
            return x;
        }
    }

    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();
    }

    private class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> previousElement;

        public Node(E currentElement, Node<E> nextElement, Node<E> previousElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.previousElement = previousElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPreviousElement() {
            return previousElement;
        }

        public void setPreviousElement(Node<E> previousElement) {
            this.previousElement = previousElement;
        }
    }

    public static void main(String[] args) {
        LinkedList1<Integer> list1 = new LinkedList1<>();

        list1.addFirst(2);
        list1.addFirst(1);
        list1.addFirst(0);

  list1.addLast(14);
      list1.myprint();

    }
}
