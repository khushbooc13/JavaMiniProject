import java.util.*;
class example 
{
	public static void main(String ar[])
	{
		Vector v=new Vector();
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		v.addElement("e");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(" "+v.elementAt(i));
		}
		v.insertElementAt("z",0);
		System.out.println("");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(" "+v.elementAt(i));
		}
	}
}