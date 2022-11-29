class RandomizedSet {
    HashMap<Integer,Integer> map;
    List<Integer> list;
    Random rand;
    int n;

    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
        rand=new Random();
        n=0;
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        list.add(val);
        map.put(val,n);
        n++;
        return true;
    }
    
    public boolean remove(int val) {
        int index=map.getOrDefault(val,-1);
        if(index==-1)
            return false;
        map.put(list.get(n-1),index);
        list.set(index,list.get(n-1));
        list.remove(n-1);
        n--;
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int x=rand.nextInt(n);
        return list.get(x);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */