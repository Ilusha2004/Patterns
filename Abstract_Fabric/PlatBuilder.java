import Interface.IPlatform;
import Platform.AndroidPlatform12;
import Platform.IOSPlatform_13;

public class PlatBuilder{

    public static IPlatform CreatePlatform(PlatformVersion.OS OperatingSystem) throws Exception {
        switch(OperatingSystem) {
            case IOS_13:
                return new IOSPlatform_13();

            case ANDROID_12:
                return new AndroidPlatform12();

            default:
                throw new IllegalStateException("Unexpected value: " + OperatingSystem.toString());
        }

    }

}
