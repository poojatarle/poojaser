package dsapp.datastructure;

import java.util.Scanner;

public class Stack 
{ 
	
	int top;
	int size=3;
	int Stack[];
	
	
	public Stack(int a) {
		size=a;
		Stack=new int [size];
		top=-1;
	}

	Scanner sc = new Scanner(System.in);
	
		void push(int element)
		{
			if (top == size-1)
			{ 
				System.out.println("Stack is overflow");
			}
			else 
			{
				top++;
				Stack[top]=element;
				
			} 
		}

		
		int pop()
		{ 
			int ele=-999;
			if (top == -1)
			{ 
				
				System.out.println("Stack is empty");
			}
			else 
			{
				//System.out.println("deleted element"+Stack[top]);
				ele=Stack[top--];
				
				return ele;
			}
			return ele;
		}
		
		
		int peek()
		{ 
			int ele=-999;
			if (top == -1)
			{ 
				
				System.out.println("Stack is empty");
			}
			else 
			{
				ele=Stack[top--];
				return ele;
			}
			return ele;
		}
		
		
		void display()
		{  
	//		for(int size:Stack)
//		{
//				System.out.println(size+" ");
//		}
//		}
//			if (top == -1)
//			{ 
//				System.out.println("Stack is empty");
//			} 
//			
//			else 
//			{ 
//				System.out.println("Elements present in stack");
//				for(int i = size-1; i>=0; i--)   
//					System.out.println(Stack[i]);
//			} 
//}
			
	    		 System.out.println(toString());
	    	 
			 
		}
		
		public static void main(String args[])
		{ 
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter stack size");
			int size = sc.nextInt();
			Stack st = new Stack(3);
			
			int choice;
		do { 
			
			    System.out.println(" 1 Push element");
				System.out.println(" 2 Pop element");
				System.out.println(" 3 peek");
				System.out.println(" 4 display");
				System.out.println("Enter Choice");
				 choice=sc.nextInt();

				switch(choice)
				{
				case 1:
					 for(int i=0; i<3; i++)
		    		   { 
		    			   System.out.println("Enter elements");
		    			   int a= sc.nextInt();
		    			   st.push(a);
		    			   
		    		   }
				break;
				
				
				case 2:{
					int ele=st.pop();
				
				if(ele==-9999)
				{
					System.out.println("stack is empty");
				}
				else
					System.out.println("remove element"+ele);
					
				break;
				}
				
				case 3:{
					int ele=st.peek();
					if(ele==-9999)
					{ 
						System.out.println("Stack is empty");
					}
					else 
					{ 
						System.out.println("Peek element is:"+ele);
						
						break;
					} 
				}
				
					case 4:{
						st.display();
						break;
					}
					default:
						System.out.println("Enter correct choice");
				}
		}while(choice!=0);
		}


		@Override
		public String toString() {
		  String str ="";
		  for(int i= top ; i >=0 ; i--)
		  {
			  str+=Stack[i]+"\n";
		  }
		  return str ;
		}
}
				
							
				
			
			
			
			
		
		
		
		




