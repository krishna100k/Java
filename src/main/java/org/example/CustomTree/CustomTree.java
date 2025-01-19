package org.example.CustomTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CustomTree {
    TreeNode root;
    public CustomTree(){
        this.root = null;
    }

    public void insert(int value){
        this.root = insertVal(value, this.root);
    }

    protected TreeNode insertVal(int value, TreeNode root){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }

        if(value > root.value){
            root.right = insertVal(value, root.right);
        }else if (value < root.value){
            root.left = insertVal(value, root.left);
        }

        return root;
    }

    public void inOrder(){
        inOrderSearch(this.root);
    }

    public void preOrder(){
        preOrderSearch(this.root);
    }

    public void postOrder(){
        postOrderSearch(this.root);
    }

    private void inOrderSearch(TreeNode root){
        if(root != null){
            inOrderSearch(root.left);
            System.out.println(root.value);
            inOrderSearch(root.right);
        }
    }

    private void preOrderSearch(TreeNode root){
        if(root != null){
            System.out.println(root.value);
            preOrderSearch(root.left);
            preOrderSearch(root.right);
        }
    }

    private void postOrderSearch(TreeNode root){
        if(root != null){
            preOrderSearch(root.left);
            preOrderSearch(root.right);
            System.out.println(root.value);
        }
    }

    public void BFS(){
        BFSSearch(this.root);
    }

    private void BFSSearch(TreeNode root){
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.value);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

}
