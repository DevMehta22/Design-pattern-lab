package Behavioral_Patterns.observer.youtube;

public class YoutubeSubscribers implements Subscribers{
    String SubscriberName;
    public YoutubeSubscribers(String name){
        this.SubscriberName = name;
    }

    public void update(String message){
        System.out.println("Message from Youtube Channel for "+SubscriberName+ ":" +message);   
    }
    
}
