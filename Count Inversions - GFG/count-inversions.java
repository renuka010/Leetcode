//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        return mergeSort(arr,0,(int)N-1);
    }
    
    public static long mergeSort(long arr[], int l, int r){
        if(l>=r)
            return 0;
        long count=0;
        int mid=(l+r)/2;
        count+=mergeSort(arr,l,mid);
        count+=mergeSort(arr,mid+1,r);
        count+=mergeCount(arr,l,mid,r);
        return count;
    }
    
    public static long mergeCount(long[] arr, int l, int mid, int r){
        
        long[] arr1=new long[mid-l+1];
        long[] arr2=new long[r-mid];
        
        for(int i=0; i<arr1.length; i++)
            arr1[i]=arr[l+i];
            
        for(int i=0; i<arr2.length; i++)
            arr2[i]=arr[mid+1+i];
        
        int i=0, j=0, k=l;
        long count=0;
        
        while(i<arr1.length && j< arr2.length){
            if(arr1[i]<=arr2[j])
                arr[k++]=arr1[i++];
            else{
                count+=mid-i+1-l;
                arr[k++]=arr2[j++];
            }
        }
        
        while(i<arr1.length)
            arr[k++]=arr1[i++];
            
        while(j<arr2.length)
            arr[k++]=arr2[j++];
            
        return count;
    }
}