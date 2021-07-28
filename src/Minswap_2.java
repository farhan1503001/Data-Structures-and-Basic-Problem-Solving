import java.util.*;
public class Minswap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
		boolean[] visited=new boolean[num];
		Arrays.fill(visited, false);
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			map.put(arr[i],i);
		}
		Arrays.sort(arr);
		//System.out.println(arr[0]);
		int counter=0;
		for(int i=0;i<num;i++)
		{
			if(visited[i] || map.get(arr[i])==i) {
				continue;
			}
			int j=i,link_num=0;
			while(!visited[j]) {
				visited[j]=true;
				j=map.get(arr[j]);
				link_num++;
			}
			if(link_num>0) {
				counter+=link_num-1;
			}
		}
		
		System.out.println(counter);

	}

}
