# Trees
<!-- Short summary or background information -->
Trees are non-linear data structures. They are often used to represent hierarchical data. For a real-world example, a hierarchical company structure uses a tree to organize.

## Challenge
<!-- Description of the challenge -->
- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- Implement a binary tree
- Implement a binary search tree

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
1. Binary Tree
- Time:  -Inserting a new node is O(n).  -Searching for a specific node is O(n)
- Space:  -O(w), where w is the largest width of the tree
2. Binary Search Tree
- Time: -insertion and search operations is O(h), or O(height), In a balanced (or “perfect”) tree, the height of the tree is log(n)
- Space:  -It's an O(1)
## API
<!-- Description of each method publicly available in each of your trees -->

Binary Tree Methods: 
1. preOrderTraverse: to print the data as root ==> left ==> right
2. inOrderTraverse: to print the data as left ==> root ==> right
3. postOrderTraverse: to print the data as left ==> right ==> root

Binary Search Tree Methods: 
1. add => input integer: to add a new node to the tree and if the number was larger than the root go to the right and if smaller go to the left
2. contain => input integer: search the tree if the value exists and return true if it does or false if it doesn't

