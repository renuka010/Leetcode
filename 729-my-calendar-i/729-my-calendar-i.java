class MyCalendar {
    TreeMap<Integer,Integer> map;
    public MyCalendar() {
        this.map=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        if(!map.isEmpty()){
            Map.Entry e=map.floorEntry(start);
            if(e!=null && (int)e.getValue()>start)
                return false;
            if(map.higherKey(start)!=null && map.higherKey(start)<end)
                return false;
        }
        map.put(start,end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */