package trees;

//binary search
import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {
      int[] ints = {1, 2, 4, 5, 7, 9, 11};
      System.out.println(binarySearch(ints, 9));
      System.out.println(Arrays.binarySearch(ints, 9)); //built in
  }

  private static int binarySearch(int[] numbers, int numberToFind) {
      int low = 0;
      int high = numbers.length - 1;

      while (low <= high) {
          int middlePosition = (low + high) / 2;
          int middleNumber = numbers[middlePosition];

          if (numberToFind == middleNumber) {
              return middlePosition;
          } else if (numberToFind < middleNumber) {
              high = middlePosition - 1;
          } else {
              low = middlePosition + 1;
          }
      }
      return -1;
  }
}
//insert(int n)
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  
  public TreeNode(int val) {
      this.val = val;
  }
}

class BinarySearchTree {
  private TreeNode root;
  
  // Method to insert a node with value n into the binary search tree
  public void insert(int n) {
      root = insertNode(root, n);
  }
  
  // Helper method to recursively insert a node into the tree
  private TreeNode insertNode(TreeNode root, int n) {
      // If the root is null, create a new node
      if (root == null) {
          return new TreeNode(n);
      }
      // If n is less than the root value, insert into the left subtree
      if (n < root.val) {
          root.left = insertNode(root.left, n);
      } 
      // If n is greater than the root value, insert into the right subtree
      else if (n > root.val) {
          root.right = insertNode(root.right, n);
      }
      return root;
  }
}
//Find(int n)
class BinarySearchTree {
  // Other code from previous example...

  // Method to find if a node with value n exists in the tree
  public boolean find(int n) {
      return findNode(root, n);
  }
  
  // Helper method to recursively search for a node with value n
  private boolean findNode(TreeNode root, int n) {
      // If the root is null, return false
      if (root == null) {
          return false;
      }
      // If the root value is equal to n, return true
      if (root.val == n) {
          return true;
      } 
      // If n is less than the root value, search in the left subtree
      else if (n < root.val) {
          return findNode(root.left, n);
      } 
      // Otherwise, search in the right subtree
      else {
          return findNode(root.right, n);
      }
  }
}
//Delete(int n)
class BinarySearchTree {
  // Other code from previous example...

  // Method to delete a node with value n from the tree
  public void delete(int n) {
      root = deleteNode(root, n);
  }
  
  // Helper method to recursively delete a node with value n
  private TreeNode deleteNode(TreeNode root, int n) {
      // If the root is null, return null
      if (root == null) {
          return null;
      }
      // If n is less than the root value, delete from the left subtree
      if (n < root.val) {
          root.left = deleteNode(root.left, n);
      } 
      // If n is greater than the root value, delete from the right subtree
      else if (n > root.val) {
          root.right = deleteNode(root.right, n);
      } 
      // If the root value is equal to n, perform deletion
      else {
          // If the node has only one child or no child
          if (root.left == null) {
              return root.right;
          } else if (root.right == null) {
              return root.left;
          }
          // If the node has two children, find the minimum value in the right subtree
          root.val = minValue(root.right);
          // Delete the node with the minimum value from the right subtree
          root.right = deleteNode(root.right, root.val);
      }
      return root;
  }
  
  // Helper method to find the minimum value in a subtree
  private int minValue(TreeNode node) {
      int minVal = node.val;
      while (node.left != null) {
          minVal = node.left.val;
          node = node.left;
      }
      return minVal;
  }
}
//Display
class BinarySearchTree {
  // Other code from previous example...

  // Method to display the entire tree in increasing order
  public void display() {
      inOrderTraversal(root);
  }
  
  // Helper method for in-order traversal
  private void inOrderTraversal(TreeNode root) {
      if (root != null) {
          // Recursively traverse left subtree
          inOrderTraversal(root.left);
          // Print current node
          System.out.print(root.val + " ");
          // Recursively traverse right subtree
          inOrderTraversal(root.right);
       }
    }
}


