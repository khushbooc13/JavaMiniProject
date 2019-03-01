import java.lang.*;
import java.io.*;

class Marksheet
{
	static int st=0;
	final String course="Diploma in information Technology(IF)";
	int max_marks[];
	int min_marks[];
	int marks_obt[]=new int[30];
	int total_maxmarks=0;
	int total_minmarks=0;
	int total_marksobt=0;
	String sub1[]={"phy(th)","phy(tm)","phy(pr)","che(th)","che(tm)","che(pr)","mat(th)","mat(tm)","eng(th)","eng(tm)","eng(tw)","eg(pr)","eg(tw)","ecf(pr)","ecf(tw)","bwp(tw)"};			
	String sub2[]={"cms(th)","cms(tm)","cms(or)","cms(tw)","maths(th)","maths(tm)","eeg(th)","eeg(tm)","eeg(pr)","elt(th)","elt(tm)","elt(tw)","cpr(th)","cpr(tm)","cpr(pr)","cpr(tw)","wpd(pr)","dls(or)","dls(tw)","pp(tw)"};
	String sub3[]={"phy(th)","phy(tm)","phy(pr)","chem(th)","chem(tm)","chem(pr)","maths(th)","maths(tm)","eng(th)","eng(tm)","eng(tw)","eg(pr)","eg(tw)","ecf(pr)","ecf(tw)","bwp(tw)"};			
	String sub4[]={"phy(th)","phy(tm)","phy(pr)","che(th)","che(tm)","che(pr)","mat(th)","mat(tm)","eng(th)","eng(tm)","eng(tw)","eg(pr)","eg(tw)","ecf(pr)","ecf(tw)","bwp(tw)"};
	int max_marks1[]={80,20,50,80,20,50,80,20,80,20,25,50,50,50,25,25};
	int min_marks1[]={28,00,20,28,00,20,28,00,28,00,10,20,20,20,10,10};
	String sub[]={};
	String grade;
	int per=0;
	int sem,seat_no,enroll_no;
	String name;
	int len;
	void getData()
	{
		try
		{
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Name ");
			name=b.readLine();
			System.out.print("Enter Seat No. ");
			seat_no=Integer.parseInt(b.readLine());
			System.out.print("Enter Enrollment No. ");
			enroll_no=Integer.parseInt(b.readLine());
			System.out.print("Which Sem?(1-4) ");
			sem=Integer.parseInt(b.readLine());
			switch (sem)
			{
				case 1:
				{
					
					for(int i=0;i<sub1.length;i++)
					{
						total_maxmarks=total_maxmarks+max_marks1[i];
						System.out.println("ENTER MARKS OBTAINED IN "+sub1[i]);
						marks_obt[i]=Integer.parseInt(b.readLine());
						if(marks_obt[i]>max_marks1[i])
						{
							System.out.println("Sorry Marks Cannot Be Greater Than "+max_marks1[i]);
							break;
						}
						else if(marks_obt[i]<0)	
						{
							System.out.println("Marks Cannot Be Less Than 0");
							break;						
						}
						else
						{
							continue;
						}
				               	}
					sub=sub1;
					max_marks=max_marks1;
					min_marks=min_marks1;
					break;
				}
				case 2:
				{	
					int max_marks2[]={80,20,25,25,80,20,80,20,50,80,20,25,80,20,50,25,50,25,25,50};
					int min_marks2[]={28,00,10,10,28,00,28,00,20,28,00,10,28,00,20,10,20,10,10,20};
					for(int i=0;i<sub2.length;i++)
					{
						total_maxmarks=total_maxmarks+max_marks2[i];
						System.out.println("ENTER MARKS OBTAINED IN "+sub2[i]);
						marks_obt[i]=Integer.parseInt(b.readLine());
						if(marks_obt[i]>max_marks2[i])
						{
							System.out.println("MARKS CANNOT BE GREATER THAN "+max_marks2[i]);
								break;
						}
						if(marks_obt[i]<0)
						{
							System.out.println("MARKS CANNOT BE LESS THAN "+min_marks2[i]);
							break;						
						}
					}	
					sub=sub2;
					max_marks=max_marks2;
					min_marks=min_marks2;
					break;
				}
				case 3:
				{
					int max_marks3[]={80,20,50,80,20,50,80,20,80,20,25,50,50,50,25,25};
					int min_marks3[]={28,00,20,28,00,20,28,00,28,00,10,20,20,20,10,10};
					for(int i=0;i<sub3.length;i++)
					{
						total_maxmarks=total_maxmarks+max_marks3[i];
						System.out.println("ENTER MARKS OBTAINED IN "+sub3[i]);
						marks_obt[i]=Integer.parseInt(b.readLine());
						if(marks_obt[i]>max_marks3[i])
						{
							System.out.println("MARKS CANNOT BE GREATER THAN "+max_marks3[i]);
								break;
						}
						if(marks_obt[i]<0)
						{
							System.out.println("MARKS CANNOT BE LESS THAN "+min_marks3[i]);
							break;						
						}
						}
					sub=sub3;
					max_marks=max_marks3;
					min_marks=min_marks3;
					break;
				}
				case 4:
				{	
					int max_marks4[]={80,20,50,80,20,50,80,20,80,20,25,50,50,50,25,25};
					int min_marks4[]={28,00,20,28,00,20,28,00,28,00,10,20,20,20,10,10};
					for(int i=0;i<sub4.length;i++)
					{
						total_maxmarks=total_maxmarks+max_marks4[i];
						System.out.println("ENTER MARKS OBTAINED IN "+sub4[i]);
						marks_obt[i]=Integer.parseInt(b.readLine());
						if(marks_obt[i]>max_marks4[i])
						{
							System.out.println("MARKS CANNOT BE GREATER THAN "+max_marks4[i]);
							break;
						}
						if(marks_obt[i]<0)
						{
							System.out.println("MARKS CANNOT BE LESS THAN "+min_marks4[i]);
							break;						
						}
					}
					sub=sub4;
					max_marks=max_marks4;
					min_marks=min_marks4;
					break;
				}
				default:
				{
					System.out.println("Only Till 4th Sem Results Will Be Displayed");
					break;
				}
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Non-Numeric Value Enetred");
		}
		catch(IOException e)
		{
			System.out.println("An IO Exception Occured");
		}
	}
	void calcTotalMarksObt()
	{
		for(int i=0;i<marks_obt.length;i++)
		{
			total_marksobt+=marks_obt[i];
		}
	}  
	void calcPercentage()
	{
		per=((total_marksobt*100)/total_maxmarks);
	}
	void calcGrade()
	{
		if(per>=75.00)
			grade="Distinction";
		else if(per >=60.00 && per<=75.00)
			grade="First Class";
		else if(per >=40.00 && per<=60.00)
			grade="Second Class";
		else
			grade="Fail";
	}
	void display()
	{
		int key=0,i,count=1;
		long gp=0;
		try
		{	
			RandomAccessFile din=new RandomAccessFile("Result"+seat_no+".txt","rw");
			din.seek(0);
			while(din.getFilePointer()<din.length())
			{
				System.out.println("MSBTE");
				System.out.println("Name: "+din.readUTF());	
				System.out.println("Seat No. : "+din.readInt());
				System.out.println("Enrollment No. : "+din.readInt());
				System.out.println("Semester : "+din.readInt());	
				for(i=0;i<sub1.length;i++)
				{
					System.out.println(din.readUTF());
				}
				System.out.println(din.readUTF());
				System.out.println(din.readUTF());
				System.out.println(din.readUTF());
				System.out.println(din.readUTF());
				din.close(); 
			}
		}
		catch(Exception e)
		{
			System.out.println("");
		}	
	}
	void storeData()
	{
		int i,j=0;
		try
		{
			RandomAccessFile dout=new RandomAccessFile("Result"+seat_no+".txt","rw");
			dout.writeUTF(name);
			dout.writeInt(seat_no);
			dout.writeInt(enroll_no);
			dout.writeInt(sem);
			for(i=0;i<sub1.length;i++)
			{
				dout.writeUTF("Subject\t\tMax Marks\tMin Marks\tMarks Obtained\n");
				String s=sub[j]+"\t\t"+max_marks1[j]+"\t\t"+min_marks1[j]+"\t\t"+marks_obt[j]+"\n";
				for(j=0;j<sub1.length;j++)
				{
					dout.writeUTF(sub[j]+"\t\t"+max_marks1[j]+"\t\t"+min_marks1[j]+"\t\t"+marks_obt[j]+"\n");	
				}
				dout.writeUTF("Total Marks : "+total_maxmarks);
				dout.writeUTF("Marks Obtained : "+total_marksobt);
				dout.writeUTF("Percentage : "+per);
				dout.writeUTF("Grade : "+grade);
			}
			dout.close();
		}
		catch(Exception e)
		{
			System.out.println("Data Stored Successfully");
		}
	}
}
class MarksheetGeneration extends Marksheet
{
	public static void main(String args[])
	{
		try
		{
			int n,i;
			char c;
			System.out.print("Enter The Number Of Students Whose Data You Want To Enter ");
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			n=Integer.parseInt(b.readLine());
			Marksheet m[]=new Marksheet[n];
			for(i=0;i<n;i++)
			{
				m[i]=new Marksheet();
				m[i].getData();
				m[i].calcTotalMarksObt();
				m[i].calcPercentage();
				m[i].calcGrade();
				System.out.print("Do You Want To Store The Data?(y/n) ");
				c=b.readLine().charAt(0);
				if(c=='y'||c=='Y')
				{
					m[i].storeData();
				}
				else if(c=='n'||c=='N')
				{
					System.out.println("Data Not Stored");
					System.out.print("Do You Want To Continue?(y/n) ");
					c=b.readLine().charAt(0);
					if(c=='y'||c=='Y')
					{
						continue;
					}
					else
					{
						break;
					}
				}
				else
				{
					System.out.println("Wrong Value Entered");
				}
				
			}
			st=0;
			for(i=0;i<n;i++)
			{
				m[i].display();
			}
		}
		catch(IOException e)
		{
			System.out.println("IO Exception Occured");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Non-Numeric Value Entered");
		}
	}
}