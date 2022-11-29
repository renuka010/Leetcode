class RandomizedCollection {
    HashMap<Integer,Set<Integer>> map;
    List<Integer> list;
    int n;
    Random rand;

    public RandomizedCollection() {
        map=new HashMap<>();
        list=new ArrayList<Integer>();
        n=0;
        rand=new Random();
    }
    
    public boolean insert(int val) {
        boolean res= !map.containsKey(val);
        map.putIfAbsent(val,new HashSet<Integer>());
        map.get(val).add(n);
        list.add(val);
        n++;
        return res;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        Set<Integer> set1=map.get(val);
        
        int index=set1.iterator().next();
        
        list.set(index,list.get(n-1));
        Set<Integer> set2=map.get(list.get(n-1));
        set2.remove(n-1);
        set1.remove(index);
        if(index!=n-1)
            set2.add(index);
        list.remove(n-1);
        
        if(map.get(val).size()==0)
            map.remove(val);
        
        n--;
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(n));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */