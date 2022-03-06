package questions;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlListExamp 
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add("april");
		l.add("may");
		l.add("june");
		l.add("july");
		l.add("august");
		
		l.add("november");
		System.out.println(l);
		l.addLast("december");
		l.addFirst("january");
		System.out.println(l);
		l.add(1, "febuary");
		l.add(2, "march");
		System.out.println(l);
		l.add(8, "september");
		l.add(9, "october");
		System.out.println(l);
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println("list is:"+i.next());
		}
		System.out.println("kkk-----------");
		for(int j=0;j<l.size();j++)
		{
			if(j%2==0)
				System.out.println(l.get(j));
		}
		for(int k=0;k<l.size();k++)
		{
			if(k%2!=0)
				System.out.println(l.get(k));
		}
		System.out.println(l);
		l.remove("august");
		System.out.println(l);
		System.out.println("check contains winter:"+l.contains("june"));
		System.out.println(l.peekFirst()+" "+l.peekLast());
		System.out.println(l);
		
	}

}