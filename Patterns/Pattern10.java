public class Pattern10{
    public static void main(String[] args) {
        /*
           *
          * *
         * * *
        * * * *
       * * * * *
         */
        int n = 5;
        for(int row = 1; row <= n-1; row++)
        {
            for(int s= 1; s<=n-row; s++)
            {
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = n; row >= 1; row--)
        {
            for(int s= 1; s<=n-row; s++)
            {
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}