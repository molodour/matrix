public class NumberExample5
{  
public static void main(String[] args) {

	int[] bigger = new int[]{32, 5, 23, 1, 3, 3};
	
		for (int i=1; i < bigger.length; i++){

			if(bigger[i] == bigger[i-1]){
				
			System.out.println("yes");
			}

		}
			
	}
}  