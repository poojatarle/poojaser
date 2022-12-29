package dsapp.datastructure;


import java.util.Scanner;

public class Queue 
{
	static int queue[];
	static int front;
	static int rear;
	static int size;
	
	Queue(int a)
	{ 
		size=a;
		front=rear=-1;
		queue=new int[size];
	} 
	
	static void enqueue(int element)
	{ 
		if(rear==size-1)
		{
			System.out.println("Queue is full");
		}
		
		else 
		{ 
			rear++;
			queue[rear] = element;
		}
	}
			
	static void  dequeue()
	{ 
		if(front==rear)
		{ 
			System.out.println("Queue is empty");
			
		} 
		
		else
		{ 
			int n =-999;
			front++;
			n= queue[front];
			
		} 
		
	} 
	
	
	static void display()
	{ 
		if(front==rear)
		{
			System.out.println("Queue is empty");
		
		}
		
		for(int i=front+1; i<=rear; i++)
		{ 
			System.out.println(queue[i]);
		} 
		
	} 
	
	
	static void peek()
	{ 
		if(front==rear )
		{ 
		  System.out.println("Queue is empty");
		  return;
		}
		else
			 System.out.println(queue[front=1]);
	
	}



public static void main(String args[])
{ 
	Queue q1 = new Queue(3);
	Scanner sc = new Scanner(System.in);
	int choice;
	
	System.out.println("enter your choice");
	
	do {
	System.out.println("1 enqueue");
	System.out.println("2 dequeue");
	System.out.println("3 peek");
	System.out.println("4 display");
	
	
	 choice = sc.nextInt();
	
	switch (choice)
	{
	case 1: {
		System.out.println("enter your element");
		int element = sc.nextInt();
		q1.enqueue(element);
		
		break;
	
	}
	case 2:{ 
	 q1.dequeue();
	 break;
	} 
	
	case 3:{ 
		q1.peek();
		break;
	}
	
	case 4:{ 
		q1.display();
		break;
	}
	
	default:
		System.out.println("Enter correct choice");
	
	}
	}while(choice!=0);
}
}
	
				
		
	




	//System.out.println("Elements of queue");

          
	/*
	q1.enqueue(10);
	q1.enqueue(30);
	q1.enqueue(20);
    q1.enqueue(40);
	
	
	System.out.println("Queue after enqueue operation");
     q1.display();
	//q1.front();
    q1.dequeue();
    q1.dequeue();
    q1.dequeue();


	System.out.println("Queue after dequeue operation");
	q1.display();
	
	*/
	