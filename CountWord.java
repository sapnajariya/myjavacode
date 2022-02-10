package coching;

public class CountWord {


	public static void main(String[] args) {
		
		/*StringBuffer sb=new StringBuffer ("hello world");
		sb.append("Software");
		//System.out.println("String is reverse"+" "+sb.reverse());
		System.out.println(sb);*/
		int count=0;
		String s="this is a java program.java is case sensitive also java is widly use";
		String s2="java";
		
        String[] Str = s.split("[ .]+");

        for (String a : Str){
        	 
       if(s2.equals(a))
       {
    	   count++;
       }
      
       
        	
        }
        System.out.print(count); 
       	
       
      
        	
		
		
        
    }

		/*System.out.print(s.equals(s2));*/
	}
	



