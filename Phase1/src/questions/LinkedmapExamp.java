package questions;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedmapExamp
{
	public static void main(String[] args)
	{
		LinkedHashMap<String, Integer> fruit =new LinkedHashMap<String, Integer>();
		fruit.put( "fruit1",2);
		fruit.put( "fruit5",5);
		fruit.put( "fruit6",6);
		fruit.put( "fruit7",7);
		fruit.put( "banana",10);
		fruit.put( "apple",1);
		fruit.put( "fruit3",3);
		fruit.put( "fruit4",4);
		fruit.put( "fruit8",8);
		fruit.put( "fruit9",9);
		fruit.put( "fruit23",23);
		System.out.println(fruit);
		for(String key:fruit.keySet())
		{
			System.out.println(key +" "+fruit.get(key));
		}
		
		fruit.remove(4);
		fruit.remove(7);
		System.out.println(fruit);
		System.out.println(fruit.hashCode());
		System.out.println("checking:"+fruit.containsValue("banana"));
		System.out.println("checking:"+fruit.containsValue("apple"));

		fruit.clear();
		
		System.out.println(fruit);
		
		
		
	}

}