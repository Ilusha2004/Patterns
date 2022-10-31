package Decorator;

import Platorm.Platform;

public class PlatformDecorator implements Platform {
    private Platform platform;

    PlatformDecorator(Platform platform){
        this.platform = platform;
    }

    public PlatformDecorator() {
    }

    @Override
    public void Notification() {
        platform.Notification();
    }

    @Override
    public void SoundNotification() {
        platform.SoundNotification();
    }
}
