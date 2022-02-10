package coching;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		for(int i=10;i<=50;i++)
		{
			if(i%2==0)
			{
				num=num+i;
				
			}
			
		}
		System.out.print("Sum of even num"+" "+ num);

	}

}
