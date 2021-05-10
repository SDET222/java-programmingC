package day24_while_loop_do_while_for_loop;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {

        int seconds = 0;
        System.out.println("World's smallest cat video");
        while (seconds <= 117) {
            System.out.println("Watching video " + seconds++);
            //Thread.sleep(1000);
        }
        System.out.println("Finished watching video. Lets start another one!");

        int count = 5;

        while (count>=0 ) {
            System.out.println("count ="+count--);
            Thread.sleep(1000);
        }
        System.out.println("Finished count");

        int unreadSMS = 128;
        System.out.println("Total " + unreadSMS);
        while (unreadSMS>0) {
            System.out.println("read sms \uD83C\uDF49 # \uD83D\uDCDE" + unreadSMS--);
            Thread.sleep(200);
        }
        System.out.println("No unread sms");









    }
}
