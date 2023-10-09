public class Pattern7 {
    public static void main(String[] args) {
    /*
         *****
          ****
           ***
            **
             *
 */
        int n = 5;
        for(int row = 0; row<n; row++)
        {
            for(int s = 0; s<row; s++){
                System.out.print(" ");
            }
            for(int col = row; col<n;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i = 1; i <= n ; i++)
        // {
        //     //decreasing *
        //     for(int j = i; j<=n; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     //increasing space
        //     for(int j = 1; j<=i; j++)
        //     {
        //         System.out.print(" ");
        //     }
            
        //     System.out.println();
        // }
    }
}
