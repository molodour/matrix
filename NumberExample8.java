import java.util.Arrays;
public class NumberExample8 {

    public static void main(String[] args) {
        
        int[] array = new int[]{1,2,3,4,5,6};
               
        for (int i = 0; i < array.length-1; i++) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp; 
            i++;
        }
        
        System.out.println(Arrays.toString(array));
    }
}