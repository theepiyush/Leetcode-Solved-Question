class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        //compare numBootles greater to numExchange then calculate newBootles
        while(numBottles>=numExchange)
        {
            //find the new bottles for exchange
            int newBottles=numBottles/numExchange;
            int remBottles=numBottles%numExchange;
            ans=ans+newBottles;
            numBottles=newBottles+remBottles;

        }
        return ans;
    }
}