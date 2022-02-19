package core4code14;

public class Prime {
	public static void Prinum(int num)
	{
		for(int i=1;i<=num/2;i++)
		{
			if(num%i!=0)
			
			System.out.print("num is prime"+" ");
		
		else
		
			System.out.print("num is not prime"+" ");
		
		}
		return;
	}

	public static void main(String[] args) {
		
		Prinum(21);
		

	}

}
