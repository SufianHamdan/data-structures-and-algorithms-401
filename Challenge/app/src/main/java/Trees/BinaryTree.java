package Trees;

import java.util.ArrayList;

public class BinaryTree {

    private Node root;

    public ArrayList<Integer> preOrder = new ArrayList<>();
    public ArrayList<Integer> inOrder = new ArrayList<>();
    public ArrayList<Integer> postOrder = new ArrayList<>();

    private Integer maxValue;


    public ArrayList<Integer> getPreOrder() {
        return preOrder;
    }

    public ArrayList<Integer> getInOrder() {
        return inOrder;
    }

    public ArrayList<Integer> getPostOrder() {
        return postOrder;
    }

    public void inOrderTravers(Node node){
        if (root == null) {
            System.out.println("Tree is Empty!");
            return;
        }

        if(node != null){
            // get max value
            if (maxValue == null || maxValue < node.getKey()){
                maxValue = node.getKey();
            }
            inOrderTravers(node.getLeft());
            System.out.print(" " + node.getKey());
            inOrder.add(node.getKey());
            inOrderTravers(node.getRight());
        }
    }


    public void postOrderTravers(Node node){
        if (root == null) {
            System.out.println("Tree is Empty!");
            return;
        }

        if(node != null){
            postOrderTravers(node.getLeft());
            postOrderTravers(node.getRight());
            System.out.print(" " + node.getKey());
            postOrder.add(node.getKey());
        }
    }

    public void preOrderTravers(Node node){
        if (root == null) {
            System.out.println("Tree is Empty!");
            return;
        }

        if(node != null){
            System.out.print(" " + node.getKey());
            preOrder.add(node.getKey());
            preOrderTravers(node.getLeft());
            preOrderTravers(node.getRight());
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Integer findMaxVal(){
        Node node = root;
        postOrderTravers(node);
        return maxValue;
    }
}