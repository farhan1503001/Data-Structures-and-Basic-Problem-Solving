import java.util.ArrayList;
import java.util.*;
class stack{
	private ArrayList<Integer>list=new ArrayList<>();
	private int top_index;
	public stack()
	{
		this.top_index=-1;
	}
	public void push(int value) {
		list.add(value);
		top_index=top_index+1;
	}
	public void pop() {
		int temp=list.get(top_index);
		list.remove(top_index);
		top_index--;
	}
	public int top() {
		return list.get(top_index);
	}
	public boolean is_empty() {
		if(this.top_index==-1)
		{
			return true;
		}
		else {
			return false;
		}
	}
}
public class Maximumstackelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num_op=sc.nextInt();
		stack maxstack=new stack();
		while(num_op>0)
		{
			int op=sc.nextInt();
			switch(op) {
			case 1:
				int value=sc.nextInt();
				if(!maxstack.is_empty()) {
				maxstack.push(Math.max(value,maxstack.top()));
				}
				else {
					maxstack.push(value);
				}
				break;
			case 2:
				if(!maxstack.is_empty())
				{
					maxstack.pop();
				}
				break;
			case 3:
				System.out.println(maxstack.top());
				break;
			default:
				//continue;
				break;
				
			}
			
			num_op--;
		}

	}

}
