public class NumberExample1 
{  
public static void main(String[] args){
int[] array  = new int[] {5, 1, 365, 125, 19};       

        for(int i = 0; i < 5; i++){
            if(i % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
}   
}