package dsapp.datastructure;

import java.util.Scanner;

public class Array 
{ 
	static int size=3;
	int arr[]=new int[size];
	int ele;
	
	Scanner sc = new Scanner(System.in);
		
     public void insert()
     { 
     for(int i=0; i<size; i++)
     { 
    	 
    	 System.out.println("Enter array elements");
    	 arr[i] = sc.nextInt();
     } 
     } 
     
     public void display()
     {
    	 System.out.println("Elements in array");
    	 for (int i=0; i<size; i++)
    	 { 
    		 System.out.println(arr[i]);
    	 } 
     } 
     
     
     public void delete()
     { 
    	 System.out.println("Enter no you want delete");
    	 int no = sc.nextInt();
    	 
    	 for(int i=0; i<arr.length; i++)
    	 { 
    		if( arr[i]==no)
    		{ 
    		 for (int k=i; k<arr.length-1; k++)
    			 { 
    			 arr[k]=arr[k+1];
    			 }
    			 } 
    	/*	else
    		{ 
    			System.out.println("No is not present");
    		}*/
     }
     System.out.println("After deleting operation");
     for (int i=0; i<size;i++)
     { 
    	 System.out.println(arr[i]);
     } 
     }
     
     
     public void search()
     { 
    	 System.out.println("Enter the no");
    	 int no = sc.nextInt();
    	 int count =0;
    	 for (int i=0; i<size; i++)
    	 { 
    		 if (arr[i]==no)
    		 { 
    			 count =1;
    			 break;
    		 }
    	 } 
    	 if(count==0)
    	 { 
    		 System.out.println("No is not present");
    	 }
    	 else 
    	 { 
    		 System.out.println("No is present");
    	 }
     }
     
 
    
  
    	 public static void main(String args[])
    	 { 
    		 Array a1 = new Array();
    		 Scanner sc = new Scanner(System.in);
    		 int choice;
    		
    	     do 
    	     {
		
			    System.out.println(" 1 Insert");
				System.out.println(" 2 Delete");
				System.out.println(" 3 Search");
				System.out.println(" 4 Display");
				
				System.out.println("Enter Choice");
				 choice=sc.nextInt();
				 
				 switch(choice)
				 { 
	case 1:
	{ 
		a1.insert();
		break;
	} 
	
	case 2:
	{ 
		a1.delete();
		break;
	}
	
	case 3: 
	{ 
		a1.search();
		break;
	} 
	
	case 4:
	{ 
		a1.display();
		break;
	}
		
	 default:
			System.out.println("Wrong choice! Please enter correct choice");
	} 
   }while(choice!=0);
   } 
    	 } 

    
		
	
	  
    	
	
		
	

				 
				 
				 
				 
				 

