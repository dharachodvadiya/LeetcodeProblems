class Solution {
    public String minRemoveToMakeValid(String s) {
       char[] arr = s.toCharArray();
        int length = s.length();
        int open = -1;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0 ; i<length; i++)
        {
            if(arr[i]=='(' && open == -1)
            {
                open = i; 
            }
             
            if(arr[i]==')' && open > -1)
            {
                
                sb.append(arr[open]);
                for(int j=open+1; j<=i; j++ )
                {
                    if(arr[j]=='(')
                    {
                        open = j; 
                        break;
                    }
                    open = -1;
                    sb.append(arr[j]);
                }
            }
            
            if(open == -1 && arr[i]!=')')
                sb.append(arr[i]);
            
        }
        
        if(open < length-1 &&open > -1)
        {
            for(int j=open+1; j< length; j++ )
            {
                if(arr[j] !='(')
                {
                    sb.append(arr[j]);
                }   
            }
        }
        
        return sb.toString(); 
    }
}