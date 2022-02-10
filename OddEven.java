package coching;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,sum1=0,count=0,count1 =0;
		int avg=0,avg1=0;
for(int i=100;i<=200;i++)
{
	if(i%2==0)
	{
		sum=sum+i;
		count++;
		avg=sum/count;
		
	}
	else 
	{
		
		sum1=sum1+i;
		count1++;
		avg1=sum1/count1;
	}
}

	System.out.println("sum of even  num"+" ="+sum+" "+" average"+" "+avg);
	System.out.println("num of count"+" ="+count);
	System.out.println("sum of odd  num"+" ="+sum1+" "+" average"+" "+avg1);
	System.out.println("num of odd count"+" ="+count1);

	}

}
