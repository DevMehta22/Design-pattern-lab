package Behavioral_Patterns.observer.youtube;

public class Client {
    public static void main(String[] args) {
        YoutubeChannel yt = new YoutubeChannel("Web-Dev");
        YoutubeSubscribers s1 = new YoutubeSubscribers("John");
        YoutubeSubscribers s2 = new YoutubeSubscribers("Harry");
        YoutubeSubscribers s3 = new YoutubeSubscribers("Dev");

        yt.subscribe(s1);
        yt.subscribe(s2);
        yt.subscribe(s3);
        yt.uploadVideo(); // Notify all subscribers about the video upload
        yt.unsubscribe(s2);
        yt.uploadVideo(); // Now notify only 2 subscribers about the video upload
    }
}
