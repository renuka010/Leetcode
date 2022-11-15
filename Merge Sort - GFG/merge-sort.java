//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         int[] arr1=new int[m-l+1];
         int[] arr2=new int[r-m];
         
         for(int i=0; i<arr1.length; i++){
             arr1[i]=arr[l+i];
         }
         
         for(int i=0; i<arr2.length; i++){
             arr2[i]=arr[m+1+i];
         }
         
         int i=0, j=0, k=l;
         while(i<arr1.length && j<arr2.length){
             if(arr1[i]<arr2[j])
                arr[k++]=arr1[i++];
            else
                arr[k++]=arr2[j++];
         }
         
         while(i<arr1.length){
             arr[k++]=arr1[i++];
         }
         
         while(j<arr2.length){
             arr[k++]=arr2[j++];
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l>=r)
            return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
