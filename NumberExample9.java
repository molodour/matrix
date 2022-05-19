import java.util.Arrays;
public class NumberExample9 {

public static void main(String[] args) {
int[] shift = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    
    int temp = shift[9];
        for(int i = 9; i > 0; i--) {
        shift[i] = shift[i-1];
        }
        shift[0] = temp;
        System.out.println(Arrays.toString(shift));
    }
}