/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Trees;

public class App {

    public static void main(String[] args) throws Exception {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.getRoot().getLeft().setLeft(new Node(4));
        binaryTree.getRoot().getLeft().setRight(new Node(5));


        System.out.println("Inorder");
        binaryTree.inOrderTravers(binaryTree.getRoot());
        System.out.println();

//        System.out.println("Postorder");
//        binaryTree.postOrderTravers(binaryTree.getRoot());
//        System.out.println();
//
//        System.out.println("Preorder");
//        binaryTree.preOrderTravers(binaryTree.getRoot());
//        System.out.println();

        System.out.println("Find Max Value");
        System.out.println("Maximum Value is: " + binaryTree.getMaxValue());


//        System.out.println("Breadth First Values");
//        System.out.println(binaryTree.breadthFirst(binaryTree));



        //Binary Search Tree
//        System.out.println();
//        System.out.println("-----------------------------------------------------");
//        System.out.println("Binary Search Tree");
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//
//        binarySearchTree.add(10);
//        binarySearchTree.add(20);
//        binarySearchTree.add(30);
//        binarySearchTree.add(40);
//        binarySearchTree.add(50);
//        binarySearchTree.add(1);
//        binarySearchTree.add(2);
//        binarySearchTree.add(3);
//        binarySearchTree.add(4);
//        binarySearchTree.add(5);
//
//        System.out.println("Should be true and my result is: " + binarySearchTree.contain(4));
//        System.out.println("Should be false and my result is: " + binarySearchTree.contain(8));


        /**
         * Testing the sum of odd numbers
         */
//        BinaryTree binaryTree = new BinaryTree();
//
//        binaryTree.setRoot(new Node(1));
//        binaryTree.getRoot().setLeft(new Node(2));
//        binaryTree.getRoot().setRight(new Node(3));
//        binaryTree.getRoot().getLeft().setLeft(new Node(4));
//        binaryTree.getRoot().getLeft().setRight(new Node(5));
//
//        System.out.println(binaryTree.sumOfOddNumbers(binaryTree));

    }
}