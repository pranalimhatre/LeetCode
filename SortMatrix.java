class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
    HashMap<Integer,PriorityQueue<Integer>> diagonalMap = new  HashMap<Integer,PriorityQueue<Integer>> ();
        
        for (int i = 0 ; i < mat.length ; i++)
        {
            for (int j = 0; j < mat[0].length ; j++)
            {
                
                diagonalMap.putIfAbsent(i-j, new PriorityQueue());
                diagonalMap.get(i-j).add(mat[i][j]);
            }
        }
        
        
        for (int i = 0 ; i < mat.length ; i++)
        {
            for (int j = 0; j < mat[0].length ; j++)
            {
               mat[i][j] =  diagonalMap.get(i-j).remove();
                
            }
        
        }
        
        return mat;
        
    }
}
