package org.example.LinkedList;

public class CustomLinkedList {
    private Node head;

    public CustomLinkedList(){
        head = null;
    }

    public void append(int value){
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

    public void prepend(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.value == value) {
            head = head.next;
            System.out.println(value + " deleted successfully");
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.value == value) {
                currentNode.next = currentNode.next.next;
                System.out.println(value + " deleted successfully");
                return;
            }
            currentNode = currentNode.next;
        }

        System.out.println("Cannot find " + value + " in the list");
    }

    public void reverse() {
        Node currentNode = head;
        Node previousNode = null;
        Node nextNode = null;

        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        head = previousNode;

    }

    public void isEmpty(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty");
        }
    }

    public int length(){
        int count = 0;
        Node currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.next;
            count++;
        }
        return count;
    }

    public void display(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

}
