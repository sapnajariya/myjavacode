package core4code14;

public class TwoDTabl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int table[][]=new int [9][10];
		for(int row=0;row<table.length;row++)
		{
			for(int col=0;col<10;col++)
			{
				
				table[row][col]=(row+2)*(col+1);
				
				
			}
			
			
		}
		for(int row=0;row<table.length;row++)
		{
			for(int col=0;col<10;col++)
			{
				System.out.print(table[row][col]+" ");
			}
			System.out.println("");
	}
	

}

}