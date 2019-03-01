import java.io.*;
class Library
{
	public static void main(String args[])
	{
		int a,j,b_issued=0,i,m_read=0;
		int count=0,count1=0;
		Magazine m[]=new Magazine[5];
		Book b[]=new Book[10];	
		for(i=0;i<10;i++)
			b[i]=new Book();
		for(i=0;i<5;i++)
			m[i]=new Magazine();
		try
		{
			while(true)
			{
				System.out.println("---------Welcome to Library Management System---------");
				System.out.println("1-Add Book\n2-Issue Book\n3-Return Book\n4-Display All Books\n5-Add Magazines\n6-Display Magazines\n7-Read Magazine\n8-Return Magazine\n9-Exit");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				int ch=Integer.parseInt(br.readLine());
				switch(ch)
				{
					case 1:
						a=count;
						count++;
						for(j=a;j<count;j++)
						{
							b[j].addBook(j);
						}
						break;
					case 2:
						System.out.println("Enter the Book id you want to issue: ");
						int id=Integer.parseInt(br.readLine());
						b_issued++;
						if(b_issued>3)
						{
							System.out.println("You have already issued 3 books ");
						}
						else
						{
							if(id-1<=count)
							{	
								b[id-1].issueBook();
							}
							else
 								System.out.println("Sorry book not available: ");	
						}
						break;
					case 3:
						if(b_issued==0)
						{
							System.out.println("No book issued: ");
						}
						else
						{
							System.out.println("Enter the Book id you want to return: ");
							int id1=Integer.parseInt(br.readLine());
							if(id1-1<=count)
							{	
								b[id1-1].returnBook();
							}
							else
 								System.out.println("Sorry book not available: ");	
						}
						break;
					case 4:
						if(count==0)
							System.out.println("No books available");
						for(j=0;j<count;j++)
						b[j].display(j);		
						break;
					case 5:
						a=count1;
						count1++;
						for(j=a;j<count1;j++)
						{
							m[j].addMagazine(j);
						}
						break;
					case 6:		
						if(count1==0)
							System.out.println("No magazines available");
						for(j=0;j<count1;j++)
						m[j].display(j);	
						break;
					case 7:
						System.out.println("Enter the Magazine id you want to read: ");
						int id2=Integer.parseInt(br.readLine());
						m_read++;
						if(m_read>=2)
						{
							System.out.println("You are already reading a magazine ");
						}
						else
						{
							if(id2-1<=count1)
							{	
								m[id2-1].issueMagazine();
							}
							else
 								System.out.println("Sorry magazine not available: ");	
						}
						break;
					case 8:
						if(m_read==0)
						{
							System.out.println("No Magazine issued: ");
						}
						else
						{
							System.out.println("Enter the Magazine id you want to return: ");
							int id3=Integer.parseInt(br.readLine());
							if(id3-1<=count1)
							{	
								m[id3-1].returnMagazine();
							}
							else
 								System.out.println("Sorry Magazine not available: ");	
						}
						break;
					case 9:
						System.exit(1);
						break;
					default:
						System.out.println("Invalid Choice: ");
						break;
				}
			}
		}
		catch(Exception e)
		{}	
		
				
		
	}


}