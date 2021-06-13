package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {

        System.out.println(TestData.ADMIN_PASSWORD);
        //TestData.ADMIN_PASSWORD = "eee"; error
        System.out.println(TestData.ADMIN_USERNAME);
        System.out.println("TestData.MAX_WAIT_TIME = " + TestData.MAX_WAIT_TIME);

        final int SSN = 89898994;

       // SSN=495595959;  ERROR




    }
}
