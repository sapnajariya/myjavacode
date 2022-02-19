package core4code14;

public class Febonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=0;
int num2=1;
int result=13;
System.out.print(num1+" "+num2+" ");
for(int i=0;i<=result;i++)
{
	int sum=num1+num2;
	System.out.print(sum+" ");
	num1=num2;
	num2=sum;
	
}

	}

}
