package core4code14;

public class Divisiblity7 {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i<200;i++){
			if(i%7==0)
			{
				System.out.print(i+" ");
				count++;
			}
			
		}
		System.out.print("Total Divisible num= "+" "+count);
	}

}
