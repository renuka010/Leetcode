//{ Driver Code Starts
import java.util.*;
class Heap_Sort
{
    void printArray(int arr[],int n)
    {
        //int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        Heap_Sort hs = new Heap_Sort();
        int arr[] = new int[1000000];
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
                
            Solution ob=new Solution();
            ob.heapSort(arr,n);
            hs.printArray(arr,n);
            T--;
        }
    }
    
}



// } Driver Code Ends


class Solution
{
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        // Your code here
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        int max=i;
        int left=i*2+1, right=left+1;
        
        if(left<n && arr[left]>arr[max])
            max=left;
        
        if(right<n && arr[right]>arr[max])
            max=right;
            
        if(max!=i){
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
            heapify(arr,n,max);
        }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        for(int i=(n/2)-1; i>=0; i--){
            heapify(arr, n, i);
        }
        
        for(int i=n-1; i>0; i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, i, 0);
        }
    }
 }
 
 
