public class Pattern26{
    public static void main(String[] args) {
        /*
           1 1 1 1 1 1
           2 2 2 2 2
           3 3 3 3
           4 4 4
           5 5
           6
         */
        int n = 6;
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= n-row+1; col++)
            {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}