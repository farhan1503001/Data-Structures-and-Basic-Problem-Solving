import java.util.*;
public class BalancedStack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test_cases=sc.nextInt();
		sc.nextLine();
		
		while(test_cases>0)
		{
			Stack<Character>stack=new Stack<>();
			HashMap<Character,Character>parenthesis=new HashMap<>();
			parenthesis.put('}','{');
			parenthesis.put(']','[');
			parenthesis.put(')','(');
			boolean flag=true;
			String input=sc.nextLine();
			char brackets[]=input.toCharArray();
			for(char c:brackets)
			{
				if(c=='('|| c=='{' ||c=='[')
				{
					stack.push(c);
				}
				else {
					if(stack.isEmpty())
					{
						flag=false;
						break;
					}
					else {
						char pop=stack.pop();
						if(pop!=parenthesis.get(c))
						{
							flag=false;
							break;
						}
							
						
					}
				}
			}
			if(!flag)
			{
				System.out.println("NO");
			}
			else if(flag==true && !stack.empty())
			{
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
			test_cases--;
		}
	}

}
