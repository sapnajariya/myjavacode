package core4code14;

public class Factorial {
public static void fact(int num)

{
	int result=1;
	for(int i=1;i<=num;i++)
	{
		
		result=i*result;
		
	}
	System.out.print(result);
	return;
	
	
}

	public static void main(String[] args) {
	int num=7;
	fact(num);
	

	}

}
