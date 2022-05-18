public class NumberExample5
{  
public static void main(String[] args) {

	int[] big = new int[]{-32, 5, -23, 1, 3, 3};
	
		for (int i = 1; i < big.length; i++) {
            if(big[i - 1] < 0 && big[i] < 0 || big[i - 1] > 0 && big[i] > 0){
                System.out.println("Yes");
            break;
            } 

            else
            {
                System.out.println("No");
            break;
            }
        }
	}
}  