package office_hours.june28;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FacebookUser extends SocialMedia implements Groups {

    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private ArrayList<Post> allPosts;
    private int numberOfGroups;

    static {
        platform = "Facebook";
    }

    public FacebookUser(String username, String password){
        this.username = username;
        setPassword(password);
        personUrl = "facebook.com/" + username;
        allPosts = new ArrayList<>();
    }

    // this() -> constructor chaining
    public FacebookUser(String username, String password, String fullName){
        this(username, password);
        setFullName(fullName);
    }

    public FacebookUser(String username, String password, String fullName, int age, int numberOfFriends){
        this(username, password, fullName);
        setAge(age);
        setNumberOfFriends(numberOfFriends);
    }

    @Override
    public void directMessage(String username, String message) {
        System.out.println(message + " was sent to " + username);
    }

    @Override
    public void directMessaging(String username, String message) {

    }

    @Override
    public void post(String body) {
        allPosts.add(new Post(body));
    }

    @Override
    public void notifications() {

    }

    @Override
    public void notification() {
        int currentHour = LocalTime.now().getHour();
        if(currentHour >= 8 && currentHour <= 17 ) {
            System.out.println("Notification");
        } else {
            System.out.println("Sleep mode");
        }
    }

    @Override
    public void joinGroup(String groupName) {
        System.out.println(getUsername() + " has joined " + groupName);
        setNumberOfGroups(getNumberOfGroups() + 1);
        //numberOfGroups++;
    }

    @Override
    public void leaveGroup(String groupName) {
        System.out.println(getUsername() + " has left " + groupName);
        setNumberOfGroups(getNumberOfGroups() - 1);
        // numberOfGroups--;
    }

    public boolean sendFriendRequest(FacebookUser other){

        boolean sent = false;

        if(this.getNumberOfFriends() < 5000 && other.getNumberOfFriends() < 5000){
            System.out.println("Friend request sent to " + other.getUsername());
            sent = true;
            this.setNumberOfFriends(this.getNumberOfFriends() + 1);
            other.setNumberOfFriends(other.getNumberOfFriends() + 1);
        } else if(this.getNumberOfFriends() == 5000){
            System.out.println("You have reached the max friend limit");
        } else {
            System.out.println(other.getUsername() + " cannot accept anymore friends");
        }

        return sent;

    }

    // Facebook user -> 4001
    // other user -> 301

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.contains(this.username)){
            System.out.println("Password contained username");
            this.password = "password";
        } else {
            this.password = password;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {

        boolean validName = true;

        for(int i = 0; i < fullName.length(); i++){

            if(fullName.charAt(i) == ' ') continue;

            if(!Character.isLetter(fullName.charAt(i))){
                validName = false;
                break;
            }
        }

        if(validName){
            this.fullName = fullName;
        } else{
            System.out.println("Invalid name");
            this.fullName = "no name";
        }

    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        if(this.numberOfFriends < 5000){
            this.numberOfFriends = numberOfFriends;
        } else {
            System.out.println("Invalid number of friends");
        }
    }

    public ArrayList<Post> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(ArrayList<Post> allPosts) {
        this.allPosts = allPosts;
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", allPosts=" + allPosts +
                '}';
    }
}