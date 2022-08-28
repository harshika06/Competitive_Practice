class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        for(int i=0;i<rows-1;i++)
        {
            for(int j=0;j<rows-i-1;j++)
            {
                for(int k=0;k<cols-1;k++)
                {
                    if(mat[j][k] > mat[j+1][k+1])
                    {
                        int temp = mat[j][k];
                        mat[j][k] = mat[j+1][k+1];
                        mat[j+1][k+1] = temp;
                    }
                }
            }
        }
        return mat;
    }
        
    }
