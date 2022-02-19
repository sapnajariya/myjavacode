package core4code14;

public class Armstorng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int sum=0;
		int cube;
		int d;
		int temp=num;
		while(temp>0)
		{
			d=temp%10;
			cube=d*d*d;
			temp=temp/10;
			sum=sum+cube;
		}
		
if(num==sum)
{
	System.out.print("num is armstrong");
}
else {
	System.out.print("num is  not armstrong");
	
}
	}

}
