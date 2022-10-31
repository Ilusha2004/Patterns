package AppPlatform;

import Decorator.PlatformDecorator;

public class TwitterDec extends PlatformDecorator {
    public void Notification() {
        System.out.println("Twitter Notification");
    }

    public void SoundNotification() {
        System.out.println("Twitter Sound Notification");
    }
}
