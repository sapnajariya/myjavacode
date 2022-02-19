package core4code14;

public class ReverceDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12378965;
		int temp=0;
		int count=0;
		//checking condition till a=0
		while(a>0)
		{
		temp=a%10;
		a=a/10;
		/*count++;*/
		System.out.print(temp);
		}

	}

}
