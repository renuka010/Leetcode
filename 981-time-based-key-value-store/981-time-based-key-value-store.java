class TimeMap {
    Map<String,String> map;
    Map<String,ArrayList<Integer>> time;

    public TimeMap() {
        this.map=new HashMap<>();
        this.time=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.put(key+String.valueOf(timestamp), value);
        time.put(key,time.getOrDefault(key,new ArrayList<Integer>()));
        time.get(key).add(timestamp);
    }
    
    public String get(String key, int t) {
        List<Integer> arr=time.get(key);
        if(arr==null)
            return "";
        int l=0, r=arr.size()-1, n=-1;
        while(l<=r){
            int mid=(l+r)/2;
            int x=arr.get(mid);
            if(x==t){
                n=t;
                break;
            }
            else if(x>t)
                r=mid-1;
            else
                l=mid+1;
        }
        if(n==-1){
            if(r==-1)
                return "";
            else
                n=arr.get(r);
        }
        return map.get(key+String.valueOf(n));
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */