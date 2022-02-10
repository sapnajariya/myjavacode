package coching;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*int r=(int)(Math.random()*100000);	
		
			
            System.out.println(r);
}*/
	
int max = 10;
int min = 1;

int range = max - min + 1;


// generate random numbers within 1 to 10
for (int i = 0; i < 5; i++) {
    int rand = (int)(Math.random() * range) ;

    // Output is different everytime this code is executed
    System.out.print(rand);
}

}
}


