public class Pattern22{
    public static void main(String[] args) {
        /*
           1
           0 1
           1 0 1
           0 1 0 1
           1 0 1 0 1
         */
        int n = 5;
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= row; col++)
            {
                if((row+col) % 2 == 0)
                {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}