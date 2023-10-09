import java.util.*;
public class Main {
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6};
        int N = arr.length;
        int[] newArray = new int[N];
        boolean swapped;
        do{
            swapped = false;
            for(int i = 1; i<N; i++)
            {
                if(arr[i-1]>arr[i])
                {
                    //swap
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            
        }while(swapped);
        
        int num = 1;
        int count = 1;
        System.out.println(Arrays.toString(arr));
        
        for(int i = 0; i<arr.length; i++)
        {
            if(i%2!=0)
            {
               newArray[i] = arr[i-num];// 1,3,5 -->0,1,2
                num++;
            }
            else{
                newArray[i] = arr[N-count];//5-0  6-1,6-2
                count++;
            }
            
        }
        
        System.out.println(Arrays.toString(newArray));
    }
}
