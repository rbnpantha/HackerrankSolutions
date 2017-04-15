package edu.hackerrank.tree;

public class HuffmanDecoding {
	  
	  
	void decode(String S ,Node root)
	    {
	        
	     Node node = root;
	    for (int i = 0; i < S.length(); i++) {
	        node = S.charAt(i) == '0' ? node.left : node.right;
	        if (node.left == null && node.right == null) {
	            System.out.print(node.data);
	            node = root;
	        } 
	    }
	       
	    }

}

class Node{
	public  int frequency; // the frequency of this tree
	 public  char data;
	 public  Node left, right;

}
