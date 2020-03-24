class Solution {
    public List<Integer> partitionLabels(String S) {
      
        List<Integer> output = new ArrayList<>();
        if (S == null || S.length() == 0)
            return output;
        int [] last_Position = new int[26];
        
        // get last position of each character
        for (int i = 0; i < S.length() ; i++)
        {
            last_Position[S.charAt(i) - 'a'] = i;
        }
        
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < S.length() ; i++)
        {
            end = Math.max(end,last_Position[S.charAt(i) - 'a']);
            if (i == end)
            {
                output.add(end - start +1);
                start = end +1;
            }
            
        }
        return output;
    }
}
