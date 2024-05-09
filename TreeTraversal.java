package trees;

public class TreeTraversal {

}
public class Node {
int data;
Node left;
Node right;
public Node(int data) {
this. data = data; }}
//In order 
private void traverseTree (Node root) {
traverseTree(root. left);
System.out.printin(root.data);
traverseTree(root.right);
}
//post order 
private void traverseTree(Node root) {
traverseTree(root.left) ;
traverseTree (root.right);
System.out.println(root.data);
}
//pre order
private void traverseTree (Node root) {
System.out.println(root.data);
traverseTree(root.left);
traverseTree(root.right); }
