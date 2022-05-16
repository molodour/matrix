public class NumberExample3 
{
	
	public static void main(String[] args) {
		
		int i = 0, count = 0;
		int[] posArr = {-10, -4, 11, -8, 22, 16, 55, 18, -60};
		
		while(i < posArr.length) 
		{
			if(posArr[i] >= 0) {
				count++;
			}
			i++;
		}
		System.out.println("\nThe Total Number of Positive Items = " + count);
	}
}