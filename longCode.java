package trees;
//trees


public class BinarySearchTree {
  public static Node root;

  // Constructor to initialize the binary search tree
  public BinarySearchTree() {
      this.root = null;
  }

  // Method to search for a node with a specific value in the binary search tree
  public boolean find(int id) {
      Node current = root;
      while (current != null) {
          if (current.data == id) {
              return true; // Node with value id found
          } else if (current.data > id) {
              current = current.left; // Search in the left subtree
          } else {
              current = current.right; // Search in the right subtree
          }
      }
      return false; // Node with value id not found
  }

  // Method to delete a node with a specific value from the binary search tree
  public boolean delete(int id) {
      // Implementation of deletion logic
  }

  // Helper method to get the successor of a node to be deleted
  public Node getSuccessor(Node deleleNode) {
      // Implementation of getting the successor of a node
  }

  // Method to insert a node with a specific value into the binary search tree
  public void insert(int id) {
      // Implementation of insertion logic
  }

  // Method to display the binary search tree in in-order traversal
  public void display(Node root) {
      if (root != null) {
          display(root.left); // Display left subtree
          System.out.print(" " + root.data); // Display current node
          display(root.right); // Display right subtree
      }
  }

  public static void main(String arg[]) {
      BinarySearchTree b = new BinarySearchTree();
      b.insert(3); b.insert(8);
      b.insert(1); b.insert(4); b.insert(6); b.insert(2); b.insert(10); b.insert(9);
      b.insert(20); b.insert(25); b.insert(15); b.insert(16);
      
      System.out.println("Original Tree:");
      b.display(b.root); // Display the original tree
      System.out.println("");
      
      // Example usage: Search for a node with value 4
      System.out.println("Check whether Node with value 4 exists: " + b.find(4));
      
      // Example usage: Delete a node with no children (value 2)
      System.out.println("Delete Node with no children (2): " + b.delete(2));
      b.display(root); // Display the tree after deletion
      
      // Example usage: Delete a node with one child (value 4)
      System.out.println("\nDelete Node with one child (4): " + b.delete(4));
      b.display(root); // Display the tree after deletion
      
      // Example usage: Delete a node with two children (value 10)
      System.out.println("\nDelete Node with Two children (10): " + b.delete(10));
      b.display(root); // Display the tree after deletion
  }
}

class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
      this.data = data;
      left = null;
      right = null;
    }
}
