import java.util.*;



public class Demo2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int num : array2) {
            list2.add(num);
        }

        for (int num : array1) {
            if (!list2.contains(num)) {
                list2.add(num);
            }
        }
        // Convert the ArrayList back to an array
        int[] newArray2 = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            newArray2[i] = list2.get(i);
        }
        //sorting function
        int[] sortArray = bubbleSort(newArray2);

        System.out.println("Sorted and merged array: " + Arrays.toString(sortArray));
    }
    public static int[] bubbleSort(int[] arr)
    {
        boolean swapped;
        do{
            swapped = false;
            for(int i = 1; i<arr.length; i++)
            {
                if(arr[i-1]>arr[i]){
                    //swap
                    int temp = arr[i-1];//temp = a a= b b=temp
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }

        }while(swapped);
        return arr;
    }
}

