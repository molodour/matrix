public class NumberExample4
{  
public static void main(String[] args) {

	int[] bigger = new int[]{3, 5, 23, 1, 766, 3};
	int positive = 0;
		for (int i=1; i < bigger.length; i++){

			if(bigger[i] > bigger[i-1]){
				
				positive++;
			}

		}
			System.out.println(positive);
	}
}  