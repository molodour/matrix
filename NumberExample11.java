import java.util.Arrays;
public class NumberExample11 {

public static void main(String[] args) {
int[] a = new int[] {0, 0, 0, 3, 6, 6, 1};
    
 int value = 0;      

    if (a.length < 2)
    {
         value = 0;
    }else if (a[0] == a[1])
    {
         value = 0;
    }else
    {
        value = 2;
    } 

    int number = a[0];
    for (int i = a[1]; i < a.length; i++)
    {
        if (a[i] != number)
        {
             number++;
             value++;
        }
    }
        System.out.println(value) ;
    }
}