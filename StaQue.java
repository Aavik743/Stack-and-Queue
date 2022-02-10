package stque;

import java.util.LinkedList;

public class StaQue {
	
	 static LinkedList list=new LinkedList();
	
	static void toPeekPop() {
		while ((list.isEmpty()) == false) {
		list.peek();
		list.pop();
		System.out.println("The new order is: ");
		System.out.println(list);
		}
	}	
	
	public static void main(String args[]){

		

	     //Adding elements to the Linked list
		 list.push(70);
		 list.push(30);
		 list.push(56);
	  
	     System.out.println(list);
	     
	     toPeekPop();
	   
	   } 

}
