package day52_inheritance.discord_users;

public class Admin extends User {

    public Admin(String role, int id ) {

        super("Trump", role , id);
        System.out.println("Admin class 2 args constructor");
    }

    @Override

    public String toString() {

        return "Admin{" +
                "name='" + getName() + '\'' +
                ", role='" + getRole() + '\'' +
                ", id=" + getId() +
                '}';
    }



    public Admin() {
        super(); // call super class(User) no-Args-Constructor
         System.out.println("Constructor from Admin class --->");
         //here you go. Admin class constructor will go and call

    }


}
