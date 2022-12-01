class Solution {
    public String largestNumber(int[] nums) {
        String[] list=new String[nums.length];
        for(int i=0; i<nums.length; i++)
            list[i]=Integer.toString(nums[i]);
        
        Arrays.sort(list,(a,b)->(b+a).compareTo(a+b));
        StringBuilder s=new StringBuilder();
        for(String x:list){
            if(x.equals("0")&& s.length()==0)
                continue;
            s.append(x);}
        if(s.length()==0)
            return "0";
        return s.toString();
    }
}