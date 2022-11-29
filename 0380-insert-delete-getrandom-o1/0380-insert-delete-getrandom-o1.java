class RandomizedSet {
    HashSet<Integer> map;
    Random rand;

    public RandomizedSet() {
        this.map=new HashSet<Integer>();
        this.rand=new Random();
    }
    
    public boolean insert(int val) {
        return map.add(val);
    }
    
    public boolean remove(int val) {
        return map.remove(val);
    }
    
    public int getRandom() {
        int x=rand.nextInt(map.size());
        for(Integer i:map){
            if(x==0)
                return (int)i;
            x--;
        }
        return -1;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */