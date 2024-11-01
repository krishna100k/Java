package org.example;

import org.example.CustomTree.CustomTree;
import org.example.CustomTree.Node;
import org.example.LinkedList.CustomLinkedList;

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

        CustomTree tree = new CustomTree();
        Node root = new Node(1);
        tree.insert(0, root);
        tree.insert(1, root);
        tree.insert(3, root);
        tree.insert(2, root);
//        tree.inorder(root);
//        tree.preOrder(root);
//        tree.postOrder(root);
        tree.Search(9, root);
    }
}