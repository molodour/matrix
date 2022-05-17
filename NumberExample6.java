public class NumberExample6 
{  
public static void main(String[] args)   
{  
int[] num = new int[]{2, 6, 5, 9, 4};  
	for (int i =1; i <= num.length; i++){
		if (num[i-1] < num[i]){
			if(num[i] > num[i+1]){
			System.out.println(num[i]);
				}
			}	
		}		
	}
}