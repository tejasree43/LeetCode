package Design;

import java.util.*;

public class Twitter {
    public int timetsamp=0;
    private Map<Integer, User> userMap;
    public Twitter() {
        userMap = new HashMap<Integer, User>();
    }

   class User{
    public int id;
    public Set<Integer> followed;

       Tweet tweet_head;

       User(int id){
       this.id=id;
       followed=new HashSet<>();
       follow(id);// first follow itself
       tweet_head=null;
       }

       private void follow(int id) {
           followed.add(id);
       }
       private void unfollow(int id) {
           followed.remove(id);
       }
       public void post(int tweetId){
           Tweet t=new Tweet(tweetId);
           t.next=tweet_head;;
           tweet_head=t;
       }

   }
    class Tweet{
        public int id;
        public int time;
        public Tweet next;
        Tweet(int id){
          this.id=id;
          time=timetsamp++;
          next=null;
        }

    }
    public void postTweet(int userId, int tweetId) {
        if(!userMap.containsKey(userId)){
            User u =new User(userId);
            userMap.put(userId,u);
        }
        userMap.get(userId).post(tweetId);
        //User userIdFromMap= userMap.get(userId).post(tweetId);
        //userIdFromMap.post(tweetId);
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result=new ArrayList<>();

          if(!userMap.containsKey(userId)){
              return result;//No user exist
          }
          //get the Users
      Set<Integer> users=userMap.get(userId).followed;

      PriorityQueue<Tweet> pq=new PriorityQueue<>(users.size(),(a,b)->(b.time-a.time));
      for(int user: users){

         Tweet t= userMap.get(user).tweet_head;

         if(t!=null){
             pq.add(t);
         }
      }
        int n=0;
        while(!pq.isEmpty()&&n<10){

          Tweet t= pq.remove();
            n++;
            result.add(t.id);
          if(t.next!=null){
              pq.add(t.next);
          }
        }
        return result;
    }

    public void follow(int followerId, int followeeId) {

        if(!userMap.containsKey(followerId)){
           User user=new User(followerId);
            userMap.put(followerId,user);
        }

        if(!userMap.containsKey(followeeId)){
            User user=new User(followeeId);
            userMap.put(followeeId,user);
        }
     userMap.get(followerId).follow(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {

        if(!userMap.containsKey(followerId)||followerId==followeeId){
            return;
        }
        userMap.get(followerId).unfollow(followeeId);
    }
    public static void main(String[] args){
    Twitter obj = new Twitter();
    obj.postTweet(1,5);
    List<Integer> getNewsFeedOutput = obj.getNewsFeed(1);
    System.out.println("getNewsFeedOutput"+getNewsFeedOutput);
    obj.follow(1,2);
    obj.postTweet(2,6);
    List<Integer> getNewsFeedOutput1 = obj.getNewsFeed(1);

     System.out.println("getNewsFeedOutput1"+getNewsFeedOutput1);

        obj.unfollow(1,2);
     List<Integer> getNewsFeedOutput2 = obj.getNewsFeed(1);
        System.out.println("getNewsFeedOutput2"+getNewsFeedOutput2);


    }
}
