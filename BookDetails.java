//Encapsulation & Inheritance
import java.util.Scanner;

//Book class
class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;

	public int getBookNo() 
	{
		System.out.println("book number is : ");
		return bookNo;
	}
	public void setBookNo(int bookNo) 
	{
		this.bookNo = bookNo;
	}
	public String getTitle() 
	{
		System.out.println("title is : ");
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getAuthor() 
	{
		System.out.println("author is : ");
		return author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public float getPrice() 
	{
		System.out.println("price is : ");
		return price;
	}
	public void setPrice(float price) 
	{
		this.price = price;
	}
}

//EngineeringBook class derived from Book class
class EngineeringBook extends Book
{
	private String category;

	public String getCategory() 
	{
		System.out.println("category is : ");
		return category;
	}
	public void setCategory(String category) 
	{
		this.category = category;
	}	
}


public class BookDetails 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book obj = new Book();
		EngineeringBook eb = new EngineeringBook();
		obj.setBookNo(sc.nextInt());
		obj.setTitle(sc.next());
		obj.setAuthor(sc.next());
		obj.setPrice(sc.nextFloat());
		eb.setCategory(sc.next());
		System.out.println(obj.getBookNo());
		System.out.println(obj.getTitle());
		System.out.println(obj.getAuthor());
		System.out.println(obj.getPrice());
		System.out.println(eb.getCategory());
	}
}
