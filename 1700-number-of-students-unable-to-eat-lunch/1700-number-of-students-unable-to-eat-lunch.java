class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stud = new LinkedList<>();
        int length = sandwiches.length;
        
        for (Integer element : students) {
            stud.add(element);
        }
        
        int i= 0;
        while(i< length)
        {
            int s = stud.poll();
            if(s != sandwiches[i])
            {
                stud.add(s);
                for(int j= i+1; j< length; j++ )
                {
                    s = stud.poll();
                    if(s == sandwiches[i])
                        break;
                    else
                        stud.add(s);
                }
            }
            
            if(s == sandwiches[i])
                i++;
            else
                break;
        }
        
        return length-i;
    }
}