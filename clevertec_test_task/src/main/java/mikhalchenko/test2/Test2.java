package mikhalchenko.test2;
/*Тестовое задание 2
На любом известном вам языке программирования напишите класс реализующий двусвязный список.
Класс должен иметь методы вставки, удаления и замены элемента списка.Оформление работы:
Решение представьте в виде текстового файла с именем в формате:
Тестовое задание 2. Язык программирования. [Ваша Фамилия Имя] txt
Например:
Тестовое задание 2. Pascal. Иванов Владимир.txt*/

import mikhalchenko.test2.my_linked_list.MyLinkedList;



public class Test2 {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
//        list1 = list1.addToTheBeginning(list1,2);
//        list1 = list1.addToTheBeginning(list1,1);
       list1 = list1.addToTheBeginning(list1,0);
        list1.addToTheEnd1(list1,11);
        list1.addToTheEnd1(list1,12);
//        list1.addToTheEnd(list1,13);


        list1.print(list1);
    }
}
