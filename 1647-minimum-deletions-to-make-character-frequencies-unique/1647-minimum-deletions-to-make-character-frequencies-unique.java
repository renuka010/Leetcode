class Solution {
    public int minDeletions(String s) {
        int[] frequency=new int[26];
        int i, count=0, max=s.length();
        //int[] empty=new int[100000];
        
        //string frequency of all lowercase letters and sorting them
        for(i=0; i<s.length(); i++){
            frequency[s.charAt(i)-'_'-2]++;
        }
        Arrays.sort(frequency);
        
        i=25;
        while(i>=0 && frequency[i]>0){
            if(frequency[i]>max){
                count+=frequency[i]-max;
                frequency[i]=max;
            }
            max=Math.max(0,frequency[i]-1);
            i--;
        }
        
        /*
        int count=0, k=0;
        empty[0]=0;
        while(frequency[0]!=k){
            empty[k]=k++;
        }
        
        for(int i=0; i<25; i++){
            //when two number have same freq then reducing them to next maximum empty frequency
            if(frequency[i]==frequency[i+1]){
                if(frequency[i]==0)
                    continue;
                if(k!=0){
                    count+=frequency[i]-empty[k-1];
                    k--;
                }
                else
                    count+=frequency[i];
            }
            //when two numbers doesn't have same frequency finding all empty frequencies between them
            else{
                int gap=frequency[i+1]-frequency[i]-1;
                while(gap!=0){
                    empty[k++]=frequency[i]+1;
                    gap--;
                }
            }
        }*/
        return count;
    }
}