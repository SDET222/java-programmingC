package office_hours.june28;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {


    private String body;
    private final String DATE_TIME;

   public Post(String body) {
        this.body=body;
        DATE_TIME = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDATE_TIME() {
        return DATE_TIME;
    }
}
