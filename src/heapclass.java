package Heap;

public class heapclass {
	private int size;
	private int heap_array[];
	public heapclass(int size)	{
		this.size=0;
		heap_array=new int[size];
	}
	public void insert(int value)
	{
		if(is_full())
		{
			throw new IndexOutOfBoundsException("Heap is full");
		}
		else {
			this.heap_array[size]=value;
			heap_insert_value(size);
			this.size++;
		}
	}
	private void heap_insert_value(int index)
	{
		/*
		 * We will perform insert operation here last element is the value to be
		 * inserted so we are naming it as newvalue;
		 * Now we will loop until we find the suitable place to set our new value
		 */
		int newvalue=this.heap_array[index];
		int current_index=index;
		while(current_index>0 && newvalue>this.heap_array[get_parent(current_index)])
		{
			//send it downwards
			heap_array[index]=this.heap_array[get_parent(current_index)];
			current_index=get_parent(current_index);
		}
		this.heap_array[current_index]=newvalue;
		
	}
	public int heap_delete(Integer index) {
		/*
		 * we will set the last element of the heap at the head/our preferred position
		 * then we will check right or left child if they are greater than parent
		 * then swap; loop will break when we cannot move further or index>heapsize
		 */
		if(index==null)
		{
			index=0;
		}
		int parent=this.get_parent(index);
		int deletedValue=this.heap_array[index];
		heap_array[index]=heap_array[size-1];
		if(index==0||heap_array[index]<heap_array[parent])
		{
			fixheap_Below(index,size-1);
		}
		else {
			this.heap_insert_value(index);
		}
		this.size--;
		return deletedValue;
		
	}
	private void fixheap_Below(int index,int lastheapElement)
	{
		/*
		 * Start from the top and check left and right loop will move until current_index<=heapsize
		 */
		int current_index=index;
		int childToSwap;
		while(current_index<=lastheapElement)
		{
			int left=get_child(current_index, true);
			int right=get_child(current_index, false);
			//if condition is met
			if(left<=lastheapElement)
			{
				if(right>lastheapElement)
				{
					childToSwap=left;
				}
				else {
					childToSwap=(heap_array[left]>heap_array[right]?left:right);//check which child is greater left or right
				}
				//now if our considered child is greater than parent
				if(heap_array[index]<heap_array[childToSwap])
				{
					int temp=heap_array[childToSwap];
					heap_array[childToSwap]=heap_array[index];
					heap_array[index]=temp;
				}
				else {
					break;
				}
				//update index or take it down
				index=childToSwap;
			}
			else {
				break;
			}
			
		}
		
	}
	public void heap_sort() {
		while(!is_empty()) {
			int value=heap_delete(null);
			System.out.print(value+"  ");
		}
	}
	public int get_child(int index,boolean left)
	{
		return 2*index+(left?1:2);
	}
	public boolean is_empty() {
		return this.size==0;
	}
	public boolean is_full() {
		return this.size==heap_array.length;
	}
	public int get_parent(int index) {
		return (index-1)/2;
	}
	public void print_heap() {
		System.out.println();
		for(int i=0;i<this.size;i++)
		{
			System.out.print(heap_array[i]+"  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		heapclass heaper=new heapclass(10);
		heaper.insert(80);
		heaper.insert(75);
		heaper.insert(60);
		heaper.insert(68);
		heaper.insert(55);
		heaper.insert(40);
		heaper.insert(52);
		heaper.insert(67);
		heaper.print_heap();
		heaper.heap_delete(1);
		heaper.print_heap();
		heaper.insert(7);
		heaper.print_heap();
		heaper.heap_sort();
	}

}
