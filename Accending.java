package coching;

public class Accending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=new String("java");
char ch[]=str.toCharArray();

 
char temp;



for(int i=0;i<ch.length;i++)
{
	for(int j=i+1;j<ch.length;j++)
	{
		if(ch[i]>ch[j])
		{
			temp=ch[i];
			
			ch[i]=ch[j];
			ch[j]=temp;
			
			
		}
		
		
	
		

	}
	
			
	}
System.out.print(ch);

}
	
	
	
		
	

	}
	

