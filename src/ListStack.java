
public class ListStack {
	private int max_size;
	private int[] stackArray;
	private int top;
	public ListStack(int size) {
		this.max_size=size;
		this.stackArray=new int[size+1];
		this.top=-1;
	}
	public boolean push(int value)
	{
		if(this.top==this.max_size)
		{
			return false;
		}
		top++;
		stackArray[top]=value;
		return true;
	}
	public int top() {
		return stackArray[top];
	}
	public void pop() {
		if(!this.is_empty()) {
			int temp=stackArray[top];
			stackArray[top]=0;
			top--;
		}
		else {
			System.out.println("Stack is empty");
		}
	
	}
	public boolean is_empty() {
		return this.top==-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListStack stacker=new ListStack(11);
		stacker.push(23);
		stacker.push(11);
		System.out.println(stacker.top());
		stacker.pop();
		System.out.println(stacker.top());

	}

}
