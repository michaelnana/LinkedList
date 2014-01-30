import java.util.*;


//A simple Linked List implementation.
public class LinkedList {
	Node fronter;
	public LinkedList(){
		fronter=null;
	}
	
	public LinkedList(int a){
		Node node=new Node();
		node.value=a;
		node.next=fronter;
		fronter=node;
	}
	
	//Inserts at the front of the linked list
	public void insert(int a){
		Node node=new Node();  //Create a new Node to hold the value and the next pointer
		node.value=a; //Set the value of the node to the passed value a
		node.next=fronter; //Make node point to the node in front of it.
		fronter=node; //Now set the fronter node to the recently inserted one.
	}
	
	//Deletes the first Node in the Linked list
	public void deleteFirst(){
		fronter=fronter.next; //To remove the first one make fronter point to the next node after the first one.
	}
	
	//Displays the Linked List
	public void display(){
		Node node=fronter;
		while(fronter!=null){
			System.out.println(fronter.value);
			fronter=fronter.next; //Make it point to the one behind it
		}
	}
	
	public static void main(String[]args){
		LinkedList ll=new LinkedList();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.deleteFirst();
		ll.display();
	}
	

}
