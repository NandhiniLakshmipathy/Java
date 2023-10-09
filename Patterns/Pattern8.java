public class Pattern8{
    public static void main(String[] args) {
        /*
            *
           ***
          *****
         *******
        *********
         */
        int n = 5;
        for(int row = 1; row <= n; row++)
        {
            int noOfSpace = n-row;
            for(int s = 1; s<=noOfSpace; s++)
            {
                System.out.print(" ");
            }
            for(int col = 1; col<row ;col++)
            {
                System.out.print("*");
            }
            for(int col = 1; col <= row; col++)
            {
                System.out.print("*");
            }
            // for(int col = 1; col <= 2*n-1; col++)
            // {
            //     System.out.print("*");
            // }
            System.out.println();
        }
        for(int row = n; row >= 1; row--)
        {
            int noOfSpace = n-row;
            for(int s = 1; s<=noOfSpace; s++)
            {
                System.out.print(" ");
            }
            for(int col = 1; col<row ;col++)
            {
                System.out.print("*");
            }
            for(int col = 1; col <= row; col++)
            {
                System.out.print("*");
            }
            // for(int col = 1; col <= 2*n-1; col++)
            // {
            //     System.out.print("*");
            // }
            System.out.println();
        }
    }
}
