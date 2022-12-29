package dsapp.datastructure;

import java.util.Scanner;

public class LinkedList
{

	class Node
	{ 
		 int data;  
	     Node next;
	        
	        Node(int data)
	        {  
	            this.data = data;  
	            next = null;  
	        } 
	}
	static int size=3;
	Node head=null;
	Node tail=null;
	
	public void insert (int data)
	{ 
	Node n1=new Node(data);
	
	 if(head == null)
	 { 
		 head=n1;
		 tail=n1;
	 } 
	 
	 else 
	 { 
		 tail.next=n1;
		 tail=n1;
	 }
	} 
	
	void display()
	{ 
		Node current=head;
		
		 if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        System.out.println("Nodes of singly linked list: ");  
	        while(current != null) 
	        {  
	        	  System.out.print(current.data + " ");  
	              current = current.next;  
	          }  
	         System.out.println();  
	      }  
	
	public int deletefirst() 
	{ 
		int val =head.data;
		head=head.next;
		
		/*if (head==null)
		{ 
			tail=null;
		}
		size--;*/
		return val;
		
	}
	
	public Node get(int index)
	{ 
		Node node = head;
		for (int i=0;i<index; i++)
		{
			node = node.next;
		}
	 return node;
		}
	
	public int deleteLastNode()
	{ 
		if(size<=1)
		{ 
			return deletefirst();
		} 
		Node SecondLastNode = get(size-1);
		int val = tail.data;
		tail= SecondLastNode;
		//tail.next=null;
		
		return val;
	}
		
	        
	      public static void main(String[] args)
	      { 
	    	  LinkedList l1 = new LinkedList(); 
	    	  Scanner sc = new Scanner(System.in); 
	    	  int choice;
	    	  do 
	  		{
	  			    System.out.println(" 1 Insert");
	  				System.out.println(" 2 Display");
	  				System.out.println(" 3 DeleteFirstNode");
	  				System.out.println("Enter Choice");
	  				
					 choice=sc.nextInt();
					 switch(choice)
					 { 
					 
					 case 1:
						 for(int i=0; i<size; i++)
			    		   { 
			    			   System.out.println("Enter elements");
			    			   int a= sc.nextInt();
			    			   l1.insert(a);
			    		   }
			    			   break;
						
						case 2:
						{ 
							l1.display();
							break;
						}
						
						case 3: 
						{ 
							l1.deletefirst();
							break;
						}	
						 default:
						 {
								System.out.println("Enter correct choice");
						} 
					 }
	    	  
	      }while(choice!=0);
	      }
}
	            
	         /* LinkedList l1 = new LinkedList();  
	          
	          l1.insert(1);  
	          l1.insert(2);  
	          l1.insert(3);  
	          l1.insert(5); 
	          l1.insert(6);
	          
	          
	          l1.display();  
	          l1.deletefirst();
	          l1.display(); 
	          l1.deleteLastNode();
	          l1.display(); 
	          
	          
	        }*/
	


			
		


