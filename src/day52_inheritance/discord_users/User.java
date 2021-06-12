package day52_inheritance.discord_users;

public class User {

    private String name;
    private String role;
    private int id;

    public User(String name, String role, int id) {

        System.out.println("3 args User constructor");
        this.name = name;
        this.role = role;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User() {
        System.out.println("User class constructor...--->Runs first<---");

    }


}
