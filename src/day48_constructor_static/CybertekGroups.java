package day48_constructor_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekGroups {

    public static void main(String[] args) {


        Group group1 = new Group("Cyberbugs");


        System.out.println(group1.getMembers().size());

        group1.addMember("Trump");
        group1.addMember("Clinton");
        group1.addMember("Obama");

        System.out.println(group1.getMembers());

        System.out.println(group1.getMembers().size());
        System.out.println("group1 = " + group1);

        Group group2 = new Group("CyberCats");

        group2.setMembers(new ArrayList<>(Arrays.asList("Ron","John","Don","Andrea")));

        group2.removeMember("Don");

        System.out.println(group2.getMembers());

        if (group2.getMembers().contains("Ron")) {
            System.out.println("Ron is a member of group2");
        } else {
            System.out.println("Ron is not a member of group2");

        }




    }

}
