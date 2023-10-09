public class Demo3 {
    public static void main(String[] args) {
        String str = "12345";
        int n = str.length();
        for(int row = 0; row < n; row++)
        {
            for(int col = 0; col <n; col++)
            {
                if(row == col)
                {
                    System.out.print(str.charAt(row));
                }
                else if(row+col == n-1)
                {
                    System.out.print(str.charAt(col));
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
