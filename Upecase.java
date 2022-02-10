package coching;

public class Upecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("ABCddE");
System.out.print(s.toLowerCase());
char ch[]=s.toCharArray();
int ch1;

for(int i=0;i<ch.length;i++)
{
	if(ch[i]>='A'&&ch[i]<='Z')
	{
		ch1=((int)ch[i])+32;
		char ch2=(char)ch1;
		System.out.print(ch2);
		
	}
	
	
}

	}

}
