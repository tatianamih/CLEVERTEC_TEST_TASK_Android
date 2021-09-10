package mikhalchenko.test2.my_linked_list;

public class LinkedList {
//
//    Node1 head; // заголовок списка
//
//
//    // Узел связанного списка.
//
//    // Этот внутренний класс сделан статическим
//
//    // чтобы main () мог получить к нему доступ
//
//    static class Node1 {
//
//
//        int data;
//
//        Node1 next;
//
//
//        // Конструктор
//
//        Node1(int d) {
//
//            data = d;
//
//            next = null;
//
//        }
//
//    }
//
//
//    // Метод для вставки нового узла
//
////    public static LinkedList insert(LinkedList list, int data)
////
////    {
////
////        // Создать новый узел с заданными данными
////
////        Node1 new_node = new Node1(data);
////
////        new_node.next = null;
////
////
////
////        // Если связанный список пуст,
////
////        // затем делаем новый узел головой
////
////        if (list.head == null) {
////
////            list.head = new_node;
////
////        }
////
////        else {
////
////            // Остальное до последнего узла
////
////            // и вставляем туда новый_узел
////
////            Node1 last = list.head;
////
////            while (last.next != null) {
////
////                last = last.next;
////
////            }
////
////
////
////            // Вставляем new_node в последний узел
////
////            last.next = new_node;
////
////        }
////
////
////
////        // Возвращаем список по голове
////
////        return list;
////
////    }
////
////
////
////    // Метод для печати LinkedList.
////
////    public static void printList(LinkedList list)
////
////    {
////
////        Node1 currNode = list.head;
////
////
////
////        System.out.print("LinkedList: ");
////
////
////
////        // Пройдемся по LinkedList
////
////        while (currNode != null) {
////
////            // Распечатать данные на текущем узле
////
////            System.out.print(currNode.data + " ");
////
////
////
////            // Перейти к следующему узлу
////
////            currNode = currNode.next;
////
////        }
////
////    }
////
////
////
////    // Код драйвера
////
////    public static void main(String[] args)
////
////    {
////
////       // / * Начнем с пустого списка. * /
////
////        LinkedList list = new LinkedList();
////
////
////
////        //
////
////        // ****** ВСТАВКА ******
////
////        //
////
////
////
////        // Вставляем значения
////
////        list = insert(list, 1);
////
////        list = insert(list, 2);
////
////        list = insert(list, 3);
////
////        list = insert(list, 4);
////
////        list = insert(list, 5);
////
////        list = insert(list, 6);
////
////        list = insert(list, 7);
////
////        list = insert(list, 8);
////
////
////
////        // Распечатать LinkedList
////
////        printList(list);
////
////    }
////
////
////
////}
}