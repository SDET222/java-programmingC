package day60_exceptions;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("Throwing exceptions is not hard, lets create exceptions");
        RuntimeException e = new RuntimeException();
       // throw e;
        String userName="";
        if(userName.isEmpty()) {

            throw new RuntimeException("UserName can not be empty><");
        }




    }
}
