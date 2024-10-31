package org.example.LinkedList;

public class CustomLinkedList {
    private Node head;

    public CustomLinkedList(){
        head = null;
    }

    public void Append(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void display(){
        Node currentNode = head;
        while(currentNode.next != null){
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

}
