package core4code14;

public class RanNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=100;
		int min=1;
		int rand=max-min+1;
		for(int i=0;i<5;i++)
		{
			int result=(int)(Math.random()*rand);
			System.out.print(result);
		}

	}

}
