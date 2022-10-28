class LRUCache {
    int capacity;
    int size;
    LinkedHashMap<Integer,Integer> map;
    
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map=new LinkedHashMap<>();
        this.size=0;
    }
    
    public int get(int key) {
        if(map.get(key)==null)
            return -1;
        int value=map.get(key);
        map.remove(key);
        map.put(key,value);
        return value;
    }
    
    public void put(int key, int value) {
        if(map.get(key)!=null){
            map.remove(key);
            map.put(key,value);
        }
        else{
            if(size==capacity)
                map.remove(remove());
            else
                size++;
            map.put(key,value);
        }
    }
    
//     public void replace(int key){
//         for(Map.Entry<Integer,Integer> e:map.entrySet()){
//            if(e.getKey()==key){
//                map.remove()
//            }
//         }
//     }
    
    public int remove(){
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            return (int)(e.getKey());
        }
        return 0;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */