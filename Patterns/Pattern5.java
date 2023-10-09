public class Pattern5{
    public static void main(String[] args) {
        /*
           *
           **
           ***
           ****
           *****
           **** 6-5 = 1  5-2 = 3  ie. n - (row-n)
           ***
           **
           *
         */
        int n = 5;
        int colEle;
        //int count = 2;
        for(int row = 1; row <= 2*n-1; row++)
        {
            if(row<=n){
                colEle = row;
            }
            else{
                colEle = n - (row-n);
                //colEle = row-count;
                //count = count+2;
            }
            for(int col = 1; col <= colEle; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
