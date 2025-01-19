package org.example;

import org.example.CustomTree.CustomTree;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Linked list
//        CustomLinkedList list = new CustomLinkedList();
//        list.append(0);
//        list.append(1);
//        list.append(2);
//        list.append(3);
//        list.append(4);
//        list.prepend(0);
//        list.prepend(-1);
//        list.delete(2);
//
//
//        System.out.println("Length : " + list.length());
//
//
//        list.reverse();
//        list.isEmpty();
//        list.display();

//        ArrayList<Integer> ints = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
//        System.out.print(ints);

        CustomTree tree = new CustomTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.BFS();

    }
}