import java.util.Arrays;

public class FindMedianTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Median Finding of two arrays");
		int[] array1 = { -5, 3, 6, 12, 15 };
        int[] array2 = { -12, -10, -6, -3, 4, 10 };
        int[] array3=new int[array1.length+array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length-1,array2.length);
        for(int i:array3)
        {
        	System.out.println(i);
        }
        
        Arrays.sort(array3);
        for(int num:array3)
        {
        	System.out.println(num);
        }

	}
	
	

}
