package coching;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2=9,num3=8;

System.out.print("enter num");
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
if(num1<=1)
{
	System.out.print("Opreation"+" "+(num2+num3));
}

else if(num1<=2)
{
	System.out.print("Opreation"+" "+(num2-num3));
}

else if(num1<=5)
{
	System.out.print("+ Opreation"+" "+(num2*num3));
}

else if(num1<=100)
{
	System.out.print("+ Opreation"+" "+(num2%num3));
}
else
{
	System.out.print("please inter valid num");
}

	}

}
