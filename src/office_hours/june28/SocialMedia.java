package office_hours.june28;

public abstract class SocialMedia {

    String personUrl;
    int accountLength;
    static String platform;

    public abstract void directMessaging(String username, String message);
    public abstract void post(String body);
    public abstract void notifications();


}
