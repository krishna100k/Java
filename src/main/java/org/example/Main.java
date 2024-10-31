package org.example;

import org.example.LinkedList.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.Append(1);
        list.Append(2);
        list.Append(3);
        list.Append(4);

        list.display();
    }
}