import java.util.*;
public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int[] newArray = new int[n];
        int c = 1;
        int k = 1;
        for(int i = 0; i<n; i++)
        {
            if(i%2 != 0)
            {
                newArray[i] = arr[i-c];
                c++;
            }
            else{
                newArray[i] = arr[n-k];
                k = k + 1;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
