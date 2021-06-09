package com.cg.demo.lab5;

//: Write a Java Program to validate the full name of an employee.
//Create and throw a user defined exception if firstName and lastName is blank.
import java.util.Scanner;



class NameNotValidException extends Exception
{
     public String validname()
     {
          return ("Name is not Valid....Please ReEnter the Name");
     }
}
class BlankNameNotValidException extends Exception
{
     public String blankName()
     {
          return ("Name should not be Blanked");
     }
}
class Employee
{
     
     String firstName, lastName;
     Employee()
     {    firstName=null;
          lastName=null;
     }
     Employee (String n, String c)
     {
          
          lastName=c;
          int l,temp=0;
          l = n.length();
          for(int i=0;i<l;i++)
          {
               char ch;
               ch=n.charAt(i);
               if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
                    temp=1;
          }
          /*———-Checking Name——————–*/
          try
          {
               if(temp==1)
                    throw new NameNotValidException();
               else
                    firstName=n;
          }
          catch(NameNotValidException e2)
          {
               System.out.println(e2);
          }
          
          
         try {
        	 if(firstName == " " || lastName== " ")
        		 throw new BlankNameNotValidException();
        	 else
        		 System.out.println("first name, Last Name Entered");
        	 
         }
         catch(BlankNameNotValidException e3){
        	 
         }
          
     }
     void display()
     {
          System.out.println(" FirstName LastName");
          System.out.println("---------------------");
          System.out.println(firstName+" "+lastName);
     }
}

public class Lab5Ex2 {
        public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("\nEnter First name: ");
	        String name = sc.next();
	        System.out.print("\nEnter Last name: ");
	        String name2 = sc.next();
	        
	        Employee s = new Employee(name, name2);
	          s.display();
		}
}
//class NameNotValidException extends Exception
//{
//     public String validname(String n)
//     {
//          return ("Name is not Valid..Please ReEnter the Name");
//     }
//}
//public class Lab5Ex2 {
//
//	//public static void main(String[] ) {
//		//Scanner sc= new Scanner(System.in);
//		
////		System.out.println("Enter your First name : ");
////		String name = sc.next();
////		
////		System.out.println("Enter your Last name : ");
////		String name2 = sc.next();
//		//temp =0;
//		//int n;
////		 try
////         { 
////			 System.out.println("Enter your First name : ");
////				String name = sc.next();
////				
////				System.out.println("Enter your Last name : ");
////				String name2 = sc.next();
////			 
////              if(name == " " && name2 ==" ")
////                   throw new NameNotValidException();
////              else
////                  System.out.println("First name is ");
////         }
////         catch(NameNotValidException e2){
////         
////              System.out.println(e2);
////         }
////
////
////		 System.out.println("sdfghnfghbn");
////
////		 System.out.println("sjkfgh");
////		 System.out.println("sdfghnfghbn");
////		 System.out.println("sjkfgh");
////		 System.out.println("sdfghnfghbn");
////		 
////		
//
//		public	static void notFound(String name1, String name2) throws  NameNotValidException
//		{
//			 if((name1==null && name2==null)||( name1.isEmpty()&& name2.isEmpty()))
//			 {
//				
//	                 throw new NameNotValidException();
//	   		
//			 }
//			 else
//			 {
//				System.out.println(name1);
//				System.out.println(name2);
//			
//			 }
//			
//		
//		}
//		public static void main(String[] args) {
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter your First name : ");
//			String name = sc.next();
//			
//			System.out.println("Enter your Last name : ");
//			String name2 = sc.next();
//		  try
//		  
//	              {
//			  
//				  notFound(null, null);
//	            		  }
//	         catch(Exception e2){
//	         
//	              System.out.println(e2);
//	         }
//			  }
//			
//		}
//	
