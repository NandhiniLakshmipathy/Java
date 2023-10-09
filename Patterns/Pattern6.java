public class Pattern6 {
    public static void main(String[] args) {
    /*
         *
        **
       ***
      ****
     *****
 */
        int n = 5;
        int noOfSpace;
        for(int i = 1; i <= n ; i++)
        {
            noOfSpace = n-i;
            for(int s = 1; s<=noOfSpace; s++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
