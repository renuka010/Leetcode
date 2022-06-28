/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1, end=n;
        while(start<end){
            if (start==end)
                break;
            int mid=start/2+end/2;
            if(isBadVersion(mid))
                end=mid;
            else
                start=mid+1;
        }
        return end;
    }
}