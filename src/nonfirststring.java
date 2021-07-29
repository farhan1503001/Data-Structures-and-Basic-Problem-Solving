import java.util.*;
public class nonfirststring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		HashMap<Character,Integer>map=new HashMap<>();
		for(char c:input.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c,1);
			}
			else {
				map.put(c,map.get(c)+1);
			}
		
		}
		//ArrayList<Character>storer=new ArrayList<>();
		int min=Integer.MAX_VALUE;
		char hold='#';
		for(char key:map.keySet())
		{
			if(map.get(key)==1)
			{
				if(input.indexOf(key)<min)
				{
					hold=key;
					min=input.indexOf(key);
				}
			}
		}
		System.out.println(hold);
	}

}
