public class Demo1{
    public static void main(String[] args) {
        int n = 5;
        int front = 0;
        int size = 2*n-1;
        int last = size-1;
        // creating an 2D array to store every hollow square
        int[][] arr = new int[size][size];
        
        //printing hollow square
        //outer loop - row
        while(n!=0){
        for(int row = front; row<=last; row++)
        {
            //inner loop
            for(int col = front; col<=last; col++)
            {
                //codition to print 1st row, col and last row col
                if(row == front || col == front|| row == last || col == last)
                {
                    //System.out.print(n); //prints 5 at all borders
                    arr[row][col] = n;
                }    
            }
            System.out.println();
        }
        n--;
        front++;
        last--;
    }
    for(int i = 0; i<size;i++)
    {
        for(int j = 0; j<size; j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

        

    }
}