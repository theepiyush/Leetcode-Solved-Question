class Solution {
    public int thirdMax(int[] nums) {
        Long first=null;
        Long second=null;
        Long third=null;
        for(long num:nums)
        {
            //swap karne ke liye
            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }
            else if(first==null || num>first)
            {
                third=second;
                second=first;
                first=num;
            }
            else if(second==null || num>second)
            {
                third=second;
                second=num;
            }
            else if(third==null || num>third)
            {
                   third=num;
            }
        }
        return third==null?first.intValue(): third.intValue();
        
        
    }
}