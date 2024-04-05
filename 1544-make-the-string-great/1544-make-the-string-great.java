class Solution {
    public String makeGood(String s) {
       
        return removeChar(0, new StringBuilder(s)).toString(); 
    }
    
    public StringBuilder removeChar(int pos , StringBuilder sb)
    {
        if(pos + 1 >= sb.length())
            return sb;
        
        int diff = 'A' - 'a';
        if(sb.charAt(pos) + diff == sb.charAt(pos +1) ||
            sb.charAt(pos) - diff == sb.charAt(pos +1))
            {
                sb.deleteCharAt(pos);
                sb.deleteCharAt(pos);
                if(pos >0)
                    pos--;
            }else
                pos++;
            
        sb = removeChar(pos, sb);
        return sb;
    }
}