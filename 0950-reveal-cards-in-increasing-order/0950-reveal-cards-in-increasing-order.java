class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] arr = new int[deck.length];
         int length = arr.length;
         Arrays.sort(deck);
         
         int flag = 1;
         int pos = 0;
         
         for(int i=0; i< length; )
         {
             while(true)
             {
                if(pos >= length)
                    pos = 0;
                if(arr[pos] == 0)
                    break;
                pos++;
                
             }
             
             if(flag == 1)
             {
                 arr[pos] = deck[i];
                 flag = 0;
                 i++;
             }else
             {
                 flag = 1;
             }
             
             pos++;
         }
        return arr;
    }
}