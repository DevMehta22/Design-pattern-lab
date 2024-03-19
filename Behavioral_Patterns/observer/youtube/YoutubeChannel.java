package Behavioral_Patterns.observer.youtube;

import java.util.ArrayList;
import java.util.List;


public class YoutubeChannel {
    private List<Subscribers> subscriber = new ArrayList<>();
    String channelName;
    public YoutubeChannel(String name){
        this.channelName = name;
    }
    void subscribe(Subscribers subscriber){
        System.out.println("New Subscription for "+channelName+" Channel\n");
        this.subscriber.add(subscriber);
    }
    void unsubscribe(Subscribers subscriber){
        System.out.println("Unsubscribing from "+channelName+" Channel\n");
        this.subscriber.remove(subscriber);
    }
    void notifySubscribers(){
        this.subscriber.forEach((Subscribers s)->s.update(this.channelName+" uploaded a video\n"));
    }
    void uploadVideo(){
        System.out.println("Video is uploaded on channel : "+this.channelName+"\n");
        try {
            notifySubscribers();
            System.out.println("subcribers notified successfully!\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
