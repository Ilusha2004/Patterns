import Interface.IPlatform;

public class Fab {

    public static void main(String[] args) throws Exception {
        PlatBuilder builder = new PlatBuilder();
        IPlatform platform = builder.CreatePlatform(PlatformVersion.OS.IOS_13);

        platform.ACTION().getAction();
        platform.OPTIONS().GetOption();
        platform.SUPER_ACTION().GetSuperAction();
    }
}
