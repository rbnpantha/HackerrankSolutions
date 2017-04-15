package edu.hackerrank.linkedlist;

import java.util.HashSet;

public class LinkedList {
	/*
	  Print elements of a linked list on console 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/

	// This is a "method-only" submission. 
	// You only need to complete this method. 
	
	class Node {
	     int data;
	     Node next;
	  }
	
	/*Print the Elements of a Linked List*/
	
	void Print(Node head) {
	    if (head != null) {
	        System.out.println(head.data);
	        Print(head.next);
	    }
	}
	
	/*Insert a Node at the Tail of a Linked List*/
	Node InsertLast(Node head,int data) {
		// This is a "method-only" submission. 
		// You only need to complete this method. 
		    Node newNode = new Node();
		    newNode.data=data;
		    
		    Node curr = head;
		    while(curr.next != null){
		        curr = curr.next;
		    }
		    
		    curr.next = newNode;
		    newNode.next = null;
		    
		    return head;
		}
	
	/*Insert a node at the head of a linked list*/
	
	Node InsertHead(Node head,int x) {
	    Node node = new Node();
	    node.data = x;
	    node.next = head;
	    return node;
	}
	
	/*Insert a node at a specific position in a linked list*/
	
	Node InsertNth(Node head, int data, int position) {
	    Node node = head;
	    if (position == 0){
	        node = new Node();
	        node.data = data;
	        node.next = head;
	        return node;
	    }
	    else {
	        while(--position > 0){
	            node = node.next;
	        }
	        Node i = node.next;
	        node.next = new Node();
	        node.next.data = data;
	        node.next.next = i;
	        return head;
	    }
	}
	
	/*Delete a Node*/
	
	Node Delete(Node head, int position) {
	    if(position ==0){
	        head = head.next;
	    }else{
	        Node curr = new Node();
	        curr = head;
	        for(int i=0;i<position-1;i++){
	            curr=curr.next;
	        }
	        curr.next = curr.next.next;
	    }
	    return head;
	}
	
	
	/*Print Reverse*/
	void ReversePrint(Node head) {
	    if (head != null) {
	        ReversePrint(head.next);
	        System.out.println(head.data);
	    }
	}
	
	
	/*Reverse a Linked List*/
	Node Reverse(Node head) {
		Node previous=null;
		Node current=head;
		Node next=null;

		while(current!=null){
		    next=current.next;
		    current.next=previous;
		    previous=current;
		    current=next;

		}
		return previous;
		}
	
	/*Compare two linked lists*/
	
	int CompareLists(Node headA, Node headB) {
	    if (headA==null){
	        return (headB==null)?1:0;
	    }
	    
	    while (headA!=null){
	        if (headB==null || headA.data!=headB.data){
	            return 0;
	        }
	        headA = headA.next;
	        headB = headB.next;
	    }
	    return (headB==null)?1:0;
	}

	/*Merge two sorted linked lists*/
	
	Node MergeLists(Node headA, Node headB) {
	     if(headA==null || headB == null)
	         return headA==null?headB:headA;
	        Node list=null;
	    if(headA.data < headB.data){
	        list = headA;
	    }
	    else
	        {
	        list = headB;
	        headB= headA;
	        headA=list;
	    }
	    while(headA.next!=null){
	        if(headA.next.data > headB.data){
	            Node next = headA.next;
	            headA.next=headB;
	            headB= next;
	        }
	        headA= headA.next;
	    }
	    if(headA.next==null)
	        headA.next = headB;
	    return list;
	}

	/*Get Node Value
	You’re given the pointer to the head node of a linked list and a specific position. Counting backwards from the tail node of the linked list, get the value of the node at the given position. A position of 0 corresponds to the tail, 1 corresponds to the node before the tail and so on.

	Input Format 
	You have to complete the int GetNode(Node* head, int positionFromTail) method which takes two arguments - the head of the linked list and the position of the node from the tail. positionFromTail will be at least 0 and less than the number of nodes in the list. You should NOT read any input from stdin/console.

	Constraints 
	Position will be a valid element in linked list.

	Output Format 
	Find the node at the given position counting backwards from the tail. Then return the data contained in this node. Do NOT print anything to stdout/console.

	Sample Input

	1 -> 3 -> 5 -> 6 -> NULL, positionFromTail = 0
	1 -> 3 -> 5 -> 6 -> NULL, positionFromTail = 2
	Sample Output

	6
	3*/
		
