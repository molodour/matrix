public class NumberExample6 
{  
public static void main(String[] args)   
{  
int[] num = new int[] {1, 5, 1, 5, 1};  
	int pos = 0;
	for (int i =1; i < 4; i++){
		if (num[i-1] < num[i] || num[i] > num[i+1]){
			++pos;		
			
			}	
		}		
		System.out.println(pos);
	}
}