class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        if(cost.length<=2)
        {
            if(cost.length==1)
                return cost[0];
            else
                return cost[0]+cost[1];
        }
        else
        {
        int result=0;
        int i=cost.length-1;
        while(i-1>=0)
        {
             result+=cost[i]+cost[i-1];
             i--;
             i--;
             if(i>=0)
             {
                 i--;
             }
             
        }
            if(i==0)
                result+=cost[0];
            return result;
        }
    }
}
