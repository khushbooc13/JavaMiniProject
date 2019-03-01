import java.io.*;
class Book
{
	private int b_id,price,flag=0;
	int quantity;
	private String b_name="",author="";	
	void addBook(int id)
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			b_id=id+1;
			System.out.println("Enter Book name,Author,Book price and Quantity of Books");		
			b_name=br.readLine();
			author=br.readLine();
			price=Integer.parseInt(br.readLine());
			quantity=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
		}
	}
	void display(int id)
	{
			if(id==0)
				System.out.println("Bookid\t   |  BookName\t   |  Author\t   |   Price\t   |  Quantity|");
				System.out.println("-----------------------------------------------------------------------");
			System.out.println(b_id+"\t   |  "+b_name+"\t   |  "+author+"\t   |   "+price+"\t   |   "+quantity+"      |");
	}
	void issueBook()
	{	
		if(flag==1)
		{
			System.out.println("You have already issued  Book  ");
		}
		else
		{
			System.out.println(b_name);
			System.out.println("Quantity:"+quantity);
			if(quantity>0)
			{
				System.out.println("Book Sucessfully Issued:");
				quantity--;
			}
			else
				System.out.println("Sorrry Book is not Available:");	
			System.out.println("Quantity after issuing: "+quantity);
			flag=1;
		}
	}
	void returnBook()
	{	
		if(flag==0)
		{
			System.out.println("Book not issued:");
		}
		else
		{		
			System.out.println(b_name);
			System.out.println("Quantity:"+quantity);
			System.out.println("Book Sucessfully Returned:");
			quantity++;	
			System.out.println("Quantity after issuing: "+quantity);
			flag=0;
		}
	}
}