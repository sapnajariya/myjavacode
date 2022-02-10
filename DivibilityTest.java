package coching;

public class DivibilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, count=0;
for(int i=10;i<=100;i++)
{
	if(i%7==0)
	{
		num=i;
		System.out.println(num);
		count++;
	}
	
}


System.out.print("Total num divide by 7 is"+" "+count);
	}

}
