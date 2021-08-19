public class queuelist{
	private int maxsize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems;
	public queuelist(int size) {
		this.maxsize=size;
		this.front=0;
		this.rear=-1;
		this.nItems=0;
		this.queueArray=new long[size];
	}
	public void insert(long value)
	{
		this.rear=this.rear+1;
		this.queueArray[rear]=value;
		this.nItems++;
	}
	public void view() {
		System.out.println();
		System.out.print("[");
		for(int i=front;i<=rear;i++)
		{
			System.out.print(queueArray[i]+",");
		}
		System.out.print("]");
	}
	public long remove() {
		long temp=queueArray[front];
		this.front++;
		if(this.front==this.maxsize)
		{
			this.front=0;
		}
		nItems--;
		return temp;
	}
	public long peekElement() {
		return this.queueArray[front];
	}
	public boolean is_Empty() {
		return this.nItems==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queuelist list=new queuelist(10);
		list.insert(33);
		list.insert(1);
		list.insert(43);
		list.insert(3);
		System.out.println(list.peekElement());
		System.out.println(list.remove());
		System.out.println(list.peekElement());
		list.view();

	}

}
