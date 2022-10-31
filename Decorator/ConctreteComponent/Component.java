package ConctreteComponent;

import Platorm.Platform;

public class Component implements Platform {

    public Component(){

    }

    @Override
    public void Notification() {
        System.out.println("Notification");
    }

    @Override
    public void SoundNotification() {
        System.out.println("Sound Notification");
    }
}
