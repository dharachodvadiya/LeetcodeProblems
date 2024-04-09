class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int length = tickets.length;
        int time = 0;
        
        for(int i=0; i< length; i++)
        {
            if(i<=k)
            {
                if(tickets[i] <= tickets[k])
                    time += tickets[i];
                else
                    time += tickets[k];
            }else
            {
                if(tickets[i] <= tickets[k] -1)
                    time += tickets[i];
                else
                    time += (tickets[k]-1);
            }
        }
        
        return time;
    }
}