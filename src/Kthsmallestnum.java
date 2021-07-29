import java.util.*;
class comparison implements Comparator<Integer>{
	@Override
	public int compare(Integer t1,Integer t2) {
		Integer value=t1.compareTo(t2);
		if(value>0)
		{
			return -1;
		}
		else if(value>0)
		{
			return 1;
		}
		else {
			return 0;
		}
	}
}
public class Kthsmallestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PriorityQueue<Integer>heap=new PriorityQueue<Integer>(new comparison());
		PriorityQueue<Integer>heap1=new PriorityQueue<Integer>();
		int num=sc.nextInt();
		int k=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			int value=sc.nextInt();
			heap.add(value);
			heap1.add(value);
			if(heap.size()>k)
			{
				heap.remove();
			}
			
		}
		System.out.println(heap.peek());
		for(int i=0;i<k-1;i++)
		{
			heap.remove();
		}
		System.out.println(heap.peek());
	}

}
