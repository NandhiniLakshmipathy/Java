import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {2,12,45,11,23,5,7};
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int n = arr.length;
        int max = arr[n-1];
        if(isprime(max))
        {
            newArray.add(max);
        }
        for(int i = n-2; i>=0; i--)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                if(isprime(max))
                {
                    newArray.add(max);
                }
            }
        }
        if(newArray.isEmpty())
        {
            System.out.println("No leaders");
        }
        else{
            int[] arr1 = new int[newArray.size()];
            for(int i = 0; i<newArray.size(); i++)
                {
                    arr1[i] = newArray.get(i);
                }
            System.out.println(Arrays.toString(reverse(arr1)));
        }    
    }
    public static int[] reverse(int[] arr1) {
        int start = 0; 
        int end = arr1.length-1;
        while(start<end)
        {
            //swap
            swap(arr1,start,end);
            start++; 
            end--;
        }

        return arr1;
    }
    private static void swap(int[] arr1, int start, int end) {
        int temp = arr1[start];
        arr1[start] = arr1[end];
        arr1[end] = temp;

    }
    //is prime function
    public static boolean isprime(int ele)
    {
            boolean flag = false;
        
            for(int i = 2; i<= ele/2; i++)
            {
                if(ele%i == 0)
                {
                    flag = true;
                    break;
                }
            }
            
            if(!flag)
            {
                return true;
            }
            
        
        return false;
    }

}
