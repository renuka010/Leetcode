//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends

class Tuple{
    int x, y;
    // Tuple(){
        
    // }
    Tuple(int x, int y){
        this.x=x;
        this.y=y;
    }
}


class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        Tuple[] arr=new Tuple[nums.length];
        
        for(int i=0; i<nums.length; i++){
            arr[i]=new Tuple(nums[i],i);
        }
        
        Arrays.sort(arr, (o1,o2)-> o1.x-o2.x);
        boolean visited[]= new boolean[nums.length];
        Arrays.fill(visited,false);
        int res=0;
        
        for(int i=0; i<arr.length; i++){
            if(visited[i]||arr[i].y==i)
                continue;
                
            int cycleCount=0;
            while(!visited[i]){
                visited[i]=true;
                i=arr[i].y;
                cycleCount++;
            }
            res+=(cycleCount-1);
        }
        return res;
    }
}