import AppPlatform.FacebookDec;
import AppPlatform.TwitterDec;
import ConctreteComponent.Component;

public class Main {
    public static void main(String[] args) {
        Component component = new Component();
        component.Notification();
        component.SoundNotification();
        FacebookDec facebookDec = new FacebookDec();
        facebookDec.Notification();
        component.SoundNotification();
        TwitterDec twitterDec = new TwitterDec();
        twitterDec.Notification();
        component.SoundNotification();
    }
}
