class Twitter {
    List<int[]> tweets;
    HashMap<Integer,HashSet<Integer>> map;

    public Twitter() {
        tweets=new ArrayList<int []>();
        map=new HashMap<>();
    }
    
    public void addUser(int userId){
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(userId);
        map.put(userId,set);
    }
    
    public void postTweet(int userId, int tweetId) {
        tweets.add(new int[]{userId,tweetId});
        if(!map.containsKey(userId))
            addUser(userId);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        if(!map.containsKey(userId))
            addUser(userId);
        Set<Integer> set=map.get(userId);
        List<Integer> list=new ArrayList<>();
        int j=0;
        for(int i=tweets.size()-1; i>=0 && j<10; i--){
            if(set.contains(tweets.get(i)[0])){
                list.add(tweets.get(i)[1]);
                j++;
            }
        }
        return list;
    }
    
    public void follow(int followerId, int followeeId) {
        if(!map.containsKey(followerId))
            addUser(followerId);
        if(!map.containsKey(followeeId))
            addUser(followeeId);
        map.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(!map.containsKey(followerId))
            addUser(followerId);
        if(!map.containsKey(followeeId))
            addUser(followeeId);
        map.get(followerId).remove(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */