import java.io.*;
class Magazine
{
	private int m_id,price,flag=0;
	private String m_name="",publisher="";	
	void addMagazine(int id)
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			m_id=id+1;
			System.out.println("Enter Magazine name,Publisher,Magazine price ");		
			m_name=br.readLine();
			publisher=br.readLine();
			price=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
		}
	}
	void display(int id)
	{
			if(id==0)
			System.out.println("Mag_id\t   |  Mag_Name\t   |  Publisher\t   |   Price\t   | ");
			System.out.println("------------------------------------------------------------");
			System.out.println(m_id+"\t   |  "+m_name+"\t   |  "+publisher+"\t   |   "+price+"\t   |   ");
	}
	void issueMagazine()
	{	
		if(flag==1)
		{
			System.out.println("You are already reading the magazine  ");
		}
		else
		{
			System.out.println(m_name+" Reading");
			flag=1;
		}
	}
	void returnMagazine()
	{	
		if(flag==0)
		{
			System.out.println("Magazine not issued:");
		}
		else
		{		
			System.out.println(m_name+" Returned");
			flag=0;
		}
	}
}