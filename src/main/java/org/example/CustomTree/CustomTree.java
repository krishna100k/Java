package org.example.CustomTree;

public class CustomTree {

    public CustomTree(){

    }

    public Node insert(int val, Node root){
        Node newNode = new Node(val);
        if(root == null){
            root = newNode;
            return root;
        }else if(val > root.value){
            root.right = insert(val, root.right);
        }else if(val < root.value){
            root.left = insert(val, root.left);
        }
        return root;
    }

    public void Search(int val, Node root){
        if(root != null){
            if(root.value == val){
                System.out.println(val);
            }else if (val > root.value){
                Search(val, root.right);
            }else {
                Search(val, root.left);
            }
        }
    }

    public String inorder(Node root){
        if(root == null){
            return "Tree is Empty";
        }else {
            inorder(root.left);
            System.out.println(root.value);
            inorder(root.right);
        }
        return "";
    }

    public String preOrder(Node root){
        if(root == null){
            return "Tree is Empty";
        }else {
            System.out.println(root.value);
            preOrder(root.left);
            preOrder(root.right);
        }
        return "";
    }

    public String postOrder(Node root){
        if(root == null){
            return "Tree is Empty";
        }else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.value);
        }
        return "";
    }

}
