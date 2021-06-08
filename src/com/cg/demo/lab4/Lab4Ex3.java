package com.cg.demo.lab4;

public class Lab4Ex3 {



abstract class Item1{
	
	private int identification_no;
	private String tittle;
	private int no_of_copies;
	public Item1(int identification_no, String tittle, int no_of_copies) //constructor
	{
		super();
		this.identification_no = identification_no;
		this.tittle = tittle;
		this.no_of_copies = no_of_copies;
	}
	//setter and getter
	public int getIdentification_no() {
		return identification_no;
	}
	public void setIdentification_no(int identification_no) {
		this.identification_no = identification_no;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public int getNo_of_copies() {
		return no_of_copies;
	}
	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}
	//equal
	@Override
	public boolean equals(Object obj){
		if(obj == null)
		return false;
		Item1 otherItem = (Item1) obj;
		return identification_no == otherItem.identification_no && tittle == otherItem.tittle && no_of_copies
		== otherItem.no_of_copies;
		}
	//to String
	 @Override
	 public String toString() {
	 	return "Item1 [identification_no=" + identification_no + ", tittle=" + tittle + ", no_of_copies=" + no_of_copies
	 			+ "]";
	 }
	 //additem
public void addItem(int identification_no,String tittle,int no_of_copies)
		{
			setIdentification_no( identification_no);
			setTittle( tittle);
			setNo_of_copies(no_of_copies);
		}
  //print
  public void addItem(){
	 no_of_copies++;
   }

   public void print()
   {
	   System.out.println("identification_no"+identification_no);
	   System.out.println("tittle"+tittle);
	   System.out.println("no_of_copies"+no_of_copies);
   }
   
   //checkin
   public void checkIn()
   {
	   System.out.println("I am in check In");
   }
   
   public void checkOut()
   {
	   System.out.println("I am in check Out");
   }
   

  	}
public class WrittenItem extends Item1 {
	
	
	public WrittenItem(int identification_no, String tittle, int no_of_copies,String author) {
		super(identification_no, tittle, no_of_copies);
		this.author=author;
		// TODO Auto-generated constructor stub
	}
	private String author;

	
	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIdentification_no() {
		return super.getIdentification_no();
	}
	
	public String getTittle() {
		return super.getTittle();
	}
	
	public int getNo_of_copies() {
		return super.getNo_of_copies();
	}	
public boolean equals(Object obj){
		if(obj == null)
		return false;
		WrittenItem otherWrittenItem = (WrittenItem) obj;
		return super.equals(otherWrittenItem) && author ==otherWrittenItem.author;
		}
		}
public class Book extends WrittenItem{

public Book(int identification_no, String  tittle, int no_of_copies,String author){
super(identification_no,  tittle,no_of_copies, author);
}
public boolean equals(Object obj){
if(obj == null)
return false;
Book otherBook = (Book) obj;
return super.equals(otherBook);
}
public String toString(){
return super.toString();
}
public int getIdNum(){
return super.getIdentification_no();
}
public String getTitle(){
return super.getTittle();
}
public int getNumCopies(){
return super.getNo_of_copies() ;
}
public String getAuthor(){
return super.getAuthor();
}
public void print(){
System.out.println("Display info about a book: ");
super.print();
}
public void checkIn(){
super.checkIn();
}
public void checkOut(){
super.checkOut();
}
public void addItem(){
   super.addItem();
}
}
}