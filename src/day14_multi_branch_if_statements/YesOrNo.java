package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main (String [] args) {

        System.out.println("Are you sure to delete this file?");

        char selection = 'y';
        boolean answer ;
        String result;

        if (selection=='y'){
            System.out.println("Your file will be deleted");
            answer=true;
            result = "Deleted";
        } else {
            System.out.println("Select something");
            answer=false;
            result="not deleted";
        }
        System.out.println("Did file get deleted? - " + answer);



    }
}
