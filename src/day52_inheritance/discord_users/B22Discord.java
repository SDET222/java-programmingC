package day52_inheritance.discord_users;

public class B22Discord {
    public static void main(String[] args) {

     User user1 = new User();

        user1.setName("James");
        user1.setId(1234);
        user1.setRole("Student");

        Admin admin1 = new Admin();

        admin1.setId(12430);
        admin1.setName("Biden");
        admin1.setRole("President of the United states");

        System.out.println(user1);
        System.out.println(admin1);

        System.out.println("==================");

        Admin admin2 = new Admin("exPresident", 4545);

        System.out.println(admin2);


    }
}
