import list.MyArrayList;
import list.MyLinkedList;
import list.MyList;

import java.util.Collections;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(15);
        list.add(10);
        list.add(202);
        list.add(-34);
//        System.out.println(list);
//        list.delete(0);
//        System.out.println(list);

//        MyList<Integer> list2 = new MyLinkedList<>();
//        list2.add(134);
//        list2.add(4);
//        list2.add(-231);
//        list2.add(8);
//        list2.add(22);
//        list2.add(-1);
//        list2.add(0);
//        System.out.println(list2);
//        list2.add(55);
//        System.out.println(list2);

        MyLinkedList<Integer> int1 = new MyLinkedList<>();
        int1.add(10);
        int1.add(30);
        int1.add(40);
        int1.add(60);
        int1.add(70);
        int1.addFirst(20);
        int1.add(80);
        int1.add(90);
        int1.add(100);
        int1.addLast(50);
        int1.add(110);
        int1.get(5);
        System.out.println(int1.get(5));
        System.out.println(int1);
        for (int i = 0; i < int1.size() ; i++)
        {
            System.out.println(int1.get(i));
        }


    }
}