	int GetNode(Node head,int n)
	{
	    int len=0;
	    Node current=head;
	    Node temp=head;
	    while(current!=null)
	    {
	        len++;
	        current=current.next;
	    }
	    
	    int m=len-n-1;
	    for(int i=0;i<m;i++)
	        temp=temp.next;
	    
	    return temp.data;
	}
	
	/*Delete duplicate-value nodes from a sorted linked list
	You're given the pointer to the head node of a sorted linked list, where the data in the nodes is in ascending order. Delete as few nodes as possible so that the list does not contain any value more than once. The given head pointer may be null indicating that the list is empty.

	For now do not be concerned with the memory deallocation. In common abstract data structure scenarios, deleting an element might also require deallocating the memory occupied by it. For an initial intro to the topic of dynamic memory please consult: http://www.cplusplus.com/doc/tutorial/dynamic/

	Input Format 
	You have to complete the Node* RemoveDuplicates(Node* head) method which takes one argument - the head of the sorted linked list. You should NOT read any input from stdin/console.

	Output Format 
	Delete as few nodes as possible to ensure that no two nodes have the same data. Adjust the next pointers to ensure that the remaining nodes form a single sorted linked list. Then return the head of the sorted updated linked list. Do NOT print anything to stdout/console.

	Sample Input

	1 -> 1 -> 3 -> 3 -> 5 -> 6 -> NULL
	NULL
	Sample Output

	1 -> 3 -> 5 -> 6 -> NULL
	NULL
	Explanation 
	1. 1 and 3 are repeated, and are deleted. 
	2. Empty list remains empty.*/

	Node RemoveDuplicates(Node head) {
	    Node node = head;
	    if(head == null){
	        return null;
	    }
	    while(head.next != null){
	        if (head.data == head.next.data){
	            head.next = head.next.next;
	        }
	        else {
	            head = head.next;
	        }
	    }
	    return node;
	}
	
	
/*	Cycle Detection
	A linked list is said to contain a cycle if any node is visited more than once while traversing the list.

	Complete the function provided for you in your editor. It has one parameter: a pointer to a Node object named  that points to the head of a linked list. Your function must return a boolean denoting whether or not there is a cycle in the list. If there is a cycle, return true; otherwise, return false.

	Note: If the list is empty,  will be null.

	Input Format

	Our hidden code checker passes the appropriate argument to your function. You are not responsible for reading any input from stdin.

	Constraints

	Output Format

	If the list contains a cycle, your function must return true. If the list does not contain a cycle, it must return false. The binary integer corresponding to the boolean value returned by your function is printed to stdout by our hidden code checker.

	Sample Input

	The following linked lists are passed as arguments to your function:

	Sample Inputs
	Sample Output

	0
	1
	Explanation

	The first list has no cycle, so we return false and the hidden code checker prints  to stdout.
	The second list has a cycle, so we return true and the hidden code checker prints  to stdout.*/
	
