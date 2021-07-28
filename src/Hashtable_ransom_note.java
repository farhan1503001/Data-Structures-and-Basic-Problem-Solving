import java.util.*;
public class Hashtable_ransom_note {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.nextLine();
		String temp=sc.nextLine();
		String[] magazine=temp.split(" ");
		HashMap<String,Integer>map=new HashMap<>();
		for(String value:magazine) {
			//System.out.println(value);
			if(!map.containsKey(value)) {
				map.put(value,1);
			}
			else {
				map.put(value,map.get(value)+1);
			}
		}
		boolean fall=false;
		String[] query=sc.nextLine().split(" ");
		for(String key:query) {
			if(map.containsKey(key)==false) {
				fall=true;
				//System.out.println(key);
				break;
			}
			map.put(key,map.get(key)-1);
			
		}
		if(fall) {
			System.out.println("No");
		}
		else {
			boolean iterflag=false;
			for(String key:map.keySet()) {
				if(map.get(key)>=0) {
					iterflag=true;
					break;
				}
			}
			if(iterflag) {
				System.out.println("No");
			}
			else {
				System.out.println("Yes");
			}
			
		}

	}
}
