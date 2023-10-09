public class Demo9 {
    public static void main(String[] args) {
        int n = 6;
        int[][] spiralMatrix = new int[n][n];
        int num = 1;
        int top = 0; int bottom = n-1; int left = 0; int right = n-1;
        while(top<=bottom && left<=right)
        {
            for(int i = left; i<=right; i++)
            {
                spiralMatrix[top][i] = num++;
                
            }
            top++;
            for(int i = top;i<=bottom; i++ )
            {
                spiralMatrix[i][right] = num++;
                
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiralMatrix[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiralMatrix[i][left] = num++;
                }
                left++;
        }
    }
        for(int i = 0; i<spiralMatrix.length; i++)
        {
            for(int j = 0; j<spiralMatrix[i].length; j++)
            {
                System.out.print(spiralMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

