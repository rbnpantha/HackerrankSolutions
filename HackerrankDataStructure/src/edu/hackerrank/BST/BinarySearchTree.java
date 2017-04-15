package edu.hackerrank.BST;

public class BinarySearchTree {
	 
	/*Binary Search Tree : Insertion*/
	
	static Node Insert(Node root,int value)
	    {
		 Node node = new Node();
	        node.data = value;
	        if(root == null){
	            return node;
	        }
	        Node temp = root;
	        Node prev = null;
	        while(temp != null){
	            if(value < temp.data){
	                prev = temp;
	                temp = temp.left;
	            }
	            else{
	                prev = temp;
	                temp = temp.right;
	            }
	        }
	        if(value < prev.data){
	            prev.left = node;
	        }
	        else
	            prev.right = node;
	    
	    return root;
	       
	    }
	

}
/*Node is defined as : */
class Node {
	 int data; 
	 Node left; 
	 Node right;
}
