package com.practice2;

public class LinkedList {
	
	Link top = null;
	int counter=0;
	
	public void InsertAtBegin(String name){
		counter++;
		Link node1 =new Link();
		node1.next=top;
		node1.name =name;
		top=node1;
		/*while(top != null){
			//System.out.println(top.name);
			top = top.next;
			
			}*/
		//display();
		
	}
	public void InsertAtEnd(String name){
		counter++;
		Link node2 = new Link();
		Link temp1 = top;
		
		node2.name= name;
		node2.next= null;
		while(temp1.next != null)
		{
			temp1 = temp1.next;
		}
		temp1.next = node2;
		//display();
		
		}
	
	void InsertAtMiddle(String name, String match)
	{
		Link temp4 =new Link();
		Link temp3 =top;
		while(temp3.name != match)
		{
			temp3 = temp3.next;
		}
		temp4.name = name;
		temp4.next = temp3.next;
		temp3.next = temp4;
	}
	
	void Delete(int pos){
		int position=1;
		Link temp =top;
		
		while(position < pos-1){
			temp = temp.next;
			position++;
		}
		temp.next = temp.next.next;
		//System.out.println("Item Deleted");
	}
	public void sort(){
		
		Link temp = top;
		while(temp != null){
			
		}
		
		
	}
	void display()
	{	
		Link temp = top;
		while(temp.next !=null)
		{
			System.out.println("Value of node:" + temp.name);
			temp = temp.next;
		}
		System.out.println("Value of node:" + temp.name);
		
		
	}
}