	boolean hasCycle(Node head) {
	    if (head == null){
	        return false;
	    }
	    Node tortoise = head;
	    Node hare = head;

	    while(tortoise != null && tortoise.next != null) {        
	        tortoise = tortoise.next;
	        hare = hare.next.next;
	        
	        if(hare == null || tortoise == null) {
	            return false;
	        }
	        if(hare == tortoise){
	            return true;
	        }
	    }
	    return false;  

	}
	
/*	Find Merge Point of Two Lists
	Given pointers to the head nodes of  linked lists that merge together at some point, find the Node where the two lists merge. It is guaranteed that the two head Nodes will be different, and neither will be NULL.

	In the diagram below, the two lists converge at Node x:

	[List #1] a--->b--->c
	                     \
	                      x--->y--->z--->NULL
	                     /
	     [List #2] p--->q
	Complete the int FindMergeNode(Node* headA, Node* headB) method so that it finds and returns the data value of the Node where the two lists merge.

	Input Format

	The FindMergeNode(Node*,Node*) method has two parameters,  and , which are the non-null head Nodes of two separate linked lists that are guaranteed to converge. 
	Do not read any input from stdin/console.

	Output Format

	Each Node has a data field containing an integer; return the integer data for the Node where the two lists converge. 
	Do not write any output to stdout/console.

	Sample Input

	The diagrams below are graphical representations of the lists that input Nodes  and  are connected to. Recall that this is a method-only challenge; the method only has initial visibility to those  Nodes and must explore the rest of the Nodes using some algorithm of your own design.

	Test Case 0

	 1
	  \
	   2--->3--->NULL
	  /
	 1
	Test Case 1

	1--->2
	      \
	       3--->Null
	      /
	     1
	Sample Output

	2
	3
	Explanation

	Test Case 0: As demonstrated in the diagram above, the merge Node's data field contains the integer  (so our method should return ). 
	Test Case 1: As demonstrated in the diagram above, the merge Node's data field contains the integer  (so our method should return ).
*/	
	int FindMergeNode(Node headA, Node headB) {
	    // Complete this function
	    // Do not write the main method. 
	    HashSet<Node> st = new HashSet<>();
	    Node current = headA;
	    while(current != null){
	        st.add(current);
	        current = current.next;
	    }
	    int x = 0;
	    Node result = headB;
	    while(result != null){
	        if(st.contains(result)){
	            x = result.data;
	            break;
	        }
	        result = result.next;
	    }
	    return x;

	}
	
	
/*	Inserting a Node Into a Sorted Doubly Linked List
	Given a reference to the head of a doubly-linked list and an integer, , create a new Node object having data value  and insert it into a sorted linked list.

	Complete the Node* SortedInsert(Node* head, int data) method in the editor below. It has two parameters:

	: A reference to the head of a doubly-linked list of Node objects.
	: An integer denoting the value of the  field for the Node you must insert into the list.
	The method must insert a new Node into the sorted (in ascending order) doubly-linked list whose data value is without breaking any of the list's double links or causing it to become unsorted.

	Note: Recall that an empty list (i.e., where ) and a list with one element are sorted lists.

	Input Format

	Do not read any input from stdin. Hidden stub code reads in the following sequence of inputs and passes and  to the method:

	The first line contains an integer, , denoting the number of lists that will be checked. The  subsequent lines describe the elements to insert into each list over two lines:

	The first line contains an integer, , denoting the number of elements that will be inserted into the list.
	The second line contains  space-separated integers describing the respective data values that your code must insert into the list during each call to the method.
	Output Format

	Do not print anything to stdout. Your method must return a reference to the  of the same list that was passed to it as a parameter. The custom checker for this challenge checks the list to ensure it hasn't been modified other than to properly insert the new Node in the correct location.

	Sample Input

	1
	3
	2 5 4
	Sample Output

	2 4 5
	Explanation

	We start out with an empty list. We insert a node with . The list becomes . We return .
	The head of the previously modified list is passed to our method as an argument. We insert a node with . The list becomes . We return .
	The head of the previously modified list is passed to our method as an argument. We insert a node with . The list becomes . We return .
*/
	 class DNode {
	     int data;
	     DNode next;
	     DNode prev;
	  }
	 
	 DNode SortedInsert(DNode head,int data) {
		DNode newNode = new DNode();
		DNode curr = head;
	    newNode.data = data;
	    if(head==null){
	         return newNode;
	    }
	    if(data<=curr.data){
	        newNode.next = curr;
	        curr.prev = newNode;
	        return newNode;
	    }else{
	      while(curr!=null){
	           if(curr.next==null){
	               curr.next = newNode;
	               newNode.prev = curr;
	               return head;
	           }else{      
	               curr=curr.next;
	               if(data <= curr.data){
	                  newNode.prev = curr.prev;
	                  curr.prev.next = newNode;
	                  newNode.next = curr;
	                  curr.prev=newNode;
	                  return head;
	               }
	          }
	     }
	     return head; 
	  }
	}
	
	
	/* Reverse a doubly linked list
	 You’re given the pointer to the head node of a doubly linked list. Reverse the order of the nodes in the list. The head node might be NULL to indicate that the list is empty.

	 Input Format 
	 You have to complete the Node* Reverse(Node* head) method which takes one argument - the head of the doubly linked list. You should NOT read any input from stdin/console.

	 Output Format 
	 Change the next and prev pointers of all the nodes so that the direction of the list is reversed. Then return the head node of the reversed list. Do NOT print anything to stdout/console.

	 Sample Input

	 NULL 
	 NULL <-- 2 <--> 4 <--> 6 --> NULL

	 Sample Output

	 NULL
	 NULL <-- 6 <--> 4 <--> 2 --> NULL
	 Explanation 
	 1. Empty list, so nothing to do. 
	 2. 2,4,6 become 6,4,2 o reversing in the given doubly linked list.*/
	 
	 DNode Reverse(DNode head) {
		 DNode previous=null;
		 DNode current=head;
		 DNode next=null;

		 while(current !=null){
		     next=current.next;
		     current.next=previous;
		     current.prev=next;
		     previous=current;
		     current=next;
		 }

		 return previous;
		 
	 	}
	
	
}
