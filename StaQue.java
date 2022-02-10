package stque;

import java.util.LinkedList;
import java.util.Queue;

public class StaQue {
	
	 static Queue list = new LinkedList();
	
	static void toPeekPop() {
		while ((list.isEmpty()) == false) {
		list.peek();
		list.poll();
		System.out.println("The new order is: ");
		System.out.println(list);
		}
	}	
		
	static void enQueue(int i, int j, int k) {
		list.add(i);
		list.add(j);
		list.add(k);
		System.out.println("The new order is: ");
		System.out.println(list);
	}
		
	
	public static void main(String args[]){

		enQueue(56, 30, 70);
		
	}

}
