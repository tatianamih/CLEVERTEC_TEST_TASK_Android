package mikhalchenko.test2.my_linked_list;


public class MyLinkedList {
    private class Node {
        public int data;
        public Node next;
        public Node previous;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }
    public  MyLinkedList addToTheBeginning(MyLinkedList list, int data) {
        // Создать новый узел с заданными данными
      Node newNode = new Node(data);
        newNode.next = null;
        // Если связанный список пуст,
        // затем делаем новый узел головой
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Остальное до последнего узла
            // и вставляем туда новый_узел
           Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Вставляем new_node в последний узел
            last.next = newNode;
        }
        // Возвращаем список по голове
        return list;
    }

    public  MyLinkedList addToTheEnd(MyLinkedList list, int data) {

        // Создать новый узел с заданными данными
        Node newNode = new Node(data);// null,
        newNode.previous = null;
        // Если связанный список пуст,
        // затем делаем новый узел хвостом
        if (list.tail == null) {
            list.tail = newNode;
        } else {
            // Остальное до первого узла // ....10
            // и вставляем туда новый_узел
            Node first = list.tail;
            while (first.previous != null) {
                first = first.previous;
            }
            // Вставляем new_node в последний узел
            first.previous = newNode;
        }
        // Возвращаем список по голове
        return list;
    }



    public void print(MyLinkedList list) {
        Node tempNode = list.head;
        while (tempNode != null) {
            // Распечатать данные на текущем узле
            System.out.print(tempNode.data + " ");
            // Перейти к следующему узлу
            tempNode = tempNode.next;
        }
    }

    public MyLinkedList addToTheEnd1(MyLinkedList list,int data) {
        Node tempNode = new Node(data);

        if (isEmpty()) {
            head = tempNode;
        } else {
            tail.previous = tempNode;
            tempNode.previous = tail;
            tail = tempNode;
        }
        return list;
    }

    private boolean isEmpty() {
        return head == null;

    }

}
