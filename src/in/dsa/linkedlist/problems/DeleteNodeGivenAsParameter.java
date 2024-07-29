package in.dsa.linkedlist.problems;

import in.dsa.linkedlist.problems.LinkedList.Node;

public class DeleteNodeGivenAsParameter{

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.display();
		//DeleteNodeGivenAsParameter.deleteNode(ll);
	}
	
	public static void deleteNode(Node node){
		node.data = node.next.data;
		node.next = node.next.next;	
	}
	

}
