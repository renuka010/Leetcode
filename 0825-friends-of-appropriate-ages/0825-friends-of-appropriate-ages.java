class Solution {
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int count=0, l=ages.length-1;
        
        for(int i=l; i>=0; i--){
            int x=ages[i]/2+7;
            for(int j=i-1; j>=0; j--){
                if(x<ages[j]){
                    count++;
                    if(ages[i]==ages[j])
                        count++;
                }
                else
                    break;
            }
        }
        
        return count;
    }
}