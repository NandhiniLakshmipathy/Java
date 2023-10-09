public class Pattern27 {
    public static void main(String[] args) {
    /*
         1 2 3 4  17 18 19 20
           5 6 7  14 15 16
             8 9  12 13
               10 11
 */
        int n = 4;
        int count = 1;
        for(int row = 0; row<n; row++)
        {
            for(int s = 1; s<=row; s++){
                System.out.print("  ");
            }
            for(int col = row; col<n;col++)
            {
                System.out.print(count + " ");
                count++;
                
            }
              for(int col = 1; col<=n-row; col++)
            {
                System.out.print(count+" ");   
            }
          
            System.out.println();
        }
        
    }
}

