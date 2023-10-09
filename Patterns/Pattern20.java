public class Pattern20 {
    public static void main(String[] args) {
        /* 
         ****
         *  *
         *  *
         *  *
         ****
        */
        int n = 5;
        for(int row = 1; row<=2*n; row++)
        {
            for(int col = 1; col<=2*n; col++)
            {
                if(row == 1 || row == 2*n || col == 1 || col == 2*n)
                {
                    System.out.print(row);
                }
                else{
                    System.out.print(n-1);
                }
            }
            System.out.println();
        }
    }
}
