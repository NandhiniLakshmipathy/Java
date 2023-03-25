// Multidimensional Array

public class Arrays 
{
    public static void main(String[] args) 
    {
       int nums[][] = new int[3][4];
        // Assigning random values
       for(int i = 0; i<3; i++)
       {
        for(int j = 0; j<4; j++)
        {
            nums[i][j] = (int)(Math.random()*10); // randon fn gives double value. so converting it to int and also the values are less then 1 so multiplying by 10
            
        }
       }


       for(int i = 0; i<3; i++)
       {
        for(int j = 0; j<4; j++)
        {
            System.out.print(nums[i][j] + " ");
        }
        System.out.println();
       }

       System.out.println("By enhanced for loop");

       for(int n[]:nums)
       {
        for(int m : n)
        {
            System.out.print(m + " ");
        }
        System.out.println();
       }

    }    
}