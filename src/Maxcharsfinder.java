import java.util.*;
public class Maxcharsfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Maxchars finders");
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		maxcharsfind(line);
		sc.close();
	}
	
	public static void maxcharsfind(String val)
	{
		HashMap<Character,Integer>dictionary=new HashMap<Character,Integer>();
		int max_occurance=0;
		Character max_occurer='0';
		char[] array=val.toCharArray();
		for(char c:array) {
			Integer count=dictionary.get(c);
			if(count==null)
			{
				dictionary.put(c,1);
			}
			else {
				dictionary.put(c, count+1);
			}
		}
		
		for(Character key:dictionary.keySet())
		{
			if(dictionary.get(key)>max_occurance)
			{
				max_occurer=key;
				max_occurance=dictionary.get(key);
			}
		}
		System.out.println("Max Occurer "+max_occurer+" occured "+max_occurance);
	}

}
