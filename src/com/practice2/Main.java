package com.practice2;

public class Main {
	public static void main(String args[])
	{
		LinkedList l= new LinkedList();
		
		l.InsertAtBegin("Australia");
		l.InsertAtBegin("Africa");
		l.InsertAtBegin("Chicago");
		l.InsertAtEnd("Miami");
		l.InsertAtEnd("Las Vegas");
		l.InsertAtMiddle("Texas", "Africa");
		l.Delete(4);
		l.display();
	}
}

