package AppPlatform;

import Decorator.PlatformDecorator;

public class FacebookDec extends PlatformDecorator {
    public void Notification() {
        System.out.println("Facebook Notification");
    }

    public void SoundNotification() {
        System.out.println("Facebook Sound Notification");
    }
}
