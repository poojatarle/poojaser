package dsapp;

import java.util.Scanner;

import dsapp.datastructure.Array;
import dsapp.datastructure.LinkedList;
import dsapp.datastructure.Queue;
import dsapp.datastructure.Stack;

public class Application 
{ 
	public static void main(String args[])
	{ 
		
		Scanner sc = new Scanner(System.in);
		int choice;
		int choice1;
		
		do
		{ 
			System.out.println("1. Array");
			System.out.println("2. Queue");
			System.out.println("3.Stack ");
			System.out.println("4. LinkedList");
			System.out.println("5. Exit");
			System.out.println("6. Enter choice");
			
			 choice=sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 
				  Array a1 = new Array();
				  ;
				   char cho;
				do
				   {
					   System.out.println("1. Insertion");
						System.out.println("2. Deletion");
						System.out.println("3. Search");
						System.out.println("4. Display");
						
						choice1=sc.nextInt();
						   switch(choice1)
						   {
				   
				   case 1:
				   a1.insert();
				   break;

				    case 2:	
					a1.delete();
					break;
					
				    case 3:
				    a1.search();
				    break;
				    	
					
				    case 4:
					a1.display();
					
					break;
				    
						   
				   default:
						System.out.println("Wrong choice! Please enter correct choice");
				   }
				   System.out.println("Do you want to continue?");
				   cho=sc.next().charAt(0);
			 }while(cho=='y');
			 break;
				  

		
     

             case 2:
	         Queue q1 = new Queue(3);
	         do
	          {
		    System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Display");
			
			choice1=sc.nextInt();
			   switch(choice1)
			   {
	   
	   case 1:
		   for(int i=0; i<3; i++)
		   { 
			   System.out.println("Enter elements");
			   int a= sc.nextInt();
			   q1.enqueue(a);
			   
		   }
	   break;

	    case 2:	
		q1.dequeue();
		break;
		
	    case 3:
	    q1.display();
	    break;
	    
	    default:
			System.out.println("Wrong choice! Please enter correct choice");
	    }
	    System.out.println("Do you want to continue?");
	      cho=sc.next().charAt(0);
          }while(cho=='y');
          break;
	  
	
	         
	         
             case 3:
            	 Stack st = new Stack(3);
    	         do
    	          {
    		    System.out.println("1. Push");
    			System.out.println("2. Pop");
    			System.out.println("3. Peek");
    			System.out.println("4. Display");
    			
    			choice1=sc.nextInt();
    			   switch(choice1)
    			   {
    	   
    	   case 1:
    		   for(int i=0; i<3; i++)
    		   { 
    			   System.out.println("Enter elements");
    			   int a= sc.nextInt();
    			   st.push(a);
    			   
    		   }
    	   
    	   break;

    	    case 2:	
    		st.pop();
    		break;
    		
    	    case 3:
    	    	System.out.println(st.peek());
    	    	  break;
    	   
    	    
    	     case 4:
        	  //   st.display();
    	    	 
    	    	 for(int i=0 ; i< 3 ;i++)
    	    	 {
    	    		 System.out.println(st.toString());
    	    	 }
        	    break;
        	    
    	     default:
					System.out.println("Wrong choice! Please enter correct choice");
			   }
			   System.out.println("Do you want to continue?");
			   cho=sc.next().charAt(0);
		 }while(cho=='y');
		 break;
			  
   
    	         
    	         
             case 4:
            	 LinkedList l1 = new LinkedList();   
    	         do
    	          {
    		    System.out.println("1. Insert");
    			System.out.println("2. DeleteFirstNode");
    			System.out.println("3. Display");
    			
    			choice1=sc.nextInt();
    			   switch(choice1)
    			   {
    	   
    	   case 1:
    		   for(int i=0; i<3; i++)
    		   { 
    			   System.out.println("Enter elements");
    			   int a= sc.nextInt();
    			   l1.insert(a);
    			   
    		   }
    	   break;

    	    case 2:	
    		l1.deletefirst();
    		break;
    		
    	    case 3:
    	    l1.display();
    	    break;
    	    
    	    default:
				System.out.println("Wrong choice! Please enter correct choice");
		   }
		   System.out.println("Do you want to continue?");
		   cho=sc.next().charAt(0);
	 }while(cho=='y');
	 break;
		  
    	
    	    }
    	          }while(choice!=0);
    	         
	          }
}
				 
				    
					 
				 
				 
				
					
			 
							 
							 
							 
							 
					 
					 
				 
						 
				 
			 
		
		
	
			 
		
		
			 
		
	





	